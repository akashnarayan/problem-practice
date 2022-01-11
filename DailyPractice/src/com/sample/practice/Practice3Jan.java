package com.sample.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.linkedlist.impl.Node;

/**
 * 
 * 1. Create a singly linked list using the nodes
 *    ---> This is wrong implementation of Linked List as this is viewing linked list as Node[] which is wrong. 
 *         LinkedList is just a node, and the node is pointing to next node or null. A single node is also a list on its own. 
 *    
 *    
 * 2. Delete the middle of the node.
 * */

public class Practice3Jan {

	public static void main(String[] args) {
		
	}

	private static void problem2() {
		int tc1 = 6, tc2 =5;
		
		Node[] linkedList1 = getSinglyList(tc1);
		Arrays.asList(deleteLinkedList(linkedList1, linkedList1.length/2)).stream().filter(a->a!=null).forEach(a->System.out.println(a.getData() +" "+a.getNextNode()));
		
		
		Node[] linkedList2 = getSinglyList(tc2);
		Arrays.asList(deleteLinkedList(linkedList2, linkedList2.length/2)).stream().filter(a->a!=null).forEach(a->System.out.println(a.getData() +" "+a.getNextNode()));
		
		
	}
	
	private static void problem1() {
		Arrays.asList(getSinglyList(5)).stream().forEach(a->System.out.println(a.getData()+" "+a.getNextNode()));
	}
	
	private static Node[] deleteLinkedList(Node[] linkedList, int n) {
		
		if(n>linkedList.length) {
			System.out.println("Invalid argument");
			return null;
		} else if(linkedList.length<2) {
			return null;
		}
		
		linkedList[n-1].setNextNode(linkedList[n+1]);
		for(int i=n; i<linkedList.length; i++) {
			linkedList[i] = linkedList[i].getNextNode(); 
		}

		return linkedList;
	}
	
	private static Node[] getSinglyList(int size) {
		
		Node head = new Node("0-head",null);		
		Node[] linkedList = new Node[size];
		linkedList[0] = head;
		for(int i=0; i<size-1; i++) {
			Node node = new Node(i+1+"",null);			
			linkedList[i].setNextNode(node);
			linkedList[i+1] = node;
		}


		
/**
   -> Below will always fail...
      Guess why...
  	  This problem is solved by : 
   	  (i) creating the head node prior to starting the cycle & (ii) spinning the cycle one step ahead for the future nodes.
 **/		

//		Node[] linkedList = new Node[size];
//		for(int i=0; i<size-1; i++) {
//			if(i==0) {
//				linkedList[i] = new Node(i+"", null);
//			}else {
//				Node node = new Node(i+"", null);
//				linkedList[i-1].setNextNode(node);
//				linkedList[i] = node;
//			}
//			
//		}
				
		return linkedList;
	}
	
	private static Node[] insert(Node[] linkedList, Node node) {		
		linkedList[linkedList.length-1].setNextNode(node);
		return linkedList;
	}
	
}
