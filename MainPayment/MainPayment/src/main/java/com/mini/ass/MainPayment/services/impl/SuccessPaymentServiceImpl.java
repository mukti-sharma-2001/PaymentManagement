package com.mini.ass.MainPayment.services.impl;

import org.springframework.stereotype.Service;

import com.mini.ass.MainPayment.client.BackendClient1;


import com.mini.ass.MainPayment.entity.SuccessPaymentResponse;
import com.mini.ass.MainPayment.services.MainPaymentService;

@Service
public class SuccessPaymentServiceImpl implements MainPaymentService{
	private final BackendClient1 client1;
	public SuccessPaymentServiceImpl(BackendClient1 client1) {
		this.client1 = client1;
	}
	@Override
	public SuccessPaymentResponse getTransactions(String accountNumber) {
		System.out.println("in success service");
		SuccessPaymentResponse successPayments=client1.successTransactionWithAccount(accountNumber);

		return successPayments;
	}

}
