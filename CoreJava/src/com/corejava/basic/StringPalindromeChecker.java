package com.corejava.basic;

import java.util.Scanner;

public class StringPalindromeChecker {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		boolean status=false;
		
		System.out.println("Enter Input String::");
		String input=scanner.nextLine();
		
		status=palindromeChecker(input);
		
		if(status)
			System.out.println("Given String is palindrome");
		else 
			System.out.println("Given String is not  palindrome");
	}

	private static boolean palindromeChecker(String input) {

		String reverseString=null;
		
		reverseString=reverse(input);
		
		//check
		if(reverseString.compareTo(input)==0) {
			return true;
		}
		return false;
		
	}

	private static String  reverse(String input) {

		String reverse="";
		
		//making reverse of given string
		for(int i=input.length()-1;i>=0;i--) {
			reverse=reverse+input.charAt(i);
		}
		return reverse;
		
	}

}
