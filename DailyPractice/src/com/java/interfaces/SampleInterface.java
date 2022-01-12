package com.java.interfaces;


public interface SampleInterface {
	
	default void display() {
		System.out.println("Inside SampleInterface");
	}
	
}
