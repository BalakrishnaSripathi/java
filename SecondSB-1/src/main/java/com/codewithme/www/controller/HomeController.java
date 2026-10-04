package com.codewithme.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody	
public class HomeController {
	
	@RequestMapping("/msg")
	public String message() {
		return "I Love Spring Boot";
	}
	
	
}
