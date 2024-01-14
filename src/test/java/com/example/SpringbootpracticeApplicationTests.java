package com.example;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.services.PaymentServicesImpl;

@SpringBootTest
class SpringbootpracticeApplicationTests {

	@Autowired
	PaymentServicesImpl servicesImpl;

	@Test
	void testDepedencyInjection() {
		assertNotNull(servicesImpl.getPaymentsDAO());
		
	}

}
