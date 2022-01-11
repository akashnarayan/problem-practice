package com.factory;

public class SampleClass {

	public static void main(String[] args) {


		VehicleFactoryClass factory = new VehicleFactoryClass();
		
		factory.applyBrakes("Bike");
		
		factory.applyBrakes("Car");
		
		
	}

}
