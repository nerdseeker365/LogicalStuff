package com.corejava.logical;

import java.util.Arrays;

public class ReverseEachWordOfInString {

	public static void main(String[] args) {

		String str="Ashutosh Pandey";
		
		String[] wordsArray=str.split(" ");
		
        for(String word:wordsArray) {
        	
        	for(int i=word.length()-1;i>=0;i--) {
        		System.out.print(word.charAt(i));
        	}
        	
        	System.out.println();
        }
		
	}

}
