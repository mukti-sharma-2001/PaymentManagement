package com.mini.ass.SuccessPayment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mini.ass.SuccessPayment.entity.SuccessPayment;
import com.mini.ass.SuccessPayment.entity.SuccessPaymentResponse;
import com.mini.ass.SuccessPayment.services.SuccessPaymentService;

@RestController
@RequestMapping
public class SuccessPaymentController {
	@Autowired
	private SuccessPaymentService successPaymentService;
	@GetMapping("/backendserver1/success")
	public ResponseEntity<List<SuccessPayment>> getAllSuccessPayment(){
		List<SuccessPayment> payments=successPaymentService.getAllSuccessPayment();
		payments.forEach((p)-> System.out.println(p));
		return new ResponseEntity<List<SuccessPayment>>(payments,HttpStatus.OK);
	}
	@GetMapping("/backendserver1/success/{accountNumber}")
	public ResponseEntity<SuccessPaymentResponse> getAllSuccessPaymentByAccountNumber(@PathVariable String accountNumber){
		SuccessPaymentResponse paymentsByAccount=successPaymentService.findAllByAccountNumber(accountNumber);
//		paymentsByAccount.forEach((p)-> System.out.println(p));
		return new ResponseEntity<SuccessPaymentResponse>(paymentsByAccount,HttpStatus.OK);
	}
	

}
