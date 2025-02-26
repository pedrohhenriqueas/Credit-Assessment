package com.example.credit_assessment_system.models;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CreateCreditDTO {

	private BigDecimal creditValue;
	private LocalDate dayFirstOfInstallment;
	private int numberOfInstallments;
	private Long customerId;

	
	public BigDecimal getCreditValue() {
		return creditValue;
	}
	public void setCreditValue(BigDecimal creditValue) {
		this.creditValue = creditValue;
	}
	
	public LocalDate getDayFirstOfInstallment() {
		return dayFirstOfInstallment;
	}
	public void setDayFirstOfInstallment(LocalDate dayFirstOfInstallment) {
		this.dayFirstOfInstallment = dayFirstOfInstallment;
	}
	public int getNumberOfInstallments() {
		return numberOfInstallments;
	}
	public void setNumberOfInstallments(int numberOfInstallments) {
		this.numberOfInstallments = numberOfInstallments;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public CreateCreditDTO(BigDecimal creditValue, LocalDate dayFirstOfInstallment, int numberOfInstallments,
			Long customerId) {
		this.creditValue = creditValue;
		this.dayFirstOfInstallment = dayFirstOfInstallment;
		this.numberOfInstallments = numberOfInstallments;
		this.customerId = customerId;
	}
}
