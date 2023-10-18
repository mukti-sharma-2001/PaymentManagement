package com.mini.ass.MainPayment.entity;

import java.util.List;

public class FailurePaymentResponse implements PaymentResponse{
	private String accountNumber;
	private List<PaymentDto> failure;
	public FailurePaymentResponse(String accountNumber, List<PaymentDto> failure) {
		super();
		this.accountNumber = accountNumber;
		this.failure = failure;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public List<PaymentDto> getFailure() {
		return failure;
	}
	public void setFailure(List<PaymentDto> failure) {
		this.failure = failure;
	}
	

}
