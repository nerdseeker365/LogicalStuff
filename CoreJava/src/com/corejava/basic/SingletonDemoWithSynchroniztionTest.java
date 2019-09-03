package com.corejava.basic;

public class SingletonDemoWithSynchroniztionTest {

	public static void main(String[] args) {

		SingletonDemoWithSynchronization object1=SingletonDemoWithSynchronization.getInstance();
		SingletonDemoWithSynchronization object2=SingletonDemoWithSynchronization.getInstance();
		SingletonDemoWithSynchronization object3=SingletonDemoWithSynchronization.getInstance();
		SingletonDemoWithSynchronization object4=SingletonDemoWithSynchronization.getInstance();

		System.out.println("Object1::"+object1.hashCode());
		System.out.println("Object2::"+object2.hashCode());
		System.out.println("Object3::"+object3.hashCode());
		System.out.println("Object4::"+object4.hashCode());

		
	}

}
