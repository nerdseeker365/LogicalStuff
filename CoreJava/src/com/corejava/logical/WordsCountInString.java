package com.corejava.logical;

public class WordsCountInString {

	public static void main(String[] args) {

        String str = "Big black bug bit a big black dog on his big black nose";  

        String[] wordsArray=str.split(" ");
        
        System.out.println("No of words in a given String are::"+wordsArray.length);
	}

}
