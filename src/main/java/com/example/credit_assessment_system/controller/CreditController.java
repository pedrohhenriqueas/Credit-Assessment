package com.example.credit_assessment_system.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.credit_assessment_system.entities.Credit;
import com.example.credit_assessment_system.models.CreateCreditDTO;
import com.example.credit_assessment_system.service.CreditService;

@RestController
@RequestMapping("/credit")
public class CreditController {
	
	@Autowired
	private CreditService creditService;

	@GetMapping
	public List<Credit> findByCustomerId(@RequestParam Long customerId) {
		return creditService.findByCustomerId(customerId);
	}
	
	@PostMapping
	public ResponseEntity<Credit> create(@RequestBody CreateCreditDTO createCreditDTO){
		return creditService.create(createCreditDTO);
	}
	
	@PostMapping("/credit-code")
	public ResponseEntity<Credit> findByCreditCode(
			@RequestParam Long customerId, 
			@RequestParam UUID creditCode){
		return creditService.findByCreditCode(customerId, creditCode);
	}
}
