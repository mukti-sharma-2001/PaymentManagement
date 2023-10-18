package com.mini.ass.MainPayment.client;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mini.ass.MainPayment.entity.Payment;

import com.mini.ass.MainPayment.entity.PendingPaymentResponse;

@FeignClient(url="http://localhost:8082/backendserver2/",name="PENDING-BACKEND")
public interface BackendClient2 {
	@GetMapping("pending/{accountNumber}")
	public PendingPaymentResponse pendingTransactionWithAccount(@PathVariable String accountNumber);
}
