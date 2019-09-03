package com.corejava.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindLargestStringInAGivenList {

	public static void main(String[] args) {

		String[] strArray={"Ashutosh","Shivam","Manish","Zebra"};
		
		List<String> stringList=Arrays.asList(strArray);
		
		//using Lambda Expression
				/*
				 * stringList.forEach(str->{ System.out.println(str); });
				 */
				
				
		//using Method reference
		//stringList.forEach(System.out::println);
		
		String maxElement=stringList.stream().max(Comparator.comparing(String::valueOf)).get();
		
		System.out.println("Max Element::"+maxElement);
		
	}

}
