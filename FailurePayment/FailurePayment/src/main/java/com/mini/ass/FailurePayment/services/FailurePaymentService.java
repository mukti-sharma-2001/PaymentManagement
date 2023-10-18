package com.mini.ass.FailurePayment.services;

import java.util.List;

import com.mini.ass.FailurePayment.entity.FailurePayment;
import com.mini.ass.FailurePayment.entity.FailurePaymentResponse;

public interface FailurePaymentService {
	 List<FailurePayment> findAllFailurePayment();
	 FailurePaymentResponse findAllFailureByAccountNumber(String accountNumber);
}
