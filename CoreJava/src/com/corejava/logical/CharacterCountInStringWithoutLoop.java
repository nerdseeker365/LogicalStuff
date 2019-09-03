package com.corejava.logical;

public class CharacterCountInStringWithoutLoop {

	public static void main(String[] args) {

		
		String str="india";
		char ch='i';
		
		str=str.toLowerCase();
		
		int count=str.length()-str.replace("i","").length();
		
		System.out.println("character count for "+ch+"is"+count);
	}

}
