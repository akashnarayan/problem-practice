package com.sample.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Practice30Dec {

	public static void main(String[] args) {
		//TODO 
		/**
		 *1. How to print duplicate characters (characters having occurrence more than 1) from string
		 *   String tc1 = "abbcdDeEE "; // Expected :  bde
		 * 
		 *     -> printDuplicateCharacters()
		 *        
		 *   
		 *2. How to remove the duplicate characters from the given string
		 *   String tc1 = "abbcdDeEE "; // Expected :  abcde
		 *   
		 *     -> removeDuplicateCharacters()
		 *     
		 *     
		 *3. How to count the occurrence of the letters in the string
		 *   String tc1 = "abbcdDeEE ";
		 *   
		 *     -> countTheOccurrence()
		 *     
		 *4. How to sort the strings (Sorting the strings/alphabets would be different than sorting of integers because signed integers case)
		 *   String tc1 = "fsdkjfhdsH "; // Expected :  ddffhhjkss 
		 *   
		 *     -> sortTheString()
		 *     
		 *5. Check if a string is Palindrome
		 *   String tc1 = "step on no pets"; String tc2 = "nitin"; // expected : true
		 *   
		 *     -> checkThePallindrome()
		 *   
		 *6. Given a String print all the possible palindromic partitions 
		 *   String tc1= "nitin"; // expected : nitin,  n iti n,  n i t i n 
		 *   
		 *   
		 *
		 *7. How to remove first string characters from another string
		 *	 String tc1 = "abbcdDeEE "; String removeString = "ace"; //Expected :bbcdDeEE
		 *
		 *
		 *
		 *8. Print all the permutations/possible words from the characters of the String
		 *   String tc1 = "mad" // Expected : mad dam adm mda dma amd  
		 *   Combination is n!/r!(n-r)!
		 *   Calculate combination of 3! = 1x2x3 = 6, so 6 ways. In combination order doesn't matters, but in permutation order matters. 
		 *   (https://www.mathsisfun.com/combinatorics/combinations-permutations.html)  
		 *   
		 *   
		 ***/
		String tc1 = "step on no pets"; String tc2 = "nitin";
		//checkThePallindrome(tc1);
		//checkThePallindrome(tc2);
		
		int[] arr = {0,1};
		int[] rra = {0,1};
		
		if(arr== rra) {
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}
		
	}
	
	private static void checkThePallindrome(String sentence) {
		String normalize = sentence.toLowerCase().trim();
		
		normalize.replaceAll("\\s", "");
		
		
		//Arrays.asList(normalize.split("")).stream().
		
		
	}
	
	private static void printDuplicateCharacters(String word) {
		//Java 8
		String normalize = word.toLowerCase().trim();
		Map<String, List<String>> m = Arrays.asList(normalize.split("")).stream().collect(Collectors.groupingBy(s->s));
		
		m.entrySet().stream().filter(e-> e.getValue().size()>1).forEach(e->System.out.println(e.getKey()));
	}
	
	
	private static void removeDuplicateCharacters(String word) {
		//Java8
		//Arrays.asList(word.split("")).stream().distinct().forEach(System.out::println);
		
		//or using the set
		Arrays.asList(word.split("")).stream().collect(Collectors.toSet()).forEach(System.out::println);
		
	}

	
	private static void countTheOccurrence(String word) {
		Arrays.asList(word.split("")).stream().collect(Collectors.groupingBy(s->s, Collectors.counting())).forEach((k,v)->System.out.println(k+" "+v)); 
	}


	private static void sortTheString(String word) {
		List<String> list = Arrays.asList(word.split(""));
		Collections.sort(list);
		list.forEach(System.out::print);
	}
	
	private static int calculatePermutation(int n) {
		
		if(n>1) {
			return n * calculatePermutation(n-1);
		}else {
			return n;
		}
		
	}
	
	
	
}
