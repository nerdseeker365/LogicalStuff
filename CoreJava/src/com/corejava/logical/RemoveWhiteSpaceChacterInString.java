package com.corejava.logical;

public class RemoveWhiteSpaceChacterInString {

	public static void main(String[] args) {

        String str = "India     Is My    Country";  
        
        str=str.replaceAll("\\s", "");  //s for whitespaces
        
        System.out.println("Output String is::"+str);
	}

}
