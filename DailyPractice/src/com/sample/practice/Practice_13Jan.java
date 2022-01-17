package com.sample.practice;

public class Practice_13Jan {

	public static void main(String[] args) {
		
		

	}
	
	
	
	
	
	static void test() {
		int[] arr = {8, 0, -1, 7, 43};
		
		mergeSort(arr);
		
		for (int i : arr) {
			System.out.print(" "+i);	
		}
		
		
	}

	private static void selectionSortPractice(int[] arr) {
		
		int min = Integer.MAX_VALUE; 							//  c0 constant
		
		for (int i = 0; i < arr.length-1; i++) {				//	n-1 * c1 constant
			
			min = arr[i];										//  c2 constant
			
			for (int j = i+1; j <arr.length; j++) {				//	(n) * c3 constant
				
				if(min>arr[j]) {								//	c4 constant
					int temp = arr[j];							//	c5 constant
					arr[j] = arr[i];							//	c6 constant
					arr[i] = temp;								//	c7 constant
					min = temp;									//	c8 constant
				}
				
			}
			
		}
																/**
																 * Total time in worst case scenario
																 * =  c1(n-1) * ( c2 + c3(n) + ...... )
																 * =  O(n^2)
																 * */ 
																
	}
	
	private static void bubbleSortPractice(int[] arr) {
		int max = Integer.MIN_VALUE;
		
		for(int i=arr.length-1; i>0; i--) {
			
			max = arr[i];
			
			for(int j=i-1; j>=0; j--) {
				
				if(arr[j]>max) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					max = temp;
				}
				
			}
		}
																/**
																 * Total time in worst case scenario
																 * =  c1(n-1) * ( c2 + c3(n) + ...... )
																 * =  O(n^2)
																 * */ 
	}

	private static void insertionSort(int[] arr) {
		
		for(int i=1; i<arr.length; i++) {
			int pivot=i;
			for(int j=i-1; j>=0; j--) {
				
				if(arr[pivot]<arr[j]) {
					int temp = arr[pivot];
					arr[pivot] = arr[j];
					arr[j] = temp;
				}
				pivot--;
			}
			
			
		}
		
																/**
																 * Total time in worst case scenario
																 * =  c1(n-1) * ( c2(n-2) + ...... )
																 * =  O(n^2)
																 * */ 
		
	}

	private static void mergeSort(int[] arr) {
		
	}
}
