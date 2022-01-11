package com.regex.sample;

import java.util.regex.*;

public class Main {

	public static void main(String[] args) {
		
		/* In java.util.regex package
		 *    _______________
		 * 
		 *  1. Pattern Class
		 *  2. Matcher Class
		 *  3. MatchResult Interface - it is a REGEX engine, it performs the match operations
		 *  4. PatternSyntax Exception Class
		 ***/
		
		Pattern p = Pattern.compile("[a-z]{2,}");
		CharSequence seq = "abcd";
		Matcher m = p.matcher(seq);
		
		System.out.println(m.matches());
		

	}

}
