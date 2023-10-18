package com.mini.ass.FailurePayment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mini.ass.FailurePayment.entity.FailurePayment;

@Repository
public interface FailurePaymentRepo extends JpaRepository<FailurePayment,String> {
	List<FailurePayment> findAllByAccountNumber(String accountNumber);
}
