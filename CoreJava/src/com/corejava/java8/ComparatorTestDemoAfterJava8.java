package com.corejava.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTestDemoAfterJava8 {

	public static void main(String[] args) {

	Student student=new Student(101,"Ashutosh",22,"M");
		
		Student student2=new Student(102,"Manish",23,"M");
		
		Student student3=new Student(103,"Ramesh",25,"M");
		
		Student student4=new Student(104,"Suresh",26,"M");
		
		//List<Student> studentList=new ArrayList<>();
		
		/*studentList.add(student2);
		studentList.add(student3);
		studentList.add(student);
		studentList.add(student4);*/
		
		
		List<Student> studentList=Arrays.asList(student,student4,student2,student3);
		
		
		System.out.println("Before Sorting Employee List Are:::");
		studentList.forEach(System.out::println);
		
		Collections.sort(studentList);
		
		//Sorting logic After Java8 
		 studentList.sort((Student s1, Student s2)->{
			 //Numberwise Sorting
				return s1.getStudentNumber()-s2.getStudentNumber();
			    //return s2.getStudentNumber()-s1.getStudentNumber();
			  
			});
		 
		    System.out.println("After NumberwiseSorting Employee List Are::");
			studentList.forEach(System.out::println);
			
		 studentList.sort((Student s1, Student s2)->{
			 //Namewise Sorting
			   //return s1.getStudentName().compareTo(s2.getStudentName());
			   return s2.getStudentName().compareTo(s1.getStudentName());
			});
		
		System.out.println("After NamewiseSorting Employee List Are::");
		studentList.forEach(System.out::println);

		
	}

}
