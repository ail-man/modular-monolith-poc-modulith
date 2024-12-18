package com.example.monolith.modulith.app;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MainTest {

	@Autowired
	private Main target;

	@Test
	void testProcessNewOrder() {
		final String result = target.processNewOrder();
		assertThat(result).isEqualTo("Processing order o123 for user Alice -> Product: Laptop");
	}
}
