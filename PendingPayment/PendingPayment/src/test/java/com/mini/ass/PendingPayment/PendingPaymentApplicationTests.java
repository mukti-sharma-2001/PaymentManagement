package com.mini.ass.PendingPayment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.mini.ass.PendingPayment.entity.PendingPayment;
import com.mini.ass.PendingPayment.entity.PendingPaymentDto;
import com.mini.ass.PendingPayment.entity.PendingPaymentResponse;
import com.mini.ass.PendingPayment.repository.PendingPaymentRepo;
import com.mini.ass.PendingPayment.services.PendingPaymentService;

@SpringBootTest
class PendingPaymentApplicationTests {
	@Autowired
	private PendingPaymentService service;
	@MockBean
	private PendingPaymentRepo repo; 
	@Test
	void contextLoads() {
	}
	@Test
	public void findAllPendingPaymentTest() {
		when(repo.findAll()).thenReturn(Stream.of(new PendingPayment("12","1","500","20-03-2023","pending"),new PendingPayment("321","1","300","20-04-2023","pending")).collect(Collectors.toList()));
		assertEquals(2,service.findAllPendingPayment().size());
		
	}

}
