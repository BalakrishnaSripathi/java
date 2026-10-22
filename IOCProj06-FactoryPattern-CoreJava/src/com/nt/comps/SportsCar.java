package com.nt.comps;

public class SportsCar implements ICar {
	
	public SportsCar(){
		System.out.println("SportsCar.SportsCar()");
}
	@Override
	public void drive() {
		System.out.println("Driving standerd car(Sports car)");
	}

}
