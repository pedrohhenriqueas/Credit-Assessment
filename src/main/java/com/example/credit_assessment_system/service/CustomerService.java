package com.example.credit_assessment_system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.credit_assessment_system.entities.Address;
import com.example.credit_assessment_system.entities.Credit;
import com.example.credit_assessment_system.entities.Customer;
import com.example.credit_assessment_system.exceptions.NotFoundEntityException;
import com.example.credit_assessment_system.models.CreateCustomerDTO;
import com.example.credit_assessment_system.models.UpdateCustomerDTO;
import com.example.credit_assessment_system.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer findById(Long id) {
        Optional<Customer> customer = this.customerRepository.findById(id);
        if (!customer.isPresent()) {
            throw new NotFoundEntityException("Usuário não foi encontrado.");
        }
		
		return customer.get();
	}
	
	public String create(CreateCustomerDTO createDTO) {
		Address address = new Address(createDTO.getStreet(), 
									  createDTO.getZipCode());	
		
		Customer customer = new Customer(createDTO.getFirstName(), 
										 createDTO.getLastName(), 
										 createDTO.getCpf(),
										 createDTO.getIncome(),
										 createDTO.getEmail(),
										 createDTO.getPassword(), 
										 address);
		customerRepository.save(customer);
		
		return "Cliente cadastrado com sucesso";
	}
	
	public ResponseEntity<Customer> update(Long id, UpdateCustomerDTO updateCustomerDTO){
		Customer customer = findById(id);
		customer.setFirstName(updateCustomerDTO.getFirstName());
		customer.setLastName(updateCustomerDTO.getLastName());
		customer.setIncome(updateCustomerDTO.getIncome());
		customer.getAddress().setStreet(updateCustomerDTO.getStreet());
		customer.getAddress().setZipCode(updateCustomerDTO.getZipCode());
		customerRepository.save(customer);
		
		return ResponseEntity.ok(customer);
	}
	
	public void addCredit(Long customerId, Credit credit) {
		Customer customer = findById(customerId);
		customer.getCredits().add(credit);
	}
	
	public void delete(Long id) {
		customerRepository.deleteById(id);
	}
	
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	
}
