package com.example.Supplements.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Supplements.entity.Users;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping("/testService")
	public String testService() {
		System.out.println("this is a test servie");
		return "test";
	}
	
	@RequestMapping("/login")
	public String showLogin(Model m) {
		m.addAttribute("user", new Users());
		System.out.println("this is a show login servie");
		return "login";
	}

	//@RequestMapping(path = "/authUser",method = RequestMethod.GET)
	@RequestMapping("/authUser")
	public String authenticateUser(@RequestParam("userName") String userName, @RequestParam("password") String password, Model m){
		Users authUser = null;
		if(userName.equals("admin") && password.equals("admin")) {
			Users loggedinUser = new Users();
			loggedinUser.setFirstName("Admin");
			loggedinUser.setLastName("Admin");
			loggedinUser.setSetRole("ADMIN");
						
			m.addAttribute("userObj", loggedinUser);
			// getAlProductList(); //TO-DO
			//m.addAttribute("productList",)
			return "dashboard";
		}
		
		return "login";
		
	}
}

}
