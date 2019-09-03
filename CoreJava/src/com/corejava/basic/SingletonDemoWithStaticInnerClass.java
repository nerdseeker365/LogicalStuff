package com.corejava.basic;

public class SingletonDemoWithStaticInnerClass {

	private SingletonDemoWithStaticInnerClass() {}
	
	private static class InnerSingleton{
		private static final SingletonDemoWithStaticInnerClass INSTANCE=new SingletonDemoWithStaticInnerClass();
	}
	
	public static SingletonDemoWithStaticInnerClass getInstance() {
		return InnerSingleton.INSTANCE;
	}
}
