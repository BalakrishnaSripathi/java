package com.nt.main;

import com.nt.comps.ICar;
import com.nt.factory.CarFactory;

public class FactoryPattenTest {

	public static void main(String[] args) {
		ICar car=CarFactory.getInstace("standard");
		car.drive();

	}

}
