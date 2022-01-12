package com.timecomplexity.algorithm;

import java.util.Arrays;

/**
 * 1. Selection sort</br>
 * 2. Bubble sort</br>
 * 3. Insertion sort</br>
 * 4. Merge sort</br>
 * 5. Quick sort</br>
 * 6. Radix sort</br>
 * 
 * </br>
 * And their worst case time complexity.
 **/
public class SortingAlgorithms {

	public static void main(String[] args) {
		testing();
	}
	
	private static void testing() {
		int[] tc1 = {8, 6, 10, 2, 0, 1};
		
		int[] tc2 = new int[] {-8, 6, -10, 2, 0, -1};

		selectionSort(tc2);
		
		for(int i : tc2) {
			System.out.println(i);
		}
	}
	
	
	static void selectionSort(int[] arr) {
	
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length-1; i++) {
			min = arr[i];
			for(int j=i+1; j<=arr.length-1; j++) {
				
				if(min>arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					min = temp;
				}
				
				
			}
		}
		
	}
		
	

}
