package com.sample.pack3;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		var orderedFoodItems = List.of("hot dogs","chips");
		var total = 38.23;
		
		//This is called Local variable type inference 
		//because we infer the 'type' from the context
		//This reduces the verbosity associated with the code. 

		//TODO Switch statement from java 14 onwards
		int stage = 2;
//		String season = switch(stage) {
//		case 1-> "Winter";
//		case 2-> "Spring";
//		case 3-> "Summer";
//		case 4-> "Autumn";
//		default-> "Invalid number";
//	};
		
//		String season = switch(stage) {
//		case 1-> "Winter";
//		case 2-> "Spring";
//		case 3-> "Summer";
//		case 4-> "Autumn";
//		default-> {
//			System.out.println("Invalid season");
//			yield "Invalid number";
//		}
//	};
		
		
		
	}

}
