package com.codewithme.www;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSbApplication {

	public static void main(String[] args) {
     ApplicationContext  context  = SpringApplication.run(FirstSbApplication.class, args);
		
		UserService userService =context.getBean(UserService.class);
		
		userService.registerUser("Balu@gmail.com");
	}

}
