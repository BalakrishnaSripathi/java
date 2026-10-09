package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;

public class DependencyInjectionTest {

	public static void main(String[] args) {
	//reate ioc container
		
	ClassPathXmlApplicationContext ctx=
			new ClassPathXmlApplicationContext("com/nt/cfgs/applicatonContext.xml");
	
	SeasonFinder finder=ctx.getBean("sf",SeasonFinder.class);
	
	String msg=finder.showSeasonName();
	System.out.println("season name::"+msg);
	ctx.close();
	}

}
