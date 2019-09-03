package com.corejava.basic;

public class SingletonDemoEagerInitializationTest {

	public static void main(String[] args) {

		//case-1
		SingletonDemoEagerInitialization singleton=SingletonDemoEagerInitialization.getInstance();
		SingletonDemoEagerInitialization singleton2=SingletonDemoEagerInitialization.getInstance();
		SingletonDemoEagerInitialization singleton3=SingletonDemoEagerInitialization.getInstance();
		SingletonDemoEagerInitialization singleton4=SingletonDemoEagerInitialization.getInstance();

		System.out.println("Object1::"+singleton.hashCode());
		System.out.println("Object2::"+singleton2.hashCode());
		System.out.println("Object3::"+singleton3.hashCode());
		System.out.println("Object4::"+singleton4.hashCode());
		
		
		
	}

}
