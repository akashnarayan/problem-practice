package com.sample.pack5;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		/* TODO PalindromeChecker
		 * 
		*  Tips: For solving string questions
		*            i.  Normalize the input first (normalize means making all strings of same case and standards)
		*            ii. Do not convert the string into char / Character type. 
		*                Play with string only.             
		*/ 
		

		String testword1 = "amma";
		String testword2 = "abba";
		String testword3 = "racecar";
		String testword4 = "miss";
		
		String normalized = testword1.toLowerCase();
		//System.out.println(testPalindrome(normalized));
		
		System.out.println(usingJava8methods(normalized));
	}
	
	//classic
	private static boolean testPalindrome(String word) {
		int len = word.length();
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i)!=word.charAt(len-1-i)) {
				return false;
			}
		}
		
		return true;
	}
	
	//Java8
	private static boolean usingJava8methods(String word) {
		int length = word.length();
		return IntStream.rangeClosed(0, word.length()/2).allMatch(i->word.charAt(i)==word.charAt(length-1-i));
	}

	
}
