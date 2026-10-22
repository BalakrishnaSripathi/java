package com.nt.comps;

public class LuxoryCar implements ICar {
	
	public LuxoryCar(){
	System.out.println("LuxoryCar.LuxoryCar()");
	}
	
	@Override
	public void drive() {
		System.out.println("Driving standerd car(RollRoyace car)");
	}

}
