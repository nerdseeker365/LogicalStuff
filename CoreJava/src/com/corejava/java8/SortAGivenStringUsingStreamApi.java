package com.corejava.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortAGivenStringUsingStreamApi {

	public static void main(String[] args) {

		System.out.println("Before Sorting Given Array Lists are::");
		List<String> strArrayList=Arrays.asList("Vibhore","Ashutosh","Zoo");
		
		strArrayList.forEach(System.out::println);
		
		System.out.println("After Sorting Given Array Lists are::");

		List<String> sortedStrArrayList=strArrayList.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
	
		sortedStrArrayList.forEach(System.out::println);

	}

}
