package com.nt.comps;

public class StandardCar implements ICar {
	
	public StandardCar(){
		System.out.println("StandardCar.StandardCar()");
	}
	
	@Override
	public void drive() {
		System.out.println("Driving standerd car(Swift car)");
	}

}
