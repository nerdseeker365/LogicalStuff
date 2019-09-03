package com.corejava.stringhandling;

import java.util.Scanner;

public class ReverseOfAGivenString {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter One String");
		String inputString=scanner.nextLine();
		reverseOfAGivenString(inputString);
	}

	private static void reverseOfAGivenString(String inputString) {
		
		char ch;
		System.out.print("Reversed String:");
		for(int i=inputString.length()-1;i>=0;i--) {
		  ch=inputString.charAt(i);
		  System.out.print(ch);
		}
	}

}
