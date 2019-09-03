package com.corejava.basic;

import java.io.Serializable;

public class SingletonDemoWithSerialization implements Serializable {
	
	private SingletonDemoWithSerialization() {}
	
	private static class InnerSingleton{
		private static final SingletonDemoWithSerialization instance=new SingletonDemoWithSerialization();
	}

	
	
	public static SingletonDemoWithSerialization getInstance() {
		return InnerSingleton.instance;
	}
	
	
	//without overriding No singleton
	//with Overrriding Pure Singleton

	/*
	 * protected Object readResolve() { return getInstance(); }
	 */
}
