package com.corejava.basic;

public class SingletonDemoWithEnumTest {

	public static void main(String[] args) {

		SingletonDemoWithEnum instance1=SingletonDemoWithEnum.INSTANCE;
		SingletonDemoWithEnum instance2=SingletonDemoWithEnum.INSTANCE;
		SingletonDemoWithEnum instance3=SingletonDemoWithEnum.INSTANCE;
		SingletonDemoWithEnum instance4=SingletonDemoWithEnum.INSTANCE;
		
		System.out.println("Object1::"+instance1.hashCode());
		System.out.println("Object2::"+instance2.hashCode());
		System.out.println("Object3::"+instance3.hashCode());
		System.out.println("Object4::"+instance4.hashCode());


		
	}

}
