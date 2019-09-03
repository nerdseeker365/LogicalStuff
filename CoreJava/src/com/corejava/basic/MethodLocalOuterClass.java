package com.corejava.basic;

public class MethodLocalOuterClass {
	
	
	public void outerMethod() {
		
		 int x=10;
		//final int x=10;
		//Method Local Inner class
		class Inner{
			void innerMethod() {
				System.out.println("Inside Inner Method..");
				
				//in jdk 1.8 possible,upto jdk 1.7 error
				System.out.println("Accessing local variable of outer class method::"+x);
				
			}
		}
		
		Inner inner=new Inner();
		inner.innerMethod();
	}

}
