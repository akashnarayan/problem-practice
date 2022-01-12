package com.java.memory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestingVariablesOutputs {

	public static void main(String[] args) {
		
		int[] primitiveInt = {0,1,2};
		System.out.println(primitiveInt); //individual elements goes into stack, but the object reference is created at heap.
		
		
		char[] primitiveChar = {'a','b','c','d'};
		System.out.println(primitiveChar); 
		
		char[][] primitiveChar__ = {{'a','b','c','d'}, {'e','f','g','h'}};
		System.out.println(primitiveChar__); // strangely.....
		                                     //here the output changes to arrays object reference from characters
		                                     //as in the last 'primitiveChar' variable.
		
		Integer[] arrInt = {1,2,3};
		System.out.println(arrInt); 
		
		
		Character[] arrChar = {'A', 'B', 'C'};
		System.out.println(arrChar);
		
		
		List<Integer> l1 = Arrays.asList(10,20,30);
		System.out.println(l1);
		
		
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(40);
		l2.add(50);
		l2.add(60);
		System.out.println(l2);
		
		List<List<Integer>> nestedList = new ArrayList<List<Integer>>();
		nestedList.add(l1);
		nestedList.add(l2);
		System.out.println(nestedList);
 
	}

}
