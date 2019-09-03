package com.corejava.logical;

public class CharacteOccuranceInStringwithoutCollection {

	public static void main(String[] args) {

        String str = "StringHandlingIsTheMostImportantTopicInTheInterviewRoom";
        
        str=str.toLowerCase();
        //s->3,t->7,i->7,o->4,
        int count=0;
        
        char[] charArray=str.toCharArray();
        
        for(char ch:charArray) {
        	count=freqCount(str,ch);
        	System.out.println("Character "+ch+" appears "+count+" times");
        }
    
	}

	private static int freqCount(String str, char ch) {

		int count=0;
		while(str.indexOf(ch)>=0) {
			count++;
			str=str.substring(str.indexOf(ch)+1);
		}
		return count;
	}
	
	

}
