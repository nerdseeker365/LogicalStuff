package com.corejava.basic;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementAtSpecifiedIndexInArray {

	public static void main(String[] args) {

		Scanner scanner =new Scanner(System.in);
		int arrLength=0;
		int[] arr=null;
		int index=0;
		int key=0;
		int[] resultArr=null;
		
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
		
	
		System.out.println("Enter the elements you want to insert in a given Array::");//95
		key=scanner.nextInt();
		
		System.out.println("At which position/index you want to insert::"); //2
		index=scanner.nextInt();
		
		System.out.println("Before Deletion Array Elements are::");
		System.out.println(Arrays.toString(arr));
		
		resultArr=insertElementAtSpecifiedIndex(arr, index, key);
		
		System.out.println("After insertion Array is::");
		System.out.println(Arrays.toString(resultArr));
		
	}
	
	public static int[] insertElementAtSpecifiedIndex(int[] oldArray,int index,int key) {
		int[] newArray=null;
		
		/**
		 * declare a new array having size more than 1 from existing Array
		 */
		newArray=new int[oldArray.length+1];
		
		
		/**
		 * copying old array data to new array one by one upto given index
		 */
		for(int i=0;i<index;i++) {
			newArray[i]=oldArray[i];
		}
		
		//put element in new Array at specified index
		newArray[index]=key;
		
		for(int i=index+1;i<newArray.length;i++) {
			newArray[i]=oldArray[i-1];
		}
		
		return newArray;
	
	}

}
