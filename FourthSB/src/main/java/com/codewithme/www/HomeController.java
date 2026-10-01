package com.codewithme.www;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/msg")
	public String home() {
		return "I Love Spring Boot";
	}

}
