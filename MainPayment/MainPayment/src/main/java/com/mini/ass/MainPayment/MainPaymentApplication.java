package com.mini.ass.MainPayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.mini.ass.MainPayment.client.BackendClient1;
import com.mini.ass.MainPayment.client.BackendClient2;
import com.mini.ass.MainPayment.client.BackendClient3;

@SpringBootApplication
@EnableFeignClients(clients= {BackendClient1.class,BackendClient2.class,BackendClient3.class})
public class MainPaymentApplication {
	public static void main(String[] args) {
		SpringApplication.run(MainPaymentApplication.class, args);
	}

}
