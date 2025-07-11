package com.example.Supplements.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Supplements.entity.User;
import com.example.Supplements.repository.UserRepository;

@Service
public class LoginService {

	@Autowired
	public UserRepository userRepo;

	public User authUserBySpringData(String userName, String password) {

		// List<User> userList = userRepo.findAll();
		List<User> userList = userRepo.findByUserNameAndPassword(userName, password);
		if (userList.size() == 1) {
			return userList.get(0);
		} else {
			return null;
		}

	}
}