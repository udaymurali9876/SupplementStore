package com.example.Supplements.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Supplements.entity.User;


@Controller
@RequestMapping("/signup")
public class SignUpController {
	@RequestMapping("/register")
	public String signUpForm(Model m) {
		m.addAttribute("user", new User());
		System.out.println("this is a test servie");
		return "register";
	}
	
	@RequestMapping("/testService")
	public String testService() {
		System.out.println("this is a test servie");
		return "test";
	}

	@PostMapping("/registerUser")
    public String processRegistrationForm(@ModelAttribute("user") User user) {
        
        System.out.println("User submitted: " + user.getFirstName() + " " + user.getLastName());
        return "login";
    }
}
