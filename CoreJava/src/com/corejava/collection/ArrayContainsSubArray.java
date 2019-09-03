package com.corejava.collection;

import java.util.Arrays;
import java.util.List;

public class ArrayContainsSubArray {

	public static void main(String[] args) {

		int[] intArray= {1,2,3,4,5,6,7,8};
		int[] intArray2= {2,3,4};
		
		checkForSubArray(intArray,intArray2);
	}
	
	private static void checkForSubArray(int[] intArray,int[] intArray2) {
		
		//Convert incoming Arrays into list
		
		 List<int[]> list1=Arrays.asList(intArray);
		 
		 List<int[]> subList=Arrays.asList(intArray2);
		 
		 if(list1.containsAll(subList)) {
			 System.out.println("Given Array contains the SubArray..............");
		 }
		 else {
			 System.out.println("Given Array does not contain the SubArray..............");

		 }
	}

}
