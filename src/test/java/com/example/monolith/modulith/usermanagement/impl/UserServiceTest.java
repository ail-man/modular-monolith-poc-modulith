package com.example.monolith.modulith.usermanagement.impl;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.modulith.test.ApplicationModuleTest;

import com.example.monolith.modulith.usermanagement.User;
import com.example.monolith.modulith.usermanagement.UserService;

@ApplicationModuleTest
class UserServiceTest {

	@Autowired
	private UserService userService;

	@Test
	void testGetUser() {
		final User user = userService.getUserById("10");
		assertThat(user.id()).isEqualTo("10");
		assertThat(user.name()).isEqualTo("Alice");
	}
}
