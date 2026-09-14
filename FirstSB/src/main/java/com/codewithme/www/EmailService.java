package com.codewithme.www;

import org.springframework.stereotype.Component;

@Component 
public class EmailService {
	public void sendEmail(String to) {
		System.out.println("Sending email to:" + to);
	}
}