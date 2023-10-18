package com.mini.ass.MainPayment.services.impl;


import org.springframework.stereotype.Service;

import com.mini.ass.MainPayment.client.BackendClient2;
import com.mini.ass.MainPayment.entity.PendingPaymentResponse;
import com.mini.ass.MainPayment.services.MainPaymentService;

@Service
public class PendingPaymentServiceImpl implements MainPaymentService{
	private final BackendClient2 client2;
	
	public PendingPaymentServiceImpl(BackendClient2 client2) {
		this.client2 = client2;
	}

	@Override
	public PendingPaymentResponse getTransactions(String accountNumber) {
//		System.out.println(" in pending ");
		PendingPaymentResponse pendingPayments=client2.pendingTransactionWithAccount(accountNumber);
		return pendingPayments;
	}

}
