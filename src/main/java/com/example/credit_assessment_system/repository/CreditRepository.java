package com.example.credit_assessment_system.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.credit_assessment_system.entities.Credit;

@Repository
public interface CreditRepository extends JpaRepository<Credit, Long>{

    Credit findByCustomerIdAndCreditCode(Long customerId, UUID creditCode);

    List<Credit> findByCustomerId(Long customerId);
}
