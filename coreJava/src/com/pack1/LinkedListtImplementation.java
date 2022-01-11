package com.pack1;

import com.pack1.LinkedListt.Node;

public class LinkedListtImplementation {

	public static void main(String[] args) {
		
		//[23, 33, 43, 53]
		
		//[53, 43, 33, 23]
		
		Integer[] a = new Integer[4];
		a[0] = 23;
		a[1] = 33;
		a[2] = 43;
		a[3] = 53;
		
		
//		LinkedListt.Node node = LinkedListt.(new Node(0));
//		
//		Node[] firstList = new Node[a.length];
//
//		firstList[0] = new LinkedListt.Node(23);
//		firstList[1] = new Node(33);
//		firstList[2] = new Node(43);
//		firstList[3] = new Node(53);

		//Inserting
		
		LinkedListt l = new LinkedListt();
		l = LinkedListt.insert(l, 23);
		l = LinkedListt.insert(l, 33);
		l = LinkedListt.insert(l, 43);
		l = LinkedListt.insert(l, 53);
		
		LinkedListt.print(l);
		
		//Reversing

	}

}
