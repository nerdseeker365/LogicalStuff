package com.corejava.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		
		Map<Integer,Employee> empMap=new HashMap<>();
		
		empMap.put(101, new Employee(101, "Ashu"));
		empMap.put(102, new Employee(102, "Abhishek"));

      System.out.println(empMap);		
	}

}
