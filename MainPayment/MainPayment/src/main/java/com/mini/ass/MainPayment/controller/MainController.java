package com.mini.ass.MainPayment.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mini.ass.MainPayment.client.BackendClient1;

import com.mini.ass.MainPayment.entity.PaymentResponse;
import com.mini.ass.MainPayment.services.MainPaymentService;
import com.mini.ass.MainPayment.services.impl.PaymentFactoryManager;

@RestController
public class MainController {
	
//	@GetMapping("/{accountNumber}")
//	public ResponseEntity<List<Payment>> getAllTransactions(@PathVariable String accountNumber){
//		List<Payment> transaction=service.getTransactions(accountNumber);
//		return new ResponseEntity<List<Payment>>(transaction,HttpStatus.OK);
//	}
	private final PaymentFactoryManager manager;

	public MainController(PaymentFactoryManager manager,BackendClient1 client1) {
		this.manager = manager;
	}

	@GetMapping("/transactions/{accountNumber}/{status}")
	public ResponseEntity<PaymentResponse> getAllTransactions(@PathVariable("accountNumber") String accountNumber, @PathVariable("status") String status){
		System.out.println("in "+status);
		MainPaymentService service=manager.getPaymentTypeService(status);
		System.out.println(service);
		PaymentResponse transactions=service.getTransactions(accountNumber);
		return new ResponseEntity<PaymentResponse>(transactions,HttpStatus.OK);
		
	}

}
