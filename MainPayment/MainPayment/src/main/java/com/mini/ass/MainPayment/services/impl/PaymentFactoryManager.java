package com.mini.ass.MainPayment.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mini.ass.MainPayment.client.BackendClient1;
import com.mini.ass.MainPayment.client.BackendClient2;
import com.mini.ass.MainPayment.client.BackendClient3;
import com.mini.ass.MainPayment.services.MainPaymentService;
import com.mini.ass.MainPayment.utils.AppConstants;

@Service
public class PaymentFactoryManager {
	private final BackendClient1 client1;
	private final BackendClient2 client2;
	private final BackendClient3 client3;
	
	public PaymentFactoryManager(BackendClient1 client1, BackendClient2 client2, BackendClient3 client3) {
		this.client1 = client1;
		this.client2 = client2;
		this.client3 = client3;
	}

	public MainPaymentService getPaymentTypeService(String status) {
		System.out.println(" in manager");
		if(status.trim().toUpperCase().equals(AppConstants.SUCCESS)) {
			System.out.println(" in success " );
//			System.out.println(new SuccessPaymentServiceImpl());
			return new SuccessPaymentServiceImpl(client1);
		}
		else if (status.trim().toUpperCase().equals(AppConstants.PENDING)) {
			System.out.println(" in pending " );
			return new PendingPaymentServiceImpl(client2);
		}
		else if(status.trim().toUpperCase().equals(AppConstants.FAILURE)) {
			return new FailurePaymentServiceImpl(client3);
		}
		else if(status.trim().toUpperCase().equals(AppConstants.ALL)){
			return new AllPaymentServiceImpl(client1,client2,client3);
		}
		else {
			throw new IllegalArgumentException("Invalid status value: "+status);
		}
	}

}
