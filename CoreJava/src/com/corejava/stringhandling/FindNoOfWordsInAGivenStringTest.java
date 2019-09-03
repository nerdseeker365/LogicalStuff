package com.corejava.stringhandling;

import java.util.Scanner;
import java.util.StringTokenizer;

public class FindNoOfWordsInAGivenStringTest {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter One String");
		String inputString=scanner.nextLine();
		int noOfWords=findNumberOfWordsInAGivenString(inputString);
		System.out.println("No of words in a given String"+inputString+"Are"+noOfWords);
	}

	private static int findNumberOfWordsInAGivenString(String inputString) {

		/*
		 * StringTokenizer tokenizer=new StringTokenizer(inputString, " "); String
		 * outputString=null;
		 * 
		 * if(tokenizer.hasMoreTokens()) { outputString=tokenizer.nextToken();
		 * System.out.println(outputString); }
		 */
		int count=0;
		String[] inputStringArray=inputString.split(" ");
		for(String outputString:inputStringArray) {
			System.out.println(outputString);
			count++;
		}
		
		return count;
	}
	
	

}
