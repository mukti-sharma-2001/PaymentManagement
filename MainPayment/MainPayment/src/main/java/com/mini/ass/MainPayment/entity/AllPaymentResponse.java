package com.mini.ass.MainPayment.entity;

import java.util.List;

public class AllPaymentResponse implements PaymentResponse{
	private String accountNumber;
	private List<PaymentDto> success;
	private List<PaymentDto> pending;
	private List<PaymentDto> failure;
	

	public AllPaymentResponse() {

	}

	public AllPaymentResponse(String accountNumber, List<PaymentDto> success, List<PaymentDto> pending,
			List<PaymentDto> failure) {
		this.accountNumber = accountNumber;
		this.success = success;
		this.pending = pending;
		this.failure = failure;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public List<PaymentDto> getSuccess() {
		return success;
	}

	public void setSuccess(List<PaymentDto> success) {
		this.success = success;
	}

	public List<PaymentDto> getPending() {
		return pending;
	}

	public void setPending(List<PaymentDto> pending) {
		this.pending = pending;
	}

	public List<PaymentDto> getFailure() {
		return failure;
	}

	public void setFailure(List<PaymentDto> failure) {
		this.failure = failure;
	}
	

}

