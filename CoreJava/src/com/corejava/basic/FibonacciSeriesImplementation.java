package com.corejava.basic;

import java.util.Scanner;

public class FibonacciSeriesImplementation {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		int first=0;
		int second=1;
		int third=0;
		
		System.out.println("Enter The no of terms upto which you want to implement the Series");
		int no=scanner.nextInt(); //7                         ->0,1,1,2,3,5,8
		
		//print first two number in series
		System.out.print(first+"\t");  //0
		System.out.print(second+"\t"); //1
		
		for(int i=1;i<=no-2;i++) {
			third=first+second;  //third=0+1=1,2,3,5,
			System.out.print(third+"\t"); //1,
			first=second;  //1,1,2
			second=third; //1,2,3
		}
		
	}

}
