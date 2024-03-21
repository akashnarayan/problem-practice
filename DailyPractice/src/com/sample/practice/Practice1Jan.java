package com.sample.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


/**
 * 1. Find the maximum product of two numbers in an unsorted array
 * </br>
 *    int tc1[] = {5,3,2,5,7,0}  //expected: 5 * 7 = 35
 * 	  int tc2[] = {-2,-1,-3,4,-8,0} //expected: -3 * -8 = 24
 * </br>
 * 2. Find the indices of two numbers giving maximum product in an unsorted array
 * </br>
 * 3. Find the minimum product of two numbers in an unsorted array
 * </br>
 * 4. Replace the two numbers with 0 and 10 in the array
 * 
 * 5. Find all the substrings of a string.
 **/
public class Practice1Jan {

	public static void main(String[] args) {
		//System.out.println(Arrays.toString(problem2()));
		
		//System.out.println(combination(13,12));
		findSubstring();
		
	}
	
	private static int[] problem2() {
		int max = Integer.MIN_VALUE;
		int a=-1,b=-1;
		int[] tc2 = {-2,-1,-3,4,-8,0};
		
		for(int i=0; i<tc2.length; i++) {
			for(int j=i+1; j<tc2.length; j++) {
				if(max<tc2[i]*tc2[j]) {
					max = tc2[i] * tc2[j];
					a=i; b=j;
				}
			}
		}
		int[] result = {a,b,max};
		return result; 
	}
	
	private static void _problem1_alternate() {
		int max = Integer.MIN_VALUE;
		
		int[] tc2 = {-2,-1,-3,4,-8,0};
		
		for(int i=0; i<tc2.length; i++) {
			for(int j=i+1; j<tc2.length; j++) {
				if(tc2[i]*tc2[j]>max) {
					max = tc2[i]*tc2[j];
				}
			}
		}
		
		System.out.println(max);
	}

	private static void problem1() {
		//int[] tc1 = {5,3,2,5,7,0};  5 + 4 + 3 + 2 + 1 = 15
		int tc2[] = {-2,-1,-3,4,-8,0};
		
//		int[] firstIteration = keepHighestNumberinLastIndex(tc2);
//		int max = firstIteration[firstIteration.length-1];
//		firstIteration[firstIteration.length-1] = Integer.MIN_VALUE;
//		int[] secondIteration = keepHighestNumberinLastIndex(firstIteration);
//		int secondMax =  secondIteration[secondIteration.length-1];
		
		//System.out.println("The Highest product is :" + max * secondMax);
		
		// Second approach
		//int combination = combination(tc2.length, 2);
		
//		int[] productArr = new int[combination];
//		calculateProduct(tc2, productArr);
//		keepHighestNumberinLastIndex(productArr);
//		int max = productArr[productArr.length-1];
//		
//		System.out.println("The Highest product is :" + max);//Arrays.toString(calculateProduct(tc2, productArr));
		
		

	}
	
	private static int[] calculateProduct(int[] tc2, int[] newArr) {
		int count = 0;
		for(int i=0; i<tc2.length; i++) {
			for(int j=i+1; j<tc2.length; j++) {
				newArr[count++] = tc2[j] * tc2[i];
			}
		}
			
		return newArr;
	}
	
	private static final long combination(long n, long r) {
		if(n<r) {
			return 0;
		}
		long numerator = factorial(n);
		long denominator = factorial(n-r) * factorial(r);
		
		if(denominator>0) {
			return numerator/denominator;
		}else {
			return 1;
		}
		
		
		
	};
	
	private static long factorial(long n) {
		if(n>1) {
			return n * factorial(n-1);
		}else {
			return n;
		}
	}
	
	private static int[] keepHighestNumberinLastIndex(int[] arr) {
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i-1]>arr[i]) {
				int temp = arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = temp;
			}
		}
		
		return arr;
	}
	
	public static Set<String> findSubstring(){
		
		String tc = "abc";
		String[] arr = tc.split("");
		
		Set<String> set = new TreeSet<>();
		set.add(tc);
		
		Arrays.stream(arr).forEach(s->set.add(s));
		
		for(int i=0; i<tc.length(); i++) {
			set.add(tc.replaceAll(String.valueOf(tc.charAt(i)), "")); 
		}
		
		System.out.println(set);
		
		return set;
	}
	
}
