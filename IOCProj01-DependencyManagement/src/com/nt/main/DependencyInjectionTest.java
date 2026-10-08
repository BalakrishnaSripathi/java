package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/appliactionContext.xml");
		
		//ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		Object obj =ctx.getBean("wmg");
		
		
		WishMessageGenerator generator=(WishMessageGenerator)obj;
		 
		//WishMessageGenerator generator= ctx.getBean("wmg",WishMessageGenerator.class);
				
		String msg=generator.showWishMessage("raja");
		System.out.println(msg);
		ctx.close();
	}

}
