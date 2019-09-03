package com.corejava.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DoubleEachElementInAGivenIntegerArrayUsingStreamApi {

	public static void main(String[] args) {

		System.out.println("Initilally List Elements Are::");
	    List<Integer> integerList=Arrays.asList(1,2,3);
	    integerList.forEach(System.out::println);
	    
	    List<Integer> doubleIntegerList=integerList.stream().map(x->x*2).collect(Collectors.toList());
	    
		System.out.println("After Doubling List Elements Are::");

	    doubleIntegerList.forEach(System.out::println);
	}

}
