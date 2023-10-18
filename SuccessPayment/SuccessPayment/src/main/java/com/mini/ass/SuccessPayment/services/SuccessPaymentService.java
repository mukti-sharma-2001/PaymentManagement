package com.mini.ass.SuccessPayment.services;

import java.util.List;

import com.mini.ass.SuccessPayment.entity.SuccessPayment;
import com.mini.ass.SuccessPayment.entity.SuccessPaymentResponse;

public interface SuccessPaymentService {
	List<SuccessPayment> getAllSuccessPayment();
	SuccessPaymentResponse findAllByAccountNumber(String accountNumber);
}
