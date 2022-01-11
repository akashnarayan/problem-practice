package com.pack1;

public class LinkedListt {

	private Node head;

	static class Node {
			
		Node next;
		int value;
		
		public Node(int value) {
			this.value = value;
		}
		
	}
	
	public static LinkedListt insert(LinkedListt l, int data) {
		Node newNode = new Node(data);
		if(l.head==null) {
			l.head = newNode;
		} else {
			Node last = l.head;
			while(last.next!=null) {
				last = last.next;
			}
			last.next = newNode;
		}
		return l;
	}
	
	public static void print(LinkedListt l) {
		Node currentNode = l.head;
		while(currentNode!=null) {
			System.out.println(currentNode.value + " ");
			currentNode = currentNode.next;
		}
		
	}
}
