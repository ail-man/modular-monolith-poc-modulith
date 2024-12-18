package com.example.monolith.modulith.usermanagement;

import lombok.Builder;

@Builder(toBuilder = true)
public record User(String id, String name) {
}
