package com.nt.main;

import com.nt.comps.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		System.out.println("StrategyDPTest.main()");
		Flipkart fpkt=FlipkartFactory.getInstance("dtdc");
		
		String msg=fpkt.shopping(new String[] {"shirt","trouser","watch"},new double[] {4000.0,5000.0,12000.0});
		
		System.out.println(msg);
		
		System.out.println("StrategyDPTest.main() (end)");
	}

}
