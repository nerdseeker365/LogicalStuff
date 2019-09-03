package com.corejava.basic;

public class SingletonDemoWithDoubleCheckLocking {
	
	private static SingletonDemoWithDoubleCheckLocking instance;
	
	private SingletonDemoWithDoubleCheckLocking() {}
	
	public static SingletonDemoWithDoubleCheckLocking getInstance() {
		if(instance==null) {
		   synchronized (SingletonDemoWithDoubleCheckLocking.class) {

			    if(instance==null) {
				instance=new SingletonDemoWithDoubleCheckLocking();
			    }
		   }
		}
		return instance;
	}

}
