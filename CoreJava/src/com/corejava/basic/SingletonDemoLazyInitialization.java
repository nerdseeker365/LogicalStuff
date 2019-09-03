package com.corejava.basic;

public class SingletonDemoLazyInitialization {
	
	private static SingletonDemoLazyInitialization singleton;
	
	
	private SingletonDemoLazyInitialization() {}
	
	
	public static SingletonDemoLazyInitialization getInstance() {
		
		if(singleton==null)
			singleton= new SingletonDemoLazyInitialization();
	    return singleton;		
	}
	

}
