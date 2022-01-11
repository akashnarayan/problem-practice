package com.pack1;

public class SamplClass {

	public static void main(String[] args) {
		
		//FunctionalInterfacee f = ()->System.out.println("Hello");
		//f.doSomething();
		//f.defaultMethod();

		String s = "abababababa";
		long occurence = s.replaceAll("ba", "0").chars().filter(c-> (char)c == '0').count();
		System.out.println(occurence);
		
		
		
	}

}
