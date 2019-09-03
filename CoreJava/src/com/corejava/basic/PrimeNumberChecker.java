package com.corejava.basic;

import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter  Number to check Prime or not::");
		int no=scanner.nextInt();
		
	
		boolean status=checkPrimeNumber(no);
		if(status) {
			System.out.println("Given Number is prime");
		}else {
			System.out.println("Given NUmber is not a prime");
		}
			
	}
	
	private static boolean checkPrimeNumber(int no) {
		System.out.println("inside method..");
	  int c=0;
		//logic
		for(int i=1;i<=no;i++) {
			if(no%i==0) {
				c++;
			}
		}
		
		if(c==2) {
			return true;
		}
		
		return false;
		
	}

}
