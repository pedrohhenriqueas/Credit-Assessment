package com.example.credit_assessment_system.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

import com.example.credit_assessment_system.enums.EStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Credit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private UUID creditCode;
	private BigDecimal creditValue;
	private LocalDate dayFirstInstallment;
	private int numberOfInstallments;
	private EStatus status;
	
	@ManyToOne
	private Customer customer;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public UUID getCreditCode() {
		return creditCode;
	}
	public void setCreditCode(UUID creditCode) {
		this.creditCode = creditCode;
	}
	public BigDecimal getCreditValue() {
		return creditValue;
	}
	public void setCreditValue(BigDecimal creditValue) {
		this.creditValue = creditValue;
	}
	public LocalDate getDayFirstInstallment() {
		return dayFirstInstallment;
	}
	public void setDayFirstInstallment(LocalDate dayFirstInstallment) {
		this.dayFirstInstallment = dayFirstInstallment;
	}
	public int getNumberOfInstallments() {
		return numberOfInstallments;
	}
	public void setNumberOfInstallments(int numberOfInstallments) {
		this.numberOfInstallments = numberOfInstallments;
	}
	public EStatus getStatus() {
		return status;
	}
	public void setStatus(EStatus status) {
		this.status = status;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Credit(Long id, UUID creditCode, BigDecimal creditValue, LocalDate dayFirstInstallment,
			int numberOfInstallments, EStatus status, Customer customer) {
		this.creditValue = creditValue;
		this.dayFirstInstallment = dayFirstInstallment;
		this.numberOfInstallments = numberOfInstallments;
		this.customer = customer;
	}
	public Credit() {
		super();
	}
	
	

}
