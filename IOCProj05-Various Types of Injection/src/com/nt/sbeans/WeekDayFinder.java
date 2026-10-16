package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wdf")
public class WeekDayFinder {
	//@Autowired
	private LocalDate date;
	//@Autowired
	private LocalTime Itime;
	
	//for construction injection
	public WeekDayFinder(LocalDate date,LocalTime time) {
		this.date=date;
		this.Itime=time;
		System.out.println("WeekDayFinder::2-param constructor");
	}
	
	
	
	
	
	/*//arbitrary method1
	@Autowired
	public void assingnDate(LocalDate date) {
		System.out.println("WeekDayFinder.assingnDate()");
		this.date=date;
	}
	
	//arbitrary method2
	@Autowired
	public void putClock(LocalTime time) {
		System.out.println("WeekDayFinder.putClock()");
		this.Itime=time;
	}
	*/	
	
	/*
	 //setter method
	@Autowired
	public void setDate(LocalDate date) {
		System.out.println("weedayfinder.setDate()");
		this.date=date;
	}*/
	
	
	
	//setter methods for setter Injection
	// alt +shift+s+r 
	/*@Autowired
	public void setDate(LocalDate date) {
		System.out.println("WeekDayFinder.setDate()");
		this.date = date;
	}
	
	
	
	
	@Autowired
	public void setItime(LocalTime itime) {
		System.out.println("WeekDayFinder.setItime()");
		Itime = itime;
	}
	*/




	public String showGreetingMessage(String user) {
		System.out.println("Idate::"+date+"...Itime::"+Itime);
		
		int wno=date.getDayOfWeek().getValue();
		
		if (wno>=1 && wno<=5)
			return "Happy working day mr/miss/mrs." +user;
		else
			return "Happy weekend ,Enjoy u r days Mr/Miss/Mrs."+user;
		
		
		
		
	}
		
	

}
