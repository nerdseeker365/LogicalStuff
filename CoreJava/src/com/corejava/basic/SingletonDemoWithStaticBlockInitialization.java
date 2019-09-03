package com.corejava.basic;

public class SingletonDemoWithStaticBlockInitialization {
	
	//Lazy Initialization
	private static SingletonDemoWithStaticBlockInitialization instance;
	
	//private Constructor
	private SingletonDemoWithStaticBlockInitialization() {};
	
	static {
		try {
			instance=new SingletonDemoWithStaticBlockInitialization();
		}catch (Exception e) {
			throw new RuntimeException("Error while Creating Singleton Instance:::");
		}
	}
	
	//static Factory Method
	public static SingletonDemoWithStaticBlockInitialization getInstance() {
		return instance;
	}

}
