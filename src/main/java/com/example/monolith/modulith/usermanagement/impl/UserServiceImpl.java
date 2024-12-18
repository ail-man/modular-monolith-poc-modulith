package com.example.monolith.modulith.usermanagement.impl;

import org.springframework.stereotype.Service;

import com.example.monolith.modulith.usermanagement.User;
import com.example.monolith.modulith.usermanagement.UserService;

import lombok.AllArgsConstructor;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public User getUserById(String userId) {
		// In a real app, fetch from DB or external source
		return new User(userId, "Alice");
	}

}