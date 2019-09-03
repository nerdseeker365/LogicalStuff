package com.corejava.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindLargestElementInIntegerArrayUsingStreamApi {

	public static void main(String[] args) {

		List<Integer> integerList=Arrays.asList(1,2,3,4,5,7,6,9,8);
		
		int max=integerList.stream().max(Comparator.comparing(Integer::valueOf)).get();
		
		System.out.println("Max Value::"+max);
	}

}
