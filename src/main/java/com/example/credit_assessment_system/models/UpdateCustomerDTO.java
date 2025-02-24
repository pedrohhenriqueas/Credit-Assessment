package com.example.credit_assessment_system.models;

import java.math.BigDecimal;

public class UpdateCustomerDTO {

	private Long id;
	private String firstName;
	private String lastName;
	private BigDecimal income;
	private String zipCode;
	private String street;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public BigDecimal getIncome() {
		return income;
	}
	public void setIncome(BigDecimal income) {
		this.income = income;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public UpdateCustomerDTO(Long id, String firstName, String lastName, BigDecimal income, String zipCode,
			String street) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.income = income;
		this.zipCode = zipCode;
		this.street = street;
	}
	
}
