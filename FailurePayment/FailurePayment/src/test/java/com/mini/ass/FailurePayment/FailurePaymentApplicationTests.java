package com.mini.ass.FailurePayment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.mini.ass.FailurePayment.entity.FailurePayment;
import com.mini.ass.FailurePayment.repository.FailurePaymentRepo;
import com.mini.ass.FailurePayment.services.FailurePaymentService;


@SpringBootTest
class FailurePaymentApplicationTests {
	@MockBean
	private FailurePaymentRepo repo;
	@Autowired
	private FailurePaymentService service; 
	@Test
	void contextLoads() {
	}
	@Test
	public void findAllFailurePaymentTest() {
		when(repo.findAll()).thenReturn(Stream.of(new FailurePayment("12","1","500","20-03-2023","success"),new FailurePayment("321","1","300","20-04-2023","success")).collect(Collectors.toList()));
		assertEquals(2,service.findAllFailurePayment().size());
	}

}
