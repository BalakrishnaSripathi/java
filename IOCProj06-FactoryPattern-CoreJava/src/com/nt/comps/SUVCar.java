package com.nt.comps;

public class SUVCar implements ICar {
	
	public SUVCar(){
		System.out.println("SUVCar.SUVCar()");
	}
	@Override
	public void drive() {
		System.out.println("Driving standerd car(SUV)");
	}

}
