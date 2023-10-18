package com.mini.ass.PendingPayment.entity;

import java.util.List;

public class PendingPaymentResponse {
	private String accountNumber;
	private List<PendingPaymentDto> pending;
	public PendingPaymentResponse(String accountNumber, List<PendingPaymentDto> pending) {
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
	public List<PendingPaymentDto> getPending() {
		return pending;
	}
	public void setPending(List<PendingPaymentDto> pending) {
		this.pending = pending;
	}
	@Override
	public String toString() {
		return "PendingPaymentResponse [accountNumber=" + accountNumber + ", pending=" + pending + "]";
	}
	
	

}
