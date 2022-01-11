package com.pack1;

public class SampleClass {

	public static void main(String[] args) {
		
		String input ="abbbbcd";
		input = checkAndRemoveDuplicates(input);
		//output : acd

	}
	
	
	private static String checkAndRemoveDuplicates(String s) {
		
		int count = 0;
		Character[] c = new Character[s.length()];
		for(int i=0; i<s.length()-1; i++) {
			if(s.charAt(i)!=s.charAt(i+1)) {
				c[i] =  s.charAt(i);
				//i = i+2;
				
			}else {
				
			}
		}
		//System.out.println();
		return String.valueOf(c);
		
	}
	
	
	

}
