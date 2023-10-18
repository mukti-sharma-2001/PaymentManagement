package com.mini.ass.MainPayment.client;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mini.ass.MainPayment.entity.FailurePaymentResponse;
import com.mini.ass.MainPayment.entity.Payment;

@FeignClient(url="http://localhost:8083/backendserver3/",name="FAILURE-BACKEND")
public interface BackendClient3 {
	@GetMapping("failure/{accountNumber}")
	public FailurePaymentResponse failureTransactionWithAccount(@PathVariable String accountNumber);

}
