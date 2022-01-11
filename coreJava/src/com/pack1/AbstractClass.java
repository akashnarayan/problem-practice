package com.pack1;

public abstract class AbstractClass {

	int a =5;
	static int b = 10;
	
	public AbstractClass() {
		//this.a = a;
	}
	
	//public abstract void show();

	public void display() {
		System.out.println(""+b);
	}
}

class Child extends AbstractClass{

	//static int b = 8;
	//int b = 9;
	public Child() {
		super();
	}

	//@Override
//	public void show() {
//		System.out.println(""+a);
//	}
	
	public void display() {
		b++;
		System.out.println("Hello from sub-class "+b);
	}

}