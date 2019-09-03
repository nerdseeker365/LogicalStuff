package com.corejava.logical;

import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		int number=0;
		int m=0;
		int flag=0;
		
		System.out.println("Enter Number");
		number=scanner.nextInt();   //2,3,4
		
		m=number/2;  
		
		System.out.println("m::"+m);
		
		if(number==0 || number==1) {
			System.out.println("Given number "+number+ " is not a prime number");
		}
		
		else {
			for(int i=2;i<=m;i++) {
				if(number%i==0) {
					System.out.println("not a prime number");
					flag=1;
					break;
				}
			}
			
			if(flag==0) {
				System.out.println("Given Number "+number+"is a prime number");
			}
		}
	}

}
