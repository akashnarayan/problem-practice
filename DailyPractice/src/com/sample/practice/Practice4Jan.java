package com.sample.practice;

import com.linkedlist.impl.Node;

/***
 * <b>Problem 1</b>: Create a LinkedList.
 * </br>
 * <b>Problem 2</b>: Delete a middle node.
 * 
 ***/
public class Practice4Jan {

	public static void main(String[] args) {
		problem2();
	}
	
	private static void problem1() {
		Node node = getSinglyList(6);
		while(node!=null) {
			System.out.println(node.getData());
			node = node.getNextNode();
		}
	}

	private static void problem2() {
		Node linkedList = getSinglyList(5);
		
		int size = findSizeOfTheLinkedList(linkedList);
		
		deleteNodeFromMidOfTheLinkedList(size, linkedList);
	}
	
	private static Node deleteNodeFromMidOfTheLinkedList(int size, Node linkedList) {
		int toIterate;
		if(size%2==0) {
			toIterate=(size/2) + 1;
		}else {
			toIterate=size/2;
		}
		
		Node prevNode=linkedList;
		for(int i=0; i<toIterate-1;i++) {
			prevNode = prevNode.getNextNode();
		}
		prevNode.setNextNode(prevNode.getNextNode().getNextNode());
		
		//Print Nodes
		while(linkedList!=null) {
			System.out.println(linkedList.getData());
			linkedList = linkedList.getNextNode();
		}
		return linkedList;
	}
	
	private static int findSizeOfTheLinkedList(Node linkedList) {
		int size=0;
		Node list = linkedList;
		while(list!=null) {
			size++;
			list = list.getNextNode(); 
		}
		return size;
	}
	
	private static Node getSinglyList(int n) {
		
		/*
		 * Node head = new Node("0", null); Node node1 = new Node("1", null); Node node2
		 * = new Node("2", null); Node node3 = new Node("3", null); Node node4 = new
		 * Node("4", null); Node node5 = new Node("5", null);
		 * 
		 * head.setNextNode(node1); node1.setNextNode(node2); node2.setNextNode(node3);
		 * node3.setNextNode(node4); node4.setNextNode(node5); node5.setNextNode(null);
		 */
		
		//Important logic
		//Atul wrote this logic
		Node head = null;
		Node nextNode = null;
		for(int i=0; i<n; i++)
		{
			Node node = new Node(i + "", null);
			if(i==0)
			{
				head = node;
			}
			if(nextNode != null)
			{
				nextNode.setNextNode(node);
			}
			
			nextNode = node;
		}
		
		
		return head;
	}
}
