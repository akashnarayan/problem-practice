package com.test.classes;

import java.util.ArrayList;
import java.util.Collections;

public class SampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] input= {1,4,5,2,6,7,3};
		// 1+4+5=10
		// 2+6+7=15
		// 3=3
		ArrayList sumitems = new ArrayList<>();
		
		
		for(int i =1; i<input.length; i++) {
			int count = 0;
			if(!(input[i]>input[i-1])) {
				
				count = count + 1;
				
			}
			
			int sum = input[i]+input[i-1];
			sumitems.add(sum, count);		
			
			Collections.sort(sumitems);
			
			///for(int i=0; i < sumitems.`;)
			
//			empid ename slaray depid
//			101 naveen 2000 5
//			102 akash 3000 5
//			103 anil 4000 6
//			104 anil 7000 6
//			
//			 3000 5
//			 7000 6
			 
			
			
		}

	}

}
