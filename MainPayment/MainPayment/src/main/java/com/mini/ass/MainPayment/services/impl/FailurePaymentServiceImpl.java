package com.mini.ass.MainPayment.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mini.ass.MainPayment.client.BackendClient3;

import com.mini.ass.MainPayment.entity.FailurePaymentResponse;
import com.mini.ass.MainPayment.entity.Payment;
import com.mini.ass.MainPayment.services.MainPaymentService;

@Service
public class FailurePaymentServiceImpl implements MainPaymentService{
	private final BackendClient3 client3;
	

	public FailurePaymentServiceImpl(BackendClient3 client3) {
		this.client3 = client3;
	}


	@Override
	public FailurePaymentResponse getTransactions(String accountNumber) {
//		System.out.println(" in fail ");
		FailurePaymentResponse failedPayments=client3.failureTransactionWithAccount(accountNumber);
		return failedPayments;
	}

}
