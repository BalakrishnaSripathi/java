package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WeekDayFinder;

public class DependencyInjectionTest { 

	public static void main(String[] args) {
		//ioc container
		
		AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		WeekDayFinder wdf=ctx.getBean("wdf",WeekDayFinder.class);
		
		String msg=wdf.showGreetingMessage("rani");
		System.out.println("result::"+msg);
		ctx.close();
		
	}

}
