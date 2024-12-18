package com.example.monolith.modulith.productcatalog.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.monolith.modulith.productcatalog.Product;
import com.example.monolith.modulith.productcatalog.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public List<Product> listAllProducts() {
		return List.of(
			new Product("p1", "Laptop", 1200.0),
			new Product("p2", "Smartphone", 799.0)
		);
	}

}