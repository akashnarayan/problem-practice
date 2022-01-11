package com.sample.pack1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SampleClass {

	public static void main(String[] args) {
		
		
		Employee e1 = new Employee("Rashmi", 14, 30000);
		Employee e2 = new Employee("Martin", 19, 400);
		Employee e3 = new Employee("Mary", 14, 40000);
		Employee e4 = new Employee("Stephan", 19, 19000);
		Employee e5 = new Employee("Gary", 26, 5000);
		Employee e6 = new Employee("John", 14, 20000);
		
		List<Employee> employeeList = Arrays.asList(e1, e2, e3, e4, e5);
		 
		//List<String> empList = new ArrayList<String>();

		//Predicate<Employee> pred = p -> p.getAge() > 48;
		
		//employeeList.forEach(e -> empList.add(employeeList.stream().anyMatch(p -> p.getAge()>14)));
		
		//employeeList.stream().filter(pred).forEach(e -> empList.add(e.getName()));
		
//		employeeList.forEach(null);
//		System.out.println(empList);

		java8Practice(employeeList);
		
	}
	
	public static void java8Practice(List<Employee> employeeList) {
		
		// 1. Find Maximum salary of the Employee
		// 2. Occurrence of Employees by their name
		// 3. How many Employees have age greater than 14
		// 4. Employee names with age greater than 14
		// 5. Count of Employee names with age greater than 14
		// 6. Employee names and Employee Age with age greater than 14
		// 7. Map all Employees by their Name
		
		/*1*/
		//employeeList.stream().max((e1,e2)-> e1.getSalary()-e2.getSalary()).ifPresent(e->System.out.print(e.getName()));
		
		
		/*2*/
//		Map<String, Integer> m = employeeList.stream()
//				.collect( Collectors.toMap(k->k.getName(), k->k.getAge()) );
//		m.entrySet().stream().forEach(System.out::println);
		
		/*3*/
//		long count = employeeList.stream()
//				.filter(e->e.getAge()>14).count();
//		System.out.println(count);
		
		/*4*/
		//employeeList.stream()
		//		.filter(e->e.getAge()>14).forEach(System.out::println);
		
		
		/*5*/
		Map<String, Integer> m = employeeList.stream()
				.filter(e->e.getAge()>14).collect(Collectors.toMap(e->e.getName(), e->e.getAge()));
		m.entrySet().forEach(System.out::println);
		
		
		try (Scanner scanner = new Scanner(new File("test.txt"))) {
		    while (scanner.hasNext()) {
		        System.out.println(scanner.nextLine());
		    }
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		
		try (PrintWriter writer = new PrintWriter(new File("test.txt"))) {
		    writer.println("Hello World");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		
	}
	
 	public static void plusMinus(List<Integer> arr) {
	    // Write your code here
	    HashMap<String, Integer> map = new HashMap<>();
	    map.put("pos",0);
	    map.put("zero",0);
	    map.put("neg",0);
	    int i = 0;
	        for(int x : arr){
	            if(Math.signum(x)==0){
	                map.put("zero",i++);
	            }else if(Math.signum(x)>1){
	            	map.put("pos",i++);
	            }else {
	            	map.put("neg",i++);
	            }
	        }
	        
	        for(Integer a : map.values()) {
	        	
	        	System.out.println(Float.valueOf(Math.round(i))/Float.valueOf(map.size()));
	        }
	        for(Entry<String, Integer> a : map.entrySet()) {

	        	//System.out.println(a.);
	             //   System.out.println(a/map.size());
	            }
	        
	    }
	

}
