package com.mini.ass.FailurePayment.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mini.ass.FailurePayment.entity.FailurePayment;
import com.mini.ass.FailurePayment.entity.FailurePaymentDto;
import com.mini.ass.FailurePayment.entity.FailurePaymentResponse;
import com.mini.ass.FailurePayment.repository.FailurePaymentRepo;
import com.mini.ass.FailurePayment.services.FailurePaymentService;

@Service
public class FailurePaymentServiceImpl implements FailurePaymentService{
	@Autowired
	private FailurePaymentRepo repo;
	@Override
	public List<FailurePayment> findAllFailurePayment() {
		List<FailurePayment> failPayments=repo.findAll();
		return failPayments;
	}

	@Override
	public FailurePaymentResponse findAllFailureByAccountNumber(String accountNumber) {
		List<FailurePayment> failurePaymentsByAccount=repo.findAllByAccountNumber(accountNumber);
		List<FailurePaymentDto> payments=failurePaymentsByAccount.stream().map(payment->new FailurePaymentDto(payment.getTransactionId(),payment.getAmount(),payment.getDate(),payment.getStatus())).collect(Collectors.toList());
		FailurePaymentResponse paymentResponse=new FailurePaymentResponse(accountNumber, payments);
		System.out.println(paymentResponse);
		return paymentResponse;
	}

	

}
