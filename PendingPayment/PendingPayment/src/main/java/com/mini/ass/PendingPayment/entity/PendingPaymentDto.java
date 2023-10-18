package com.mini.ass.PendingPayment.entity;

public class PendingPaymentDto {
	private String transactionId;
	private String amount;
	private String date;
	private String status;
	public PendingPaymentDto(String transactionId, String amount, String date, String status) {
		super();
		this.transactionId = transactionId;
		this.amount = amount;
		this.date = date;
		this.status = status;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "PendingPaymentDto [transactionId=" + transactionId + ", amount=" + amount + ", date=" + date
				+ ", status=" + status + "]";
	}
	
	
}
