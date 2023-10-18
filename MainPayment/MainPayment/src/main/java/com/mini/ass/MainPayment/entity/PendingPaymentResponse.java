package com.mini.ass.MainPayment.entity;

import java.util.List;

public class PendingPaymentResponse implements PaymentResponse{
	private String accountNumber;
	private List<PaymentDto> pending;
	public PendingPaymentResponse(String accountNumber, List<PaymentDto> pending) {
		super();
		this.accountNumber = accountNumber;
		this.pending = pending;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public List<PaymentDto> getPending() {
		return pending;
	}
	public void setPending(List<PaymentDto> pending) {
		this.pending = pending;
	}
	@Override
	public String toString() {
		return "PendingPaymentResponse [accountNumber=" + accountNumber + ", pending=" + pending + "]";
	}
	
	

}
