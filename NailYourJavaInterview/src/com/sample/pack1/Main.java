package com.sample.pack1;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> students = new ArrayList<>();
		students.add("Sonu");
		students.add("Monu");
		students.add("Chinku");
		students.add("Minku");
				
		//Consumer
		Consumer<String> printItem = s->System.out.println(s);
		students.forEach(printItem);
		
		//Function
		Function<String, Integer> function1 = s-> s.length();
		System.out.println(function1.apply("jhj"));
		Function<Integer, Integer> function = n-> n*n;
		System.out.println(function.apply(4));
		
		//Predicate
		Predicate<String> pred = s->s.contains("Tinku");
		System.out.println(pred.test("Chinku"));
		
		//Supplier
		Supplier<Double> s = () -> Math.random() * 100;
		System.out.println(s.get());
		
		

	}

}
