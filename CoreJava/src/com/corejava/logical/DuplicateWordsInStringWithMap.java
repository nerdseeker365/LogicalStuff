package com.corejava.logical;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInStringWithMap {

	public static void main(String[] args) {

        String str = "Big black bug bit a big black dog on his big black nose";  

        str=str.toLowerCase();
        
        Map<String,Integer> wordsMap=new HashMap<>();
        
        String[] wordsArray=str.split(" ");
        
        for(String word:wordsArray) {
        	
        	if(wordsMap.containsKey(word)) {
        		wordsMap.put(word, wordsMap.get(word)+1);
        	}else {
        		wordsMap.put(word,1);
        	}
        }
        
        Set<String> wordsSet=wordsMap.keySet();
        
        System.out.println("Duplicate Words Are::");
        for(String word:wordsSet) {
        	
        	if(wordsMap.get(word)>1) {
        		System.out.println(word);
        	}
        	
        }
		
	}

}
