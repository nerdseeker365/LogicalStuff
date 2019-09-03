package com.corejava.basic;

import java.util.Arrays;
import java.util.Scanner;

public class CopyElementsOfArrayUsingPredefinedMethod {

	public static void main(String[] args) {

		int[] oldArray = null;
		int[] newArray = null;
		int[] resultArray=null;
		Scanner scanner = null;
		int arrlength = 0;

		scanner = new Scanner(System.in);

		System.out.println("Enter Number Of Elements in a given Array::");
		arrlength = scanner.nextInt();

		/**
		 * Array Declaration
		 */
		oldArray = new int[arrlength];

		/**
		 * Array Initialization
		 */
		for (int i = 0; i < oldArray.length; i++) {
			System.out.println("Enter Array Elements::");
			oldArray[i] = scanner.nextInt();
		}

		System.out.println("Array Elements Before Copy are::");
		System.out.println(Arrays.toString(oldArray));
		
		copyArrayElementsIntoAnotherArray(oldArray);
		
		
	}

	private static void copyArrayElementsIntoAnotherArray(int[] oldArray) {
		
		int[] newArray=null;
		/**
		 * new Array declaration
		 */
		newArray=new int[oldArray.length];
		
		/**
		 * copy operation from old array to new array
		 */
		
		System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
		
		System.out.println("Array Elements After Copy are::");
		System.out.println(Arrays.toString(newArray));
		
	}

}
