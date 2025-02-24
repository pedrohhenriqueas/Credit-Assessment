package com.example.credit_assessment_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.example.credit_assessment_system.entities.Customer;
import com.example.credit_assessment_system.models.CreateCustomerDTO;
import com.example.credit_assessment_system.models.MessageResponse;
import com.example.credit_assessment_system.models.UpdateCustomerDTO;
import com.example.credit_assessment_system.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@PostMapping
	public ResponseEntity<String> create(@RequestBody CreateCustomerDTO createCustomerDTO){
		String response = customerService.create(createCustomerDTO);
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Customer> getById(@PathVariable("id") Long id){
		Customer customer = customerService.findById(id);
		return ResponseEntity.ok(customer);
	}
	
	@PutMapping("/{id}")	
	public ResponseEntity<Customer> update(
			@PathVariable("id") Long id,
			@RequestBody UpdateCustomerDTO updateCustomerDTO){
		return customerService.update(id, updateCustomerDTO);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<MessageResponse> delete(@PathVariable("id") Long id){
        customerService.delete(id);
        return ResponseEntity.ok(new MessageResponse("User deleted successfully!"));
	}
}
