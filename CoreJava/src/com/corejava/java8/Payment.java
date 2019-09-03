package com.corejava.java8;

public interface Payment {
	//All the subclasses must have to implement interface methods
	//void pay(); //abstract method
	
	//default method(body allowed in interface after java 8)
	default void pay() {
		System.out.println("Payment:pay()");
	}
	
}
