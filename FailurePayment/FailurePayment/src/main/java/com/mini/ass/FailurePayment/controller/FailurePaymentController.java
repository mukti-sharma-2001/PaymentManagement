package com.mini.ass.FailurePayment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mini.ass.FailurePayment.entity.FailurePayment;
import com.mini.ass.FailurePayment.entity.FailurePaymentResponse;
import com.mini.ass.FailurePayment.services.FailurePaymentService;


@RestController
@RequestMapping
public class FailurePaymentController {
	@Autowired
	private FailurePaymentService failurePaymentService;
	@GetMapping("/backendserver3/failure")
	public ResponseEntity<List<FailurePayment>> findAllPendingPayments(){
		List<FailurePayment> failPayments=failurePaymentService.findAllFailurePayment();
		return new ResponseEntity<List<FailurePayment>>(failPayments,HttpStatus.OK);
	}
	@GetMapping("/backendserver3/failure/{accountNumber}")
	public ResponseEntity<FailurePaymentResponse> findAllPendingPaymentsByAccountNumber(@PathVariable String accountNumber){
		FailurePaymentResponse pendingPaymentsByAccount=failurePaymentService.findAllFailureByAccountNumber(accountNumber);
		return new ResponseEntity<FailurePaymentResponse>(pendingPaymentsByAccount,HttpStatus.OK);
	}
}
