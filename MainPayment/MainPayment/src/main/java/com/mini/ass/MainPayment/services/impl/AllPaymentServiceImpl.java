package com.mini.ass.MainPayment.services.impl;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.mini.ass.MainPayment.client.BackendClient1;
import com.mini.ass.MainPayment.client.BackendClient2;
import com.mini.ass.MainPayment.client.BackendClient3;
import com.mini.ass.MainPayment.entity.AllPaymentResponse;
import com.mini.ass.MainPayment.entity.FailurePaymentResponse;
import com.mini.ass.MainPayment.entity.PaymentDto;
import com.mini.ass.MainPayment.entity.PendingPaymentResponse;

import com.mini.ass.MainPayment.entity.SuccessPaymentResponse;
import com.mini.ass.MainPayment.services.MainPaymentService;
import com.mini.ass.MainPayment.utils.AppConstants;

@Service

public class AllPaymentServiceImpl implements  MainPaymentService{
	
	private final BackendClient1 client1;
	private final BackendClient2 client2;
	private final BackendClient3 client3;
	
	
	
	public AllPaymentServiceImpl(BackendClient1 client1, BackendClient2 client2, BackendClient3 client3) {
		super();
		this.client1 = client1;
		this.client2 = client2;
		this.client3 = client3;
	}
	public AllPaymentResponse getTransactions( String accountNumber )
	{
		AllPaymentResponse allPaymentResponse=new AllPaymentResponse();
		CompletableFuture<List<PaymentDto>> future1=CompletableFuture.supplyAsync(()->client1.successTransactionWithAccount(accountNumber).getSuccess());
		CompletableFuture<List<PaymentDto>> future2=CompletableFuture.supplyAsync(()->client2.pendingTransactionWithAccount(accountNumber).getPending());
		CompletableFuture<List<PaymentDto>> future3=CompletableFuture.supplyAsync(()->client3.failureTransactionWithAccount(accountNumber).getFailure());
		CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(future1, future2,future3);
		try {
			combinedFuture.get();
		}catch(Exception e) {
			e.printStackTrace();
		}
		List<PaymentDto> combinedTransactions = Stream.of(future1, future2, future3)
                .map(CompletableFuture::join)
                .flatMap(List::stream)
                .collect(Collectors.toList());
		List<PaymentDto> success=combinedTransactions.stream().filter(p->p.getStatus().trim().toUpperCase().equals(AppConstants.SUCCESS))
				.collect(Collectors.toList());
		List<PaymentDto> pending=combinedTransactions.stream().filter(p->p.getStatus().trim().toUpperCase().equals(AppConstants.PENDING))
				.collect(Collectors.toList());
		List<PaymentDto> failure=combinedTransactions.stream().filter(p->p.getStatus().trim().toUpperCase().equals(AppConstants.FAILURE))
				.collect(Collectors.toList());
		allPaymentResponse.setAccountNumber(accountNumber);
		allPaymentResponse.setSuccess(success);
		allPaymentResponse.setPending(pending);
		allPaymentResponse.setFailure(failure);
		return allPaymentResponse;
	}
}
