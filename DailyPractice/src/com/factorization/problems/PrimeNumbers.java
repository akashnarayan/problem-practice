package com.factorization.problems;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
	
	public static void main(String[] args) {
		System.out.println(performPrimeFactorizationAndReturnFactors(555));
	}
	
	/**
	 * We have two methods of finding the HCF</br> 
	 * &nbsp;&nbsp;&nbsp;<b>i. Eucliedean method</b></br>
	 * &nbsp;&nbsp;&nbsp;<b>ii. Using Prime factorization</b></br></br>
	 * This operation is using the Euclidean method.
	 **/
	public static void calculateHCF(int arr[]) {
		//for(a)
	}
	
	public static void calculateLCM(int a, int b) {
		
	}
	
	public static List<Integer> performPrimeFactorizationAndReturnFactors(int a) {
		List<Integer> divisorArray = new ArrayList<Integer>();
		while(a>2) {
			if(a%2==0) {
				divisorArray.add(2);
				a = a/2;
			}else if(a%3==0){
				divisorArray.add(3);
				a = a/3;
			}else if(a%5==0){
				divisorArray.add(5);
				a = a/5;
			}else if(a%7==0){
				divisorArray.add(7);
				a = a/7;
			}else {
				divisorArray.add(a);
				a = a/a;
			}
		}
		return divisorArray;
	}
	
	public static void printPrimeNumbers(long tc) throws InterruptedException {
		
		while(tc<Integer.MAX_VALUE) {
			Thread.sleep(100);
			checkIfPrime((int)tc);
			tc++;
		}
	}
	
	public static boolean checkIfPrimeThroughInBuiltFuntion(long n){
		BigInteger b = BigInteger.valueOf(n);
		boolean r = b.isProbablePrime(100);
		if(r) {
			System.out.println(n);
		}
		return r;
	}
	
	
	
	public static boolean checkIfPrime(int n){
		if(n==1)
			return false;
		
		if(n==2 || n==3) {
			System.out.println(n);
			return true;
		}
		
		int m=2;
		while(m!=n) {
			if(n%m!=0) {
				m++;
				continue;
			}else 
				return false;
		}
		
		System.out.println(n);
		return true;
	}

}
