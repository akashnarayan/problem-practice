package com.pack1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class TestClass {

	public static void main(String[] args) {
		// TODO Sort the array with only either 1,0 or -1 (a) In ascending order (b) As per their frequency/occurrence 
		
		Integer[] a = {1,1,1,0,-1,-1,0,0,0,0,0};
		List<Integer> l = Arrays.asList(a);
		
		Collections.sort(l);
		l.forEach(System.out::println);
		
		
		
		
		
		//List<Integer> l = Arrays.stream(a).boxed().collect(Collectors.toList());
		//Collections.sort(l);
		
		//System.out.println(l);
		
/*		Map<Integer, Integer> m = new LinkedHashMap<Integer, Integer>();
		Map<Integer, Integer> n = new LinkedHashMap<Integer, Integer>();
		int counter1 = 0;
		int counter2 = 0;
		int counter3 = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i]==0) {
				counter1++;
			}else if(a[i]==1) {
				counter2++;
			}else if(a[i]==-1){
				counter3++;
			}
			
			if((counter1>counter2)&&(counter1>counter3))
				m.put(a[i], counter1);
			if((counter2>counter3)&&(counter2>counter1))
				m.put(a[i], counter2);
			else
				m.put(a[i], counter3);
		}
		
		m.forEach((Integer i1, Integer i2)-> System.out.println(i1+"="+i2));
		
		for(int i=-1; i<1; i++) {
			if(i==a[i]) {
				n.put(a[i], null);
			}
		}
*/		
	}

}
