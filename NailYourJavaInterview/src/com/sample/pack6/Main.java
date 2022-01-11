package com.sample.pack6;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Find the count of vowels and consonant in a given word
		
		String testWord1 = "HellO";
		String testWord2 = "there is a quiet Mouse";
		String testWord3 = "I am happy         ";
		
		String normalize = testWord3.toLowerCase().trim();
		
		System.out.println("Vowels : "+findVowels(normalize)+" Consonants: "+findConsonant(normalize));
		
	}
	
	private static int findVowels(String line) {
		//classic
		int vowelCount = 0;
		for(int i=0; i<line.length(); i++) {
			if(line.charAt(i)=='a' || line.charAt(i)=='e' || line.charAt(i)=='i' || line.charAt(i)=='o' ||
					line.charAt(i)=='u' || line.charAt(i)=='y') {
				vowelCount++;
			}
		}
		
		
		//java8
		System.out.println("-------------------Vowel--------------------");
		//Predicate<String> p = a-> a.equals("a");
		//p.or(a-> a.equals("e")).or(a-> a.equals("i")).or(a-> a.equals("o")).or(a-> a.equals("u")).or(a-> a.equals("y"));
		Predicate<String> p = a-> ( a.equals("a") || a.equals("e") || a.equals("i") || a.equals("o") || a.equals("u") || a.equals("y") );
		System.out.println(Arrays.asList(line.split("")).stream().filter(p).count());
		
		//System.out.println(Arrays.asList(line.split("")).stream().anyMatch(p));
		
		System.out.println("--------------------------------------------");
		
		
		
		return vowelCount;
	}
	
	private static int findConsonant(String line) {
		//classic
		int consonantCount = 0;
		for(int i=0; i<line.length(); i++) {
			if(line.charAt(i)!='a' && line.charAt(i)!='e' && line.charAt(i)!='i' && line.charAt(i)!='o' &&
					line.charAt(i)!='u' && line.charAt(i)!='y') {
				consonantCount++;
			}
		}
		
		//java8
		System.out.println("\n\n-------------------Consonant----------------");
		Predicate<String> p = a-> ( !a.equals("a") && !a.equals("e") && !a.equals("i") && !a.equals("o") && !a.equals("u") && !a.equals("y") );
		System.out.println(Arrays.asList(line.split("")).stream().filter(p).count());
		System.out.println("---------------------------------------------");
		
		return consonantCount;
	}

	
	
}
