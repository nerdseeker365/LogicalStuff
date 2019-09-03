package com.corejava.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class FindLargestElementInPrimitiveArrayUsingStreamAPI {

	public static void main(String[] args) {

		//Creating Integer Array of size:5
		int[] intArray= {1,2,3,4,5,6,7,8,9,10};
		
		List<int[]> intArrayList=Arrays.asList(intArray);
		
		//intArrayList.stream().max(Comparator.comparing(Integer::valueOf)).get();
		//Iterate List using forEach method
		intArrayList.forEach(i->{
			int max=0;
			IntStream integerArrayStream=Arrays.stream(intArray);
			//Iterate Array using Enhanced For Loop
			for(int i1:i) {
				max=IntStream.of(i1).max().getAsInt();
				System.out.println("maximum::"+max);

			}
			System.out.println("max value::"+max);
		});
		
		
	}

}
