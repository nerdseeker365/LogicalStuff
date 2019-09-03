package com.corejava.java8;

import java.util.Optional;

public class OptionalClauseJava8 {

	public static void main(String[] args) {

		    String[] str = new String[10];  
	       // String lowercaseString = str[5].toLowerCase();  
	       // System.out.print(lowercaseString); 
		    
		    //System.out.println(str[10]);
		    
		  //  System.out.println(str[3].toLowerCase());
		    
		   // str[3]="Manish";
		    
		    Optional<String> checkNull=Optional.ofNullable(str[3]);
		    
		    if(checkNull.isPresent()) {
		    	str[3]=str[3].toLowerCase();
		    	System.out.println("Modified String::"+str[3]);
		    }
		    else {
		    	System.out.println("Null Value is there in this variable:");
		    }
	        
	        
	}

}
