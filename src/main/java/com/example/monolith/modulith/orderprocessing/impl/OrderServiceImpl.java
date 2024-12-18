package com.example.monolith.modulith.orderprocessing.impl;

import org.springframework.stereotype.Service;

import com.example.monolith.modulith.orderprocessing.Order;
import com.example.monolith.modulith.orderprocessing.OrderService;
import com.example.monolith.modulith.productcatalog.ProductService;
import com.example.monolith.modulith.usermanagement.UserService;

@Service
public class OrderServiceImpl implements OrderService {

	private final UserService userService;
	private final ProductService productService;

	public OrderServiceImpl(UserService userService, ProductService productService) {
		this.userService = userService;
		this.productService = productService;
	}

	@Override
	public String processOrder(Order order) {
		var user = userService.getUserById(order.userId());
		var products = productService.listAllProducts();
		var product = products.stream().filter(p -> p.id().equals(order.productId())).findFirst();
		return product.map(value -> ("Processing order " + order.orderId() + " for user " + user.name() + " -> Product: " + value.name()))
			.orElseGet(() -> ("Product not found for order " + order.orderId()));
	}

}