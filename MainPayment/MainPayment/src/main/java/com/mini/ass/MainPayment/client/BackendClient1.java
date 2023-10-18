package com.mini.ass.MainPayment.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mini.ass.MainPayment.entity.SuccessPaymentResponse;

@FeignClient(url="http://localhost:8081/backendserver1/",name="SUCCESS-BACKEND")
public interface BackendClient1 {
	
	@GetMapping("success/{accountNumber}")
	public SuccessPaymentResponse successTransactionWithAccount(@PathVariable String accountNumber);
}
