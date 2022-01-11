package com.factory;

public class Car implements Vehicle{

	@Override
	public void accelerate() {
		System.out.println("Press accelerator using the foot");
	}

	@Override
	public void brake() {
		System.out.println("Apply brake using the foot");
	}

	
	
}