package com.example.Supplements.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Supplements.entity.User;



@Controller
@RequestMapping("/Login")
public class LoginController {
	
	@RequestMapping("/testService")
	public String testService() {
		System.out.println("this is a test servie");
		return "test";
	}
	
	@RequestMapping("/Login")
	public String showLogin(Model m) {
		m.addAttribute("user", new User());
		System.out.println("this is a show login servie");
		return "Login";
	}

	//@RequestMapping(path = "/authUser",method = RequestMethod.GET)
	@RequestMapping("/authUser")
	public String authenticateUser(@RequestParam("userName") String userName, @RequestParam("password") String password, Model m){
		User authUser = null;
		if(userName.equals("admin") && password.equals("admin")) {
			User loggedinUser = new User();
			loggedinUser.setFirstName("Admin");
			loggedinUser.setLastName("Admin");
			loggedinUser.setRole("ADMIN");
						
			m.addAttribute("userObj", loggedinUser);
			// getAlProductList(); //TO-DO
			//m.addAttribute("productList",)
			return "dashboard";
		}
		
		return "Login";
		
	}
}


