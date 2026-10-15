package com.nt.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nt.sbeans")
public class AppConfig {
	
	public AppConfig() {
		// TODO Auto-generated constructor stub
		System.out.println("AppConfig::0-param constactor");
	}
	@Bean(name="ldate")
	public LocalDate createLocalDate() {
		System.out.println("AppConfig.createLocalDate()");
		return LocalDate.now(); 
	}

}
