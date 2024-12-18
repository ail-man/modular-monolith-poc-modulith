package com.example.monolith.modulith.app;

import org.springframework.stereotype.Service;

import com.example.monolith.modulith.orderprocessing.Order;
import com.example.monolith.modulith.orderprocessing.OrderService;

@Service
public class Main {

	private final OrderService orderService;

	public Main(OrderService orderService) {
		this.orderService = orderService;
	}

	public String processNewOrder() {
		var order = new Order("o123", "u1", "p1");
		return orderService.processOrder(order);
	}
}