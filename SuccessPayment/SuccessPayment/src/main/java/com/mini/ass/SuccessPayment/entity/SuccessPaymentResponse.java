package com.mini.ass.SuccessPayment.entity;

import java.util.List;

public class SuccessPaymentResponse {
	private String accountNumber;
	private List<SuccessPaymentDto> success;
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public SuccessPaymentResponse(String accountNumber, List<SuccessPaymentDto> success) {
		super();
		this.accountNumber = accountNumber;
		this.success = success;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public List<SuccessPaymentDto> getSuccess() {
		return success;
	}
	public void setSuccess(List<SuccessPaymentDto> success) {
		this.success = success;
	}

	@Override
	public String toString() {
		return "SuccessPaymentResponse [accountNumber=" + accountNumber + ", success=" + success + "]";
	}
	
	

}
