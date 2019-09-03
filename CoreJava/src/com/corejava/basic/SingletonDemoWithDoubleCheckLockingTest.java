package com.corejava.basic;

public class SingletonDemoWithDoubleCheckLockingTest {

	public static void main(String[] args) {

		SingletonDemoWithDoubleCheckLocking object1=SingletonDemoWithDoubleCheckLocking.getInstance();
		SingletonDemoWithDoubleCheckLocking object2=SingletonDemoWithDoubleCheckLocking.getInstance();
		SingletonDemoWithDoubleCheckLocking object3=SingletonDemoWithDoubleCheckLocking.getInstance();
		SingletonDemoWithDoubleCheckLocking object4=SingletonDemoWithDoubleCheckLocking.getInstance();

		
		System.out.println("Object1::"+object1.hashCode());
		System.out.println("Object2::"+object2.hashCode());
		System.out.println("Object3::"+object3.hashCode());
		System.out.println("Object4::"+object4.hashCode());

		
	}

}
