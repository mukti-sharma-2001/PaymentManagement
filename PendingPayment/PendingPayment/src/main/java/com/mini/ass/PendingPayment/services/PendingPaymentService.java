package com.mini.ass.PendingPayment.services;

import java.util.List;

import com.mini.ass.PendingPayment.entity.PendingPayment;
import com.mini.ass.PendingPayment.entity.PendingPaymentResponse;


public interface PendingPaymentService {
	 List<PendingPayment> findAllPendingPayment();
	 PendingPaymentResponse findAllByAccountNumber(String accountNumber);
}
