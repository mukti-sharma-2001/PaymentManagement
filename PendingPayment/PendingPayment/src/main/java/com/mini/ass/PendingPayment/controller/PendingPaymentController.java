package com.mini.ass.PendingPayment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mini.ass.PendingPayment.entity.PendingPayment;
import com.mini.ass.PendingPayment.entity.PendingPaymentResponse;
import com.mini.ass.PendingPayment.services.PendingPaymentService;

@RestController
@RequestMapping
public class PendingPaymentController {
	@Autowired
	private PendingPaymentService pendingPaymentService;
	@GetMapping("/backendserver2/pending")
	public ResponseEntity<List<PendingPayment>> findAllPendingPayments(){
		List<PendingPayment> pendingPayments=pendingPaymentService.findAllPendingPayment();
		return new ResponseEntity<List<PendingPayment>>(pendingPayments,HttpStatus.OK);
	}
	@GetMapping("/backendserver2/pending/{accountNumber}")
	public ResponseEntity<PendingPaymentResponse> findAllPendingPaymentsByAccountNumber(@PathVariable String accountNumber){
		PendingPaymentResponse pendingPaymentsByAccount=pendingPaymentService.findAllByAccountNumber(accountNumber);
		return new ResponseEntity<PendingPaymentResponse>(pendingPaymentsByAccount,HttpStatus.OK);
	}
}
