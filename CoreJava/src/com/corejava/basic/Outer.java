package com.corejava.basic;

public class Outer {
	
	//Nested Inner Class
	class Inner{
		
		  public void show() { System.out.println("show() method called...."); }
		 
		
		/* Compile Time Error
		 * public static void show() { System.out.println("show() method called...."); }
		 */
		
	}

}
