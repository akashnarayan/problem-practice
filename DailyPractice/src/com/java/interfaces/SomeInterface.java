package com.java.interfaces;


public interface SomeInterface {
	
	default void display() {
		System.out.println("Inside SomeInterface");
	}
	
}
