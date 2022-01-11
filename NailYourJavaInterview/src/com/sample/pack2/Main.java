package com.sample.pack2;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		//Direct
		Stream<String> s = Stream.of("Sonu","Monu","Chinku","Minku");
		
		//Create a Stream from other collections
		//--------------------------------------
		
		//Array
		String[][] shoppiArray =  new String[][] {{"sonu","monu"},{"chinku","minku"}};
		String[] shoppingArray =  {"Sonu","Monu","Chinku","Minku"};
		Stream<String> n = Arrays.stream(shoppingArray);
		
		 
		//Lists
		List<String> shoppingList = List.of("Sonu","Monu","Chinku","Minku");
		Stream<String> shoppingListStream = shoppingList.stream();
		
		//Map (takes Function<T,R> as input type)
		List<Integer> numbersList = List.of(1,2,3,4,5,6,7);
		Stream<Integer> numberListStream = numbersList.stream().map(i -> i*2);
		
		List<String> names = List.of("Sonu","Monu","Chinku","Minku");
		names.stream().map(name->name.toUpperCase()).forEach(System.out::println);
		
		//Stream to List
		numberListStream.collect(Collectors.toList());
		
		
		
		//Lists
		//List<String> list = 
	}

}
