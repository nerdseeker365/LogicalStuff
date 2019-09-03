package com.corejava.collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AddCustomObjectIntoSet {

	static Set<Employee> employeeSet=new HashSet<>();
	
	public static void main(String[] args) {

		Scanner scanner=null;
		int n=0;
		int employeeId=0;
		String employeeName=null;
		
		
        scanner=new Scanner(System.in);
		
		
		System.out.println("Enter Number of Employees You want to add");
		n=scanner.nextInt();       //initialization
		
		scanner.nextLine();
		
		
		while(n>0) {  //condition
			
			System.out.println("Enter Employee Id::");
			employeeId=scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Enter Employee Name::");
            employeeName=scanner.nextLine();
            
			Employee employee=new Employee(employeeId, employeeName);
			addEmployeeToSet(employee);
			n--;
      	}
		
		//show All Employyes Set
		employeeSet.forEach(System.out::println);
	}

	private static void addEmployeeToSet(Employee employee) {

		employeeSet.add(employee);
	}
}
