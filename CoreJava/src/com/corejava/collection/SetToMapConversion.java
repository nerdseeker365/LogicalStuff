package com.corejava.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetToMapConversion {

	public static void main(String[] args) {

		Set<Employee> employeeSet=new HashSet<>();
		
		employeeSet.add(new Employee(101, "Ashutosh"));
		employeeSet.add(new Employee(102, "Ashish"));
		employeeSet.add(new Employee(103, "Manish"));

		Map<Integer,String> employeeMap=new HashMap<>();
		
		
		for(Employee emp:employeeSet) {
			employeeMap.put(emp.getEmpid(), emp.getEmployeeName());
		}
		
		System.out.println(employeeMap);
	}

}
