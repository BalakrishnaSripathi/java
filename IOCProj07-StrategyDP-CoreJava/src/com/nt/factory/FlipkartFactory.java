package com.nt.factory;

import com.nt.comps.BlueDart;
import com.nt.comps.DTDC;
import com.nt.comps.Flipkart;
import com.nt.comps.ICourier;

public class FlipkartFactory {
	
	public static Flipkart getInstance(String courierName) {
		System.out.println("FlipkartFactory.getInstance()");
		ICourier courier=null;
		if (courierName.equalsIgnoreCase("dtdc"))
			courier=new DTDC();
		else if (courierName.equalsIgnoreCase("bDart"))
			courier = new BlueDart();
		else
			throw new IllegalArgumentException("Invalid courier name");
		
		Flipkart fpkt=new Flipkart();
		
		fpkt.setCourier(courier);
		return fpkt;
		
	}

}
