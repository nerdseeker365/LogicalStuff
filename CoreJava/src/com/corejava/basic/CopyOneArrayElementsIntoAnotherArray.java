package com.corejava.basic;

import java.util.Arrays;
import java.util.Scanner;

public class CopyOneArrayElementsIntoAnotherArray {

	public static void main(String[] args) {

		int[] oldArray=null;
		int[] newArray=null;
		int[] resultArr=null;
		Scanner scanner=null;
		int arrlength=0;
		
		
		
		scanner=new Scanner(System.in);
		
		System.out.println("Enter Number Of Elements in a given Array::");
		arrlength=scanner.nextInt();
		
		/**
		 * Array Declaration
		 */
		oldArray=new int[arrlength];
		
		/**
		 * Array Initialization
		 */
		for(int i=0;i<oldArray.length;i++) {
			System.out.println("Enter Array Elements::");
			oldArray[i]=scanner.nextInt();
		}
		
		System.out.println("Array Elements Before Copy are::");
		System.out.println(Arrays.toString(oldArray));
		
		
		resultArr=copyOnearrayToAnotherArray(oldArray);
		
		System.out.println("New Array Elements After Copy operation Are::");
		System.out.println(Arrays.toString(resultArr));
	}

	private static int[] copyOnearrayToAnotherArray(int[] oldArray) {

		int[] newArray=null;
		/**
		 * new Array declaration
		 */
		newArray=new int[oldArray.length];
		
		/**
		 * copy operation from old array to new Array index by index
		 */
		for(int i=0;i<oldArray.length;i++) {
			newArray[i]=oldArray[i];
		}
		
		return newArray;
		
	}

}
