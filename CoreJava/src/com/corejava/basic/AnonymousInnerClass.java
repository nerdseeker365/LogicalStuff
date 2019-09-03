package com.corejava.basic;

public class AnonymousInnerClass {

	public static void main(String[] args) {
		System.out.println("Inside main method()........");
		//first.first();
		one.first();
		
	}
	
	//Implementation of Subclass
	/*
	 * static First first=new First() {
	 * 
	 * @Override public void first() { super.first();
	 * System.out.println("first() method called in Anonymous Inner class....");
	 * //first.first(); } };
	 */
	
	//Implementation of Interface
	
	static FirstOne one=new FirstOne() {
		@Override
		public void first() {
			System.out.println("first() method called inside Anonymous class");
		}
	
	};

}

class First{
	public void first() {
		System.out.println("first() method called....");
	}
}


interface FirstOne{
	 //void first();
	default void first() {
		System.out.println("inside first() method of interface...");
	}
}