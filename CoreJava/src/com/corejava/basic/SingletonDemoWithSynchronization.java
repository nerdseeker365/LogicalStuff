package com.corejava.basic;

public class SingletonDemoWithSynchronization {
	
	private static SingletonDemoWithSynchronization instance;
	
	private SingletonDemoWithSynchronization() {};
	
	public static synchronized SingletonDemoWithSynchronization getInstance() {
		if(instance==null)
			instance=new SingletonDemoWithSynchronization();
		return instance;
	}

}
