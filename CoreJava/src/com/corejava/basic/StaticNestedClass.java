package com.corejava.basic;

public class StaticNestedClass {

	
	private static void outerMethod() {
		System.out.println("Inside outer Method().....");
	}
	
	//static Inner class
	static class Inner{
	public static void main(String[] args) {
		System.out.println("Inside Inner class method....");
		outerMethod();
	}
	}

}
