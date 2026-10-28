package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {
	
	private ICourier courier;
	
	public Flipkart() {
		System.out.println("Flipkart::0-param constructor");
	}
	
	public void setCourier(ICourier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier=courier;
	}
	public String shopping(String [] items,double [] prices ) {
		
		System.out.println("Flipkart.shopping()");
		double billamt=0.0;
		for(double p:prices)
			billamt = billamt+p;
		
		Random rand =new Random();
		int oid=rand.nextInt(10000);
		
		String msg=courier.deliver(oid);
		
		return Arrays.toString(items)+"are purchased having prices:"+Arrays.toString(prices)+"with bill amount"+billamt+".."+msg;
		
		
	}
}
