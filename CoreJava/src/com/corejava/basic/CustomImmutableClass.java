package com.corejava.basic;


/**
 * 
 * Custom immutable class development
 * 
 *  1.) make this class as final class so no child class can be created to change its object state
 *  through outside.
 *  
 *  2.) declare all the properties as final so that once it initialized so further modification is not allowed 
 *  as final variable value we cannot changed..
 *  
 *  3.) provide only getter methods for all properties but not any setter methods as we know if we will provide setter methods then 
 *  after object initialization also that object state value can be modified.
 *  
 *  4.) provide parameterized constructor for first time object state initialization
 *  
 */
public final class CustomImmutableClass {

	  final String className;
	  final String packageName;
	
	
	public CustomImmutableClass(String clsName,String pkgName) {
		this.className=clsName;
		this.packageName=pkgName;
	}
	
	public String getClassName() {
		return className;
	}
	public String getPackageName() {
		return packageName;
	}
	
	
	
}
