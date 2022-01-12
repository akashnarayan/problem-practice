package com.java.memory;

import com.linkedlist.impl.Node;
/**
 * Testing types of primitives, objects, collections and their behavior.
 * p.s. collections are also object reference at heap
 **/
public class TestingVariablesAtHeapAndStackMemory {

	public static void main(String[] args) throws InterruptedException {
		final String test="final";
		int a=0; boolean b=false; char c='c'; String s="s"; Node n=new Node("n", null); int[] intArr= {0,1}; 
				char[] charArr= {'c','d'}; String[] stringArr={"str","Arr"}; Node[] nodesArr= {new Node("n", null), new Node("m", null)};
		
				someRandomOps(a, b, c, s, n, intArr, charArr, stringArr, nodesArr);
				
				System.err.println(a);	System.err.println(b);	System.err.println(c);	System.err.println(s); 
				System.err.println(n.getData());	System.err.println();
				for(int x : intArr) {
					System.err.print(x);
					System.err.print("\s");
				}		System.err.println();
				for(char x : charArr) {
					System.err.print(x);
					System.err.print("\s");
				}		System.err.println();
				for(String x : stringArr) {
					System.err.print(x);
					System.err.print("\s");
				}		System.err.println();
				for(Node x: nodesArr) {
					System.err.print(x.getData());
					System.err.print("\s");
				}
	}
	
	public static void someRandomOps(int a, boolean b, char c, String s, Node n, int[] intArr, char[] charArr, String[] stringArr, Node[] nodesArr) {
		a=1; b=true; c='d'; s.concat("1"); 
		
		n.setData("n1");
		
		intArr[0]= 2; intArr[1] = 3; charArr[0]= 'e'; charArr[1]= 'f'; stringArr[0]="ok"; stringArr[1]="ok"; 
		nodesArr[0].setData("n1"); nodesArr[1].setData("m1");
		

	}

}
