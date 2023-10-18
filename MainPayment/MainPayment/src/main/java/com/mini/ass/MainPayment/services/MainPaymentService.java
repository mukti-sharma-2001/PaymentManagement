package com.mini.ass.MainPayment.services;

import java.util.List;

import com.mini.ass.MainPayment.entity.Payment;
import com.mini.ass.MainPayment.entity.PaymentDto;
import com.mini.ass.MainPayment.entity.PaymentResponse;

public interface MainPaymentService {
	PaymentResponse getTransactions(String accountNumber);

}
