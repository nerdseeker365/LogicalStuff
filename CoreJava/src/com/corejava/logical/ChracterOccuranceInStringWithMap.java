package com.corejava.logical;

import java.util.HashMap;
import java.util.Map;

public class ChracterOccuranceInStringWithMap {

	public static void main(String[] args) {

        String str = "StringHandlingIsTheMostImportantTopicInTheInterviewRoom";
        
        str=str.toLowerCase();
        
        Map<Character,Integer> characterMap=new HashMap<>();
        
        char[] charArray=str.toCharArray();
        
        for(char ch:charArray) {
        	if(characterMap.containsKey(ch)) {
        		characterMap.put(ch, characterMap.get(ch)+1);
        	}else {
        		characterMap.put(ch, 1);
        	}
        }
        
        System.out.println(characterMap);
       
	}

}
