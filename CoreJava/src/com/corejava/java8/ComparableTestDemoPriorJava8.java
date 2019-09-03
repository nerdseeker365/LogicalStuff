package com.corejava.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTestDemoPriorJava8 {

	public static void main(String[] args) {

		Student student=new Student(101,"Ashutosh",22,"M");
		
		Student student2=new Student(102,"Manish",23,"M");
		
		Student student3=new Student(103,"Ramesh",25,"M");
		
		Student student4=new Student(104,"Suresh",26,"M");
		
		List<Student> studentList=new ArrayList<>();
		
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student);
		studentList.add(student4);
		
		
		System.out.println("Before Sorting Employee List Are:::");
		studentList.forEach(System.out::println);
		
		Collections.sort(studentList);
		
		System.out.println("After Sorting Employee List Are::");
		studentList.forEach(System.out::println);

		

		
		
		
		
	}

}
