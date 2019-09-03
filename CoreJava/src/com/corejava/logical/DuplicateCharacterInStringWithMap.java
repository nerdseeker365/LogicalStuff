package com.corejava.logical;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacterInStringWithMap {

	public static void main(String[] args) {

        String str = "StringHandlingIsTheMostImportantTopicInTheInterviewRoom";

        str=str.toLowerCase();
        
        Map<Character,Integer> characterMap=new HashMap<>();
        
        for(char ch:str.toCharArray()) {
        	
        	if(characterMap.containsKey(ch)) {
        		characterMap.put(ch, characterMap.get(ch)+1);
        	}else {
        		characterMap.put(ch, 1);
        	}
        }
        
       Set<Character> characterSet=characterMap.keySet();
       System.out.println("Duplicate Character  is::");
       for(char ch:characterSet) {
    	   
    	   if(characterMap.get(ch)>1) {
    		  System.out.println(ch);
    	   }
       }
        
	}

}
