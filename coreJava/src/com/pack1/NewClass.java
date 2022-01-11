package com.pack1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NewClass {

	public static void main(String[] args) {
		
//		List<Integer> l = new ArrayList<Integer>();
//		for(int i =0; i<100; i++) {
//			l.add(i+1);
//		}
		
		List<Integer> l = IntStream.range(0, 100).boxed().collect(Collectors.toList());
		
		Predicate<Integer> p1 = new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				if(t%5==0 && t%7!=0) {
					return true;	
				}
				return false;
			}
		};
		
		Predicate<Integer> p2 = new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				if(t%5!=0 && t%7==0) {
					return true;	
				}
				return false;
			}
		};
		
		Predicate<Integer> p3 = new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				if(t%5==0 && t%7==0) {
					return true;	
				}
				return false;
			}
		};

		IntStream.rangeClosed(0, 100)
		.mapToObj(i -> 
				(i % 5 == 0) ? (i % 7 == 0 ) ? "BusMiss" : "Bus" : (i % 7 == 0 ? "Miss" : i)
		)	
		.forEach(System.out::println);

		/*forEach(i->System.out.println("Bus : " + i));*/

//		l.stream().filter(p1).forEach(i->System.out.println("Bus : " + i));
//		l.stream().filter(p2).forEach(i->System.out.println("Miss: " + i));
//		l.stream().filter(p1).filter(p2).forEach(i->System.out.println("Bus Miss: " + i));

		
		String s = "abababababab";
		
		System.out.println(s.replaceAll("ba", "1").chars().filter(x-> (char)x == '1').count());
		
		
		
		
	}

}
