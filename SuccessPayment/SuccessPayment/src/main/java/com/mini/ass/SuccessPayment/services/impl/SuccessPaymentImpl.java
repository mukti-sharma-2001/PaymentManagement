package com.mini.ass.SuccessPayment.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mini.ass.SuccessPayment.entity.SuccessPayment;
import com.mini.ass.SuccessPayment.entity.SuccessPaymentDto;
import com.mini.ass.SuccessPayment.entity.SuccessPaymentResponse;
import com.mini.ass.SuccessPayment.repository.SuccessPaymentRepo;
import com.mini.ass.SuccessPayment.services.SuccessPaymentService;

@Service
public class SuccessPaymentImpl implements SuccessPaymentService {
	@Autowired
	private SuccessPaymentRepo successPaymentRepo;

	@Override
	public List<SuccessPayment> getAllSuccessPayment() {
		List<SuccessPayment> successPayments=successPaymentRepo.findAll();
		return successPayments;
	}

	@Override
	public SuccessPaymentResponse findAllByAccountNumber(String accountNumber) {
	
		List<SuccessPayment> successPaymentsByAccountNumber=successPaymentRepo.findAllByAccountNumber(accountNumber);
		List<SuccessPaymentDto> payments=successPaymentsByAccountNumber.stream().map(payment->new SuccessPaymentDto(payment.getTransactionId(),payment.getAmount(),payment.getDate(),payment.getStatus())).collect(Collectors.toList());
		SuccessPaymentResponse paymentResponse=new SuccessPaymentResponse(accountNumber, payments);
		System.out.println(paymentResponse);
//		return successPaymentsByAccountNumber;
		return paymentResponse;
	}

}
