package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wdf")
public class WeekDayFinder {
	
	private LocalDate date;
	
	public WeekDayFinder() {
		// TODO Auto-generated constructor stub
		System.out.println("WeekDayFinder::0-param constructor");
	}
	
	
	//setter method
	@Autowired
	public void setDate(LocalDate date) {
		System.out.println("weedayfinder.setDate()");
		this.date=date;
	}
	
	public String showGreetingMessage(String user) {
		int wno=date.getDayOfWeek().getValue();
		
		if (wno>=1 && wno<=5)
			return "Happy working day mr/miss/mrs." +user;
		else
			return "Happy weekend ,Enjoy u r days Mr/Miss/Mrs."+user;
		
		
		
		
	}
		
	

}
