package com.timecomplexity.algorithm;

public class TimeComplexity {

	public static void main(String[] args) {
		findSum_(2);
	}
	
	
	// function taking input "n"
	//O(1) solution
	static int findSum_(int n) 
	{
	    return n * (n+1) / 2; // this will take some constant time c1
	}
	

	
	// function taking input "n"
	//O(n) solution
	/**
	* Total time taken = time taken by all the statements to execute
	* here in our example we have 3 constant time taking statements i.e. "sum = 0", "i = 0", and "return sum", so we can add all the constatnts and replacce with some new constant "c"
	* apart from this, we have two statements running n-times i.e. "i < n(in real n+1)" and "sum = sum  + i" i.e. c2*n + c3*n = c0*n
	* Total time taken = c0*n + c
	**/
	static int findSum___(int n) 
	{
	    int sum = 0; // -----------------> it takes some constant time "c1"
	    for(int i = 1; i <= n; ++i) // --> here the comparision and increment will take place n times(c2*n) and the creation of i takes place with some constant time
	        sum = sum + i; // -----------> this statement will be executed n times i.e. c3*n
	    return sum; // ------------------> it takes some constant time "c4"
	}
	
	
	
	//O(n^2) solution
	/**
	* Total time taken = time taken by all the statments to execute
	* the statement that is being executed most of the time is "sum++" i.e. n * (n + 1) / 2
	* So, total complexity will be: c1*n� + c2*n + c3 [c1 is for the constant terms of n�, c2 is for the constant terms of n, and c3 is for rest of the constant time]
	*/
	static int findSum__(int n) 
	{
	    int sum = 0; // ---------------------> constant time
	    for(int i = 1; i <= n; i++) {
	    	for(int j = 1; j <= i; j++) {
	        	sum++; // -------------------> it will run [n * (n + 1) / 2]
	        }
	    }
	            
	    return sum; // ----------------------> constant time
	}


}
