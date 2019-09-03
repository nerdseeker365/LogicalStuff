package com.corejava.basic;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementFromSpecifiedIndexInArray {

	public static void main(String[] args) {

		Scanner scanner =new Scanner(System.in);
		int arrLength=0;
		int[] arr=null;
		int[] newArray=null;
		int index=0;
		
		System.out.println("Enter Number of Elements in Array::"); //4
		arrLength=scanner.nextInt();
		/**
		 * Array Declaration
		 */
		arr=new int[arrLength];
		
		/**
		 * Array Initialization
		 */
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter Array elements::");
			arr[i]=scanner.nextInt();
		}
		
		System.out.println("Enter the index position to delete elements::");
		index=scanner.nextInt();
		
		
		System.out.println("Before Deletion Array Elements are::");
		System.out.println(Arrays.toString(arr));
		
		newArray=deleteElementAtSpecifiedIndex(arr,index);
		
		System.out.println("Array Elements After Deletion are::");
	
		System.out.println(Arrays.toString(newArray));
	}

	private static int[] deleteElementAtSpecifiedIndex(int[] arr, int index) {

		int[] newArray=null;
		
		
		/**
		 * Array Initialization
		 */
		
		newArray=new int[arr.length-1];
		/**
		 * copy old array elements into new Array before index
		 */
		
		for(int i=0;i<index;i++) {
			newArray[i]=arr[i];
		}
		
		for(int i=index+1;i<arr.length;i++) { //3,4
			newArray[i-1]=arr[i];
		}
		
		return newArray;
		
	}

}
