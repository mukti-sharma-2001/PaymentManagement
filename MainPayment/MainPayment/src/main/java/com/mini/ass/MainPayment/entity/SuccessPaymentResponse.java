package com.mini.ass.MainPayment.entity;

import java.util.List;

public class SuccessPaymentResponse implements PaymentResponse{
	private String accountNumber;
	private List<PaymentDto> success;
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public SuccessPaymentResponse(String accountNumber, List<PaymentDto> success) {
		super();
		this.accountNumber = accountNumber;
		this.success = success;
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

	@Override
	public String toString() {
		return "SuccessPaymentResponse [accountNumber=" + accountNumber + ", success=" + success + "]";
	}
	
	

}
