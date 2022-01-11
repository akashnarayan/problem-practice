package com.sample.pack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestClass {

	public static void main(String[] args) {

		
		String s1 = "silent";
		String s2 = "listen";
		
		//System.out.println(checkAnagram(s1, s2));
		System.out.println(checkAnagram2(s1, s2));
		
	}

	
// 1st way	
	private static boolean checkAnagram(String s1, String s2) {
		
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		Map<Character, Integer> map2 = new HashMap<Character, Integer>();
		
		for(Character c : s1.toCharArray()) {
			map1.putIfAbsent(c, 1);
			if(map1.get(c)>1) {
				Integer count = map1.get(c) + 1;
				map1.put(c, count);
			}
		}
		
		for(Character c : s2.toCharArray()) {
			map2.putIfAbsent(c, 1);
			if(map2.get(c)>1) {
				Integer count = map1.get(c) + 1;
				map1.put(c, count);
			}
		}
		
		map2.putAll(map1);
		
		if(map1.size()==s1.length()) {
			return true;
		}
		
		return false;
	}
	
	private static boolean checkAnagram2(String s1, String s2) {
		Set<char[]> set1= Set.of(s1.toCharArray());
		Set<char[]> set2= Set.of(s2.toCharArray());
		
		set1.addAll(set2);
		
		if(set2.size()==set1.size()) {
			return true;
		}
		
		
		return false; 
	}

}
