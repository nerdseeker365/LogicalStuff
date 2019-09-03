package com.corejava.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FindSmallestElementInPrimitiveArrayUsingStreamApi {

	public static void main(String[] args) {

		//Declare cum initialize Integer Array
		int[] intArray= {1,2,3,4,5,6,7,8,9,10};
		
		//convert Array to List
		List<int[]> intArrayList=Arrays.asList(intArray);
		
		//using Anonymous class
		
		//iterate Integer List using forEach method
		/*
		 * intArrayList.forEach(new Consumer<int[]>() {
		 * 
		 * @Override public void accept(int[] t) {
		 * 
		 * 
		 * } });
		 */
		
		//iterate Integer List using forEach method with java8 Lambda Expression
		intArrayList.forEach((int[] i) ->{
			int min=0; 
			//iterate Integer Array using enhanced for loop
			for(int i1:i) {
				min=IntStream.of(i1).min().getAsInt();
				System.out.println("minimum::"+min);
			}
			System.out.println("min value:"+min);

			}
		);
	}

}
