package com.example.credit_assessment_system.models;

import java.math.BigDecimal;

public class CreateCustomerDTO {

	private String firstName;
	private String lastName;
	private String cpf;
	private BigDecimal income;
	private String email;
	private String password;
	private String zipCode;
	private String street;
	
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public BigDecimal getIncome() {
		return income;
	}
	public void setIncome(BigDecimal income) {
		this.income = income;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public CreateCustomerDTO(String firstName, String lastName, String cpf, BigDecimal income, String email, String password,
			String zipCode, String street) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.cpf = cpf;
		this.income = income;
		this.email = email;
		this.password = password;
		this.zipCode = zipCode;
		this.street = street;
	}
	public CreateCustomerDTO() {
		super();
	}
	
}
