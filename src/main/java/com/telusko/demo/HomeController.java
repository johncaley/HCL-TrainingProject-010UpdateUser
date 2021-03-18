package com.telusko.demo;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	private UserRepository repo;
	
	@RequestMapping("home")
	public String home() {		
		return "home";
	}
	
	@RequestMapping("getUserInfo")
	public String getUserInfo(@RequestParam String userID, HttpSession session) {
		
		User user = new User(userID);
		
		user = repo.findById(Integer.parseInt(userID));
		
		session.setAttribute("User", user);
		
		if (user.getUsername() == null) {
			return "error";
		}
		else {
			return "user";
		}
		
	}
	
}
