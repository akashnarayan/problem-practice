package com.sample.practice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/**
 * <b>Problem 1</b>: Implement a stack
 * </br>
 * <b>Problem 2</b>: Implement a Queue using
 * </br> 
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 * (i) using LinkedList implementation and 
 * </br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 * (ii) using Priority queue
 * </br>
 * <b>Problem 3</b>: Hash based Data structures implementation : 
 * </br><b>HashTable</b> - <i>Synchronized and doesn't allow null key</i> 
 * </br><b>HashSet</b> - <i>doesn't allow Duplicates</i>  
 * </br><b>HashMap</b> - <i>most flexible and better performance but not thread safe 
 * (but not synchronized, allows duplicates values and one null key)</i> 
 * 
 * 
 ***/
public class Practice5Jan {

	public static void main(String[] args) {
		problem2();

	}
	
	private static void problem4() {
		
	}
	
	private static void problem1() {
		Stack<String> stackToReverse = new Stack<String>();
		
		String tc1 = "tenet";
		String tc2 = "kutta";
		
		Arrays.asList(tc1.split("")).stream().forEach(a->stackToReverse.push(a));
		while(!stackToReverse.empty()) {
			System.out.print(stackToReverse.pop());
		}
		
		stackToReverse.clear();
		System.out.println("\n");
		
		Arrays.asList(tc2.split("")).stream().forEach(a->stackToReverse.push(a));
		while(!stackToReverse.empty()) {
			System.out.print(stackToReverse.pop());
		}
		
		
	}
	
	private static void problem2() {
		String tc1="mikka";
		String tc2="kutta";
		
		Queue<String> q1 = new LinkedList<String>();
		Arrays.asList(tc1.split("")).stream().forEach(a->q1.add(a));
		
		/**Priority queue creates a collection with natural ordering**/
		/**As set automatically removes the duplicate items**/
		Queue<String> q2 = new PriorityQueue<String>();
		Arrays.asList(tc2.split("")).stream().forEach(a->q2.add(a));
		
		while(!q1.isEmpty()) {
			System.out.print(q1.poll());
		}
		
		//System.out.println("\n");
		//q1.forEach(a->System.out.print(a));

		System.out.println("\n");
		
		while(!q2.isEmpty()) {
			System.out.print(q2.poll());
		}
		//System.out.println("\n");
		//q2.forEach(a->System.out.print(a));
	}

}
