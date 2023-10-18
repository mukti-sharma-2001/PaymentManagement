package com.mini.ass.SuccessPayment.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="success_payments")
public class SuccessPayment {
	@Id
	private String transactionId;
	private String accountNumber;
	private String amount;
	private String date;
	private String status;
	
	public SuccessPayment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SuccessPayment(String transactionId, String accountNumber, String amount, String date, String status) {
		super();
		this.transactionId = transactionId;
		this.accountNumber = accountNumber;
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

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
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
		return "SuccessPayment [transactionId=" + transactionId + ", accountNumber=" + accountNumber + ", amount="
				+ amount + ", date=" + date + ", status=" + status + "]";
	}
	
	
	
}
