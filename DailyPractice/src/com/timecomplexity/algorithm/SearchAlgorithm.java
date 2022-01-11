package com.timecomplexity.algorithm;

/**
Below are the detailed example to illustrate the difference between recursion and iteration:
(https://www.geeksforgeeks.org/difference-between-recursion-and-iteration/)

1.Time Complexity: Finding the Time complexity of Recursion is more difficult than that of Iteration. 
    Recursion: Time complexity of recursion can be found by finding the value of the nth recursive call in terms of the previous calls. Thus, finding the destination case in terms of the base case, and solving in terms of the base case gives us an idea of the time complexity of recursive equations. Please see Solving Recurrences for more details. 
     
    Iteration: Time complexity of iteration can be found by finding the number of cycles being repeated inside the loop. 
     
2.Usage: Usage of either of these techniques is a trade-off between time complexity and size of code. If time complexity is the point of focus, and number of recursive calls would be large, it is better to use iteration. However, if time complexity is not an issue and shortness of code is, recursion would be the way to go.
    Recursion: Recursion involves calling the same function again, and hence, has a very small length of code. However, as we saw in the analysis, the time complexity of recursion can get to be exponential when there are a considerable number of recursive calls. Hence, usage of recursion is advantageous in shorter code, but higher time complexity. 
     
    Iteration: Iteration is repetition of a block of code. This involves a larger size of code, but the time complexity is generally lesser than it is for recursion. 
     
3.Overhead: Recursion has a large amount of Overhead as compared to Iteration. 
    Recursion: Recursion has the overhead of repeated function calls, that is due to repetitive calling of the same function, the time complexity of the code increases manifold. 
     
    Iteration: Iteration does not involve any such overhead. 
     
4.Infinite Repetition: Infinite Repetition in recursion can lead to CPU crash but in iteration, it will stop when memory is exhausted. 
    Recursion: In Recursion, Infinite recursive calls may occur due to some mistake in specifying the base condition, which on never becoming false, keeps calling the function, which may lead to system CPU crash. 
     
    Iteration: Infinite iteration due to mistake in iterator assignment or increment, or in the terminating condition, will lead to infinite loops, which may or may not lead to system errors, but will surely stop program execution any further.


**/
public class SearchAlgorithm {

	public static void main(String[] args) {
		test();
	}
	
	private static void test(){
		int[] tc1 = new int[] {3,5,8,0,6,9,2,1,7,4};
		int[] tc2 = new int[] {12, 14, 16, 20, 22, 28, 30};
		
		int toFind_ = 4;
		
		//System.out.println(linearSearch(tc1, toFind_));
		
		int toFind__ = 12;
		int right = tc2.length-1;
		int left = 0;
		System.out.println(binarySearch(tc2, left, right, toFind__));
	}
	
	
	
	/**
	 * The Worst case time complexity calculation:
	 * line no 55: c0 + nc1 
	 * line no 56: nc2
	 * line no 56: nc2 
	 * line no 56: c3
	 * c0 + nc1 + nc2 + nc2 + c3 = nc4 + c0
	 * 
	 * So, the worst case time complexity of the program is O(n). 
	 **/
	static int linearSearch(int[] arr, int k) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==k) {
				return i;
			}
		}
		return -1;
	}


	
	/**
	 * Everywhere binary has been solved using the loop 
	 * I have tried it using the recursion. It would be a shorter code, 
	 * but recursion could lead to CPU crash if misused instead of memory exceptions. 
	 * Hence iteration is preferred over recursion.
	 * Recursion is also a more overhead to implement as compared to iteration.
	 * 
	 * It could be also done using iteration.
	 **/
	static int binarySearchUsingRecursion(int[] sortedArr, int left, int right, int k) {
		
		int mid = (left + right)/2;		
		
		if(k>sortedArr[mid]) {
			left = mid+1;
			return binarySearchUsingRecursion(sortedArr, left, right, k);
		}else if(k<sortedArr[mid]) {
			right = mid-1;
			return binarySearchUsingRecursion(sortedArr, left, right, k);
		}else {
			return mid;
		}			
	}

	
	
	/**
	 * The worst case time complexity of the program is:
	 * Consider, the element is at the last of the array:
	 * 
	 * so, in first iteration -> n/2
	 * second iteration -> n/2/2
	 * in ith iteration -> n/2^i, 
	 * after ith iteration the length of the array becomes 1, 
	 * hence,
	 
	   => n/2^i = 1
	   => n = 2^i
	   => log2 (n) = log2 (2^i)    [applying log2 both sides]
	   => log2 (n) = i * log2 (2)  
	   => i = log2 (n)             [as logn (n) = 1]
	   
	 * So, the worst-case time complexity of Binary Search is log2 (n).
	 **/
	static int binarySearch(int[] sortedArr, int lowIndex, int highIndex, int kElement) {
		
		int midIndex = (lowIndex + highIndex)/2;
		
		while(kElement!=sortedArr[midIndex]) {
			midIndex = (lowIndex + highIndex)/2;
			if(kElement>sortedArr[midIndex]) {
				lowIndex = midIndex+1;
			}else if(kElement<sortedArr[midIndex]){
				highIndex = midIndex-1;
			}else {
				return midIndex;
			}
		}
		
		return -1;
	}

}
