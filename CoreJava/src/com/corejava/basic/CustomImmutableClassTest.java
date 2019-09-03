package com.corejava.basic;

public class CustomImmutableClassTest {

	public static void main(String[] args) {

		//create Custom class
		CustomImmutableClass clazz=new CustomImmutableClass("CustomImmutableClass", "com.corejava.basic");
		
		System.out.println("Class Name::"+clazz.getClassName());
		System.out.println("Package Name::"+clazz.getPackageName());
		
		//trying to change class name and package name after object state initialized
		//clazz.className="NewClass";   //CE
	   
		// clazz.packageName="com.new.dev.basic"; //CE
	
	}

}
