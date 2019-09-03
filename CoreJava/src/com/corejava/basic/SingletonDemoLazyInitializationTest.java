package com.corejava.basic;

public class SingletonDemoLazyInitializationTest {

	public static void main(String[] args) {

		SingletonDemoLazyInitialization object1=SingletonDemoLazyInitialization.getInstance();
		SingletonDemoLazyInitialization object2=SingletonDemoLazyInitialization.getInstance();
		SingletonDemoLazyInitialization object3=SingletonDemoLazyInitialization.getInstance();
		SingletonDemoLazyInitialization object4=SingletonDemoLazyInitialization.getInstance();
		
		
		System.out.println("Object1::"+object1.hashCode());
		System.out.println("Object2::"+object2.hashCode());
		System.out.println("Object3::"+object3.hashCode());
		System.out.println("Object4::"+object4.hashCode());

		
		
	}

}
