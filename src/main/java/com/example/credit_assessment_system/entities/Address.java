package com.example.credit_assessment_system.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

	private String zipCode;
	private String street;
	
	public String getZipCode() {
		return zipCode;
	}
	public String getStreet() {
		return street;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Address(String zipCode, String street) {
		super();
		this.zipCode = zipCode;
		this.street = street;
	}
	public Address() {
		super();
	}
	
	
}
