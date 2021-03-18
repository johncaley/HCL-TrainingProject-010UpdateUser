package com.telusko.demo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {
	
	private UserRepository repo;
		
	@RequestMapping("user")
	public String user() {	
		return "user";
	}
	
	@RequestMapping("updateUserInfo")
	public String updateUserInfo(@RequestParam User user,
			String username,
			String address,
			String city,
			String state,
			String zipcode,
			String phone,
			String email,
			HttpSession session
			) {
		
		user.setUsername(username);
		user.setAddress(address);
		user.setCity(city);
		user.setState(state);
		user.setZipcode(zipcode);
		user.setPhone(phone);
		user.setEmail(email);
		
		user = repo.save(user);
		
		session.setAttribute("User", user);
		
		return "confirmUpdate";
	}
}
