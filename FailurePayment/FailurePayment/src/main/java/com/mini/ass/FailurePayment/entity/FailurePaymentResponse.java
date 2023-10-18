package com.mini.ass.FailurePayment.entity;

import java.util.List;

public class FailurePaymentResponse {
	private String accountNumber;
	private List<FailurePaymentDto> failure;
	public FailurePaymentResponse(String accountNumber, List<FailurePaymentDto> failure) {
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
	public List<FailurePaymentDto> getFailure() {
		return failure;
	}
	public void setFailure(List<FailurePaymentDto> failure) {
		this.failure = failure;
	}
	

}
