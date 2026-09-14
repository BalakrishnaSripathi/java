package com.codewithme.www;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
	
	private final EmailService emailService;
	
	@Autowired
	public UserService(EmailService emailService) {
		this.emailService = emailService;
	}
	
	public void registerUser(String email) {
		System.out.println("User Registered!");
		emailService.sendEmail(email);
	}
}