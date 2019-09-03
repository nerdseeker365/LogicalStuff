package com.corejava.basic;

import java.util.Scanner;

public class FactorialFinderWithoutRecursion {

	public static void main(String[] args) {

		Scanner scanner=null;
		
		scanner=new Scanner(System.in);
		
		System.out.println("Enter the Number to find Factorial:: ");
		int no=scanner.nextInt();
		
		int factorialno=findFactororial(no);
	
		System.out.println("Factorial of given number "+no+" is "+factorialno);
	}

	private static int findFactororial(int no) {
		
		int fact=1;
		
		while(no>0) {
		fact=fact*no; //1*5*4*3*2*1
		no--;  //4
		}
		return fact;
	}
}
