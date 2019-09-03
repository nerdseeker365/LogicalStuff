package com.corejava.basic;


public class SingletonDemoEagerInitialization {
	
	//Eager Instantiation
	private static SingletonDemoEagerInitialization singleton=new SingletonDemoEagerInitialization();
	
	//private constructor
	private SingletonDemoEagerInitialization() {}
	
	//static Factory Method
	public static SingletonDemoEagerInitialization getInstance() {
		//System.out.println("Singleton::"+singleton);
	    return singleton;		
	}
	
	
}
