package com.sample.practice;

import com.java.interfaces.FourthInterface;
import com.java.interfaces.SampleInterface;
import com.java.interfaces.SomeInterface;
import com.java.interfaces.ThirdInterface;

public class Practice10Jan implements SomeInterface, SampleInterface, ThirdInterface, FourthInterface{
	
	public Practice10Jan() {
		//display();
		
	}
	
	public static void main(String[] args) {
		Practice10Jan p = new Practice10Jan();
		p.display();
	}

	//since both the interfaces have same-name default method(method with implementation), 
	//either of the method from the interfaces have to overriden in the subclass
	@Override	
	public void display() {
		System.out.println("Inside Subclass");
		SampleInterface.super.display();
		SomeInterface.super.display();
	}

	@Override
	public void someOperations() {
		
		//From inside third interface
	}

	@Override
	public void sum() {
		// It has to be overriden since it is declared as abstract method in the fourth interface.
		
	}
	
	
	
}
