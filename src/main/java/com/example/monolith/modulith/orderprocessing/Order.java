package com.example.monolith.modulith.orderprocessing;

import lombok.Builder;

@Builder(toBuilder = true)
public record Order(String orderId, String userId, String productId) {
}
