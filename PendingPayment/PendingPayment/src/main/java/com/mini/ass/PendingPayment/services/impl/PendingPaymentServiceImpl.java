package com.mini.ass.PendingPayment.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mini.ass.PendingPayment.entity.PendingPayment;
import com.mini.ass.PendingPayment.entity.PendingPaymentDto;
import com.mini.ass.PendingPayment.entity.PendingPaymentResponse;
import com.mini.ass.PendingPayment.repository.PendingPaymentRepo;
import com.mini.ass.PendingPayment.services.PendingPaymentService;

@Service
public class PendingPaymentServiceImpl implements PendingPaymentService{
	@Autowired
	private PendingPaymentRepo repo;

	@Override
	public List<PendingPayment> findAllPendingPayment() {
		List<PendingPayment> pendingPayments=repo.findAll();
		return pendingPayments;
	}

	@Override
	public PendingPaymentResponse findAllByAccountNumber(String accountNumber) {
		List<PendingPayment> pendingPaymentsByAccount=repo.findAllByAccountNumber(accountNumber);
		List<PendingPaymentDto> payments=pendingPaymentsByAccount.stream().map(payment->new PendingPaymentDto(payment.getTransactionId(),payment.getAmount(),payment.getDate(),payment.getStatus())).collect(Collectors.toList());
		PendingPaymentResponse paymentResponse=new PendingPaymentResponse(accountNumber, payments);
		System.out.println(paymentResponse);
		return paymentResponse;
	}

}
