package com.corejava.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddCustomObjectIntoMap {

	static Map<Integer,String> employeeMap=new HashMap<>();
	
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

			addCustomObjectIntoMap(employee);
			n--; //decrement
		}
		
		
		System.out.println("Employee Map Details are::"+employeeMap);
		
	}
	public static void addCustomObjectIntoMap(Employee employee) {	
		employeeMap.put(employee.getEmpid(), employee.getEmployeeName());		
	}
	
}
