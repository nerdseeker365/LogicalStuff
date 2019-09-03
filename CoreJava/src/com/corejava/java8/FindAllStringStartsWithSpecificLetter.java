package com.corejava.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllStringStartsWithSpecificLetter {

	public static void main(String[] args) {

		List<String> strList=Arrays.asList("Sanjay","Ashutosh","Samrat");
		
		System.out.println("Initial String Are::");
		strList.forEach(System.out::println);
		
		List<String> filteredStrList= strList.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
	
        System.out.println("Filtered String Are::");
        
        filteredStrList.forEach(System.out::println);

	}

}
