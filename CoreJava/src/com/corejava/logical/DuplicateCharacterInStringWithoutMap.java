package com.corejava.logical;

public class DuplicateCharacterInStringWithoutMap {

	public static void main(String[] args) {

        String str = "StringHandlingIsTheMostImportantTopicInTheInterviewRoom";
        
        str=str.toLowerCase();
        
        
        int count=0;
        
        System.out.println("Duplicate Characters are::");
        for(char ch:str.toCharArray()) {
           count=findDuplicateCharacter(str,ch);
           
           if(count>1) {
           	System.out.println(ch);
           }
        }
        
        
        
	}

	private static int findDuplicateCharacter(String str, char ch) {
		int count=0;
		while(str.indexOf(ch)>=0) {
			count++;
			str=str.substring(str.indexOf(ch)+1);
		}
		return count;
	}

}
