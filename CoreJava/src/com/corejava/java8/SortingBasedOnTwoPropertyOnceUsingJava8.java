package com.corejava.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingBasedOnTwoPropertyOnceUsingJava8 {

	public static void main(String[] args) {

		//List<Employee> employeeLists=new ArrayList<>();
		
		Employee employee1=new Employee(101, "Ashutosh", "Pandey", 3000);
		Employee employee2=new Employee(103, "Vibhor", "Tripathi", 4000);
		Employee employee3=new Employee(102, "Manish", "Tiwari", 8000);
		Employee employee4=new Employee(104, "Subhash", "Mishra", 7000);
		
		List<Employee> employeeLists=Arrays.asList(employee2,employee3,employee1,employee4);
		
		System.out.println("Before Sorting Employees Lists are::");
		employeeLists.forEach(System.out::println);
		
		//Sorting using FirstName
		Collections.sort(employeeLists, Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName));
		

		System.out.println("After Sorting Employees Based On First And Last Name Lists are::");
		employeeLists.forEach(System.out::println);
		
		
	}

}
