package com.factory;

public class VehicleFactoryClass {

	public void applyBrakes(String vehicleType) {
		if(vehicleType=="Car") {
			new Car().brake();
		}else {
			new Bike().brake();
		}
	}
	
	
	public void getAcceleration(String vehicleType) {
		if(vehicleType=="Car") {
			new Car().accelerate();
		}else {
			new Bike().accelerate();
		}
	}
	
	
}
