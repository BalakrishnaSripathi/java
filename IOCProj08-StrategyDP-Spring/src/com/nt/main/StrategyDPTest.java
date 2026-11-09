package com.nt.main;

import java.lang.annotation.Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.comps.Flipkart;
import com.nt.config.AppConfig;


public class StrategyDPTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		
		Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
		
		try {
			String msg=fpkt.shopping(new String[] {"shirt","trouser","watch"},new double[] {4000.0,5000.0,12000.0});
			System.out.println(msg);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("StrategyDPTest.main() (end)");
	}

}
