package com.corejava.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSmallestElementInIntegerArrayUsingStreamApi {

	public static void main(String[] args) {

		List<Integer> integerList=Arrays.asList(4,5,7,6,9,8,1,2,3);

		int min=integerList.stream().min(Comparator.comparing(Integer::valueOf)).get();
		
		System.out.println("Minimum Value::"+min);
	}

}
