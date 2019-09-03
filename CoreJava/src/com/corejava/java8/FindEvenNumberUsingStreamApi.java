package com.corejava.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumberUsingStreamApi {

	public static void main(String[] args) {

		Integer[] intArray={1,4,2,3,5,6};
		
		System.out.println("Initial Array::");
		
	    List<Integer> integerList= Arrays.asList(intArray);
	    
	    integerList.forEach(System.out::println);
	   
	    System.out.println("After Filter Array are::");
	    List<Integer> FilteredIntegerList=integerList.stream().filter(x->x%2==0).collect(Collectors.toList());
	   
	    FilteredIntegerList.forEach(System.out::println);
	    
	}

}
