package com.example.Supplements.controllers;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Supplements.entity.Users;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/Register")

public class SignUpController {
	

	@RequestMapping("/Register")
	public String signUpForm(Model m) {
//		m.addAttribute("user", new User());
		System.out.println("this is a test servie");
		return "Register";
	}
	
	@RequestMapping("/testService")
	public String testService() {
		System.out.println("this is a test servie");
		return "test";
	}

	@PostMapping("/registerUser")
    public String processRegistrationForm(@ModelAttribute("user") Users user) {
        
        System.out.println("User submitted: " + user.getFirstName() + " " + user.getLastName());
        return "login";

}
}
