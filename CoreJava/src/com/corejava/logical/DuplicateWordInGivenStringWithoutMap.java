package com.corejava.logical;

public class DuplicateWordInGivenStringWithoutMap {

	public static void main(String[] args) {

        String str = "Big black bug bit a big black dog on his big black nose";  
        int count=0;
        
        str=str.toLowerCase();
        
       String[] wordsArray= str.split(" ");
       System.out.println("Duplicate Words Are::");
       
       for(int i=0;i<wordsArray.length;i++) {
    	   count=1;
    	   for(int j=i+1;j<wordsArray.length;j++) {
    		  
    		   if(wordsArray[i].equals(wordsArray[j])) {
    			   count++;
    			   wordsArray[j]="0";
    		   }
    	   }
    	   
    	   if(count>1 && wordsArray[i]!="0") {
    		   System.out.println(wordsArray[i]);
    	   }
       }
       
       
     
	}

}
