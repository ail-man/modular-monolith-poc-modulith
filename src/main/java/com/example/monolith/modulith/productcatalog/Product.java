package com.example.monolith.modulith.productcatalog;

import lombok.Builder;

@Builder(toBuilder = true)
public record Product(String id, String name, double price) {
}
