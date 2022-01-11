package com.factory;

public class Bike implements Vehicle{

	@Override
	public void accelerate() {
		System.out.println("Accelerate the bike using the hand throttle");
	}

	@Override
	public void brake() {
		System.out.println("Press the break using the hand");
	}

}