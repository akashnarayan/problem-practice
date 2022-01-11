package com.pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SampleClass {
	
	public static void main(String[] args) {
//		AbstractClass c = new Child();
//		c.display();
//		//c.b;
//		System.out.println(c.b);
		
		//LinkedHashMap<String, String> l = new LinkedHashMap<String, String>();
		//l.put("First", "1");
		//l.put("Second", "2");
		//l.put("Third", "3");
		
		//l.entrySet().stream().forEach(a-> {
			//System.out.println(a);
			//System.out.println(a.getKey());
		//});
		
		
		List<Student> l = new ArrayList<>();
		Student st1 = new Student(3,"Zeeshan",300);
		Student st2 = new Student(1,"Akash",450);
		Student st3 = new Student(2,"Zeus",250);
		Student st4 = new Student(4,"Possiedan",250);
		
		l.add(st1);
		l.add(st2);
		l.add(st3);
		l.add(st4);
		
		
		//1.Sort the list with marks
		//2.Find lowest marks students
		//3.Find highest marks students
		//4.If there is a student with name "Sarraf"
		//5.Students having the same marks (Occurence Problem)
//		Comparator<Student> compareMarks = new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				if(o1.getMarks()==o2.getMarks())
//					return 0;
//				else if(o1.getMarks()>o2.getMarks())
//					return 1;
//				else
//					return -1;
//			}
//		};
		
		Comparator<Student> compareMarks = (o1, o2) -> o1.getMarks() - o2.getMarks();
		
		/*1*/
		Collections.sort(l, compareMarks);
		//Map<String, List<Student>> m = l.stream().collect(Collectors.groupingBy(s->s.getName()));
		//Map<String, List<Student>> m = l.stream().collect(Collectors.groupingBy(s->s.getName()));
		//m.entrySet().stream().forEach(x->System.out.println(x.getKey()+" "+x.getValue()));
		//l.forEach(x->System.out.println(x.getMarks()));
		//Map<String, Integer> m = l.stream().collect(Collectors.toMap(Student::getName, Student::getMarks));
		//m.entrySet().stream().forEach(x->System.out.println(x.getKey()+" "+x.getValue()));
//		/*2*/
//		Optional<Student> minMarksObtainedBy = l.stream().collect(Collectors.minBy(compareMarks));
//		minMarksObtainedBy.ifPresent(x->System.out.println(x.getMarks()));
//		
//		/*3*/
//		Optional<Student> maxMarks = l.stream().collect(Collectors.maxBy(compareMarks));
//		maxMarks.ifPresent(x->System.out.println(x.getMarks()));
		
//		/*4*/
//		Predicate<Student> pr = new Predicate<Student>() {
//			@Override
//			public boolean test(Student s) {
//				return s.getName().equals("Sarraf");
//			}
//		};
//		
//		
//		Optional<Student> checkName = l.stream().filter(pr).findAny();
//		
//		checkName.ifPresent(x->System.out.println("Present"));
		
		l.forEach(x->System.out.println(x.getName()+" "+x.getMarks()));
	}
}
