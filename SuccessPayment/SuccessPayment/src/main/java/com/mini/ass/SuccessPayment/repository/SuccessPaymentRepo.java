package com.mini.ass.SuccessPayment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mini.ass.SuccessPayment.entity.SuccessPayment;

@Repository
public interface SuccessPaymentRepo extends JpaRepository<SuccessPayment, String> {
	List<SuccessPayment> findAllByAccountNumber(String accountNumber);  
}
