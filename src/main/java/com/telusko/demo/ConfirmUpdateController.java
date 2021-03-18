package com.telusko.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConfirmUpdateController {

	@RequestMapping("confirmUpdate")
	public String user() {	
		return "confirmUpdate";
	}
	
}
