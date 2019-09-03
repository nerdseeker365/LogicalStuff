package com.corejava.multithreading;

public class Shared {
	
	synchronized void test1(Shared s2) {
		System.out.println("test1() started.....");
		
		Util.sleep(2000);
		
		System.out.println("current object ref::"+this);
		s2.test2(this);
		
		System.out.println("test1() ended.....");

	
	}
	
    synchronized void test2(Shared s1) {
		System.out.println("test2() started.....");
		
		Util.sleep(2000);
		
		System.out.println("current object ref::"+this);

		s1.test1(this);
		
		System.out.println("test2() ended.....");


	}

}
