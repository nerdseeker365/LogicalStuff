package com.corejava.logical;

public class RemoveWhiteSpacesInStringWithoutBuiltinMethod {

	public static void main(String[] args) {

        String str = "India     Is My    Country";  
        String outputStr="";
        char[] charArray=str.toCharArray();
        
        for(int i=0;i<charArray.length;i++) {
        	
        	if(charArray[i]!=' ' && charArray[i]!='\t') {
        		outputStr=outputStr+charArray[i];
        	}
        }
        
        System.out.println("Input String is::"+str);
        System.out.println("Output String without WhiteSpace is::"+outputStr);
	}

}
