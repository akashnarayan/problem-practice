package com.pack1;

@FunctionalInterface
public interface FunctionalInterfacee {

	public abstract void doSomething();
	
	default void defaultMethod() {
		System.out.println("From Default method");
	}
	
}
