package com.mini.ass.PendingPayment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mini.ass.PendingPayment.entity.PendingPayment;

@Repository
public interface PendingPaymentRepo extends JpaRepository<PendingPayment, String> {
	List<PendingPayment> findAllByAccountNumber(String accountNumber);
}
