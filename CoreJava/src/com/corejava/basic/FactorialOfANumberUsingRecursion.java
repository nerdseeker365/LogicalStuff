package com.corejava.basic;

import java.util.Scanner;

public class FactorialOfANumberUsingRecursion {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the number to find factorial::");
		int no=scanner.nextInt();
		
		int fact=findFactorial(no);
		
		System.out.println("Given Number is "+no+" And its factorial is "+fact);
		
	}
	
	
	private static int findFactorial(int no) {
		
		if(no==1) 	return 1;
		return no*findFactorial(no-1); //5*4*3*2*1
		
	}

}
