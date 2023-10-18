package com.mini.ass.SuccessPayment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.mini.ass.SuccessPayment.entity.SuccessPayment;
import com.mini.ass.SuccessPayment.repository.SuccessPaymentRepo;
import com.mini.ass.SuccessPayment.services.SuccessPaymentService;

@SpringBootTest
class SuccessPaymentApplicationTests {
	@MockBean
	private SuccessPaymentRepo repo;
	@Autowired
	private SuccessPaymentService service;
	@Test
	void contextLoads() {
	}
	@Test
	public void findAllSuccessPaymentTest() {
		when(repo.findAll()).thenReturn(Stream.of(new SuccessPayment("12","1","500","20-03-2023","success"),new SuccessPayment("321","1","300","20-04-2023","success")).collect(Collectors.toList()));
		assertEquals(2,service.getAllSuccessPayment().size());
	}

}
