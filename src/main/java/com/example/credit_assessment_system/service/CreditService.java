package com.example.credit_assessment_system.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.credit_assessment_system.entities.Credit;
import com.example.credit_assessment_system.entities.Customer;
import com.example.credit_assessment_system.models.CreateCreditDTO;
import com.example.credit_assessment_system.repository.CreditRepository;

@Service
public class CreditService {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private CreditRepository creditRepository;

	public ResponseEntity<Credit> create(CreateCreditDTO createCreditDTO){
		Credit credit = new Credit();	
		Customer customer = customerService.findById(createCreditDTO.getCustomerId());
		credit.setCreditValue(createCreditDTO.getCreditValue());
	    credit.setDayFirstInstallment(createCreditDTO.getDayFirstOfInstallment());
	    credit.setNumberOfInstallments(createCreditDTO.getNumberOfInstallments());
	    credit.setCustomer(customer);
	    creditRepository.save(credit);
	    customerService.addCredit(customer.getId(), credit);
	    
	    return ResponseEntity.ok(credit);
	}
	
	public List<Credit> findAll(){
		return creditRepository.findAll();
	}
	
	
	public ResponseEntity<Credit> findByCreditCode(Long customerId, UUID creditCode){
		Credit credit = creditRepository.findByCustomerIdAndCreditCode(customerId, creditCode);
		return ResponseEntity.ok(credit);
	}
	
	public List<Credit> findByCustomerId(Long customerId){
		return creditRepository.findByCustomerId(customerId);
	}

}
