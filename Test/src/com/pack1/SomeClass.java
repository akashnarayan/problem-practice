package com.pack1;

public class SomeClass {

	private static void call(String b) {
		//b = 5;
		System.out.println(b.hashCode());
	}
	
	public static void main(String[] args) {
		String b = "k";
		call(b);
		System.out.println("After call() : "+b.hashCode());
	}



}
