package com.corejava.basic;

public class SingletonDemoWithStaticInnerClassTest {

	public static void main(String[] args) {

		SingletonDemoWithStaticInnerClass object1=SingletonDemoWithStaticInnerClass.getInstance();
		SingletonDemoWithStaticInnerClass object2=SingletonDemoWithStaticInnerClass.getInstance();
		SingletonDemoWithStaticInnerClass object3=SingletonDemoWithStaticInnerClass.getInstance();
		SingletonDemoWithStaticInnerClass object4=SingletonDemoWithStaticInnerClass.getInstance();

		
		
		System.out.println("Object1::"+object1.hashCode());
		System.out.println("Object2::"+object2.hashCode());
		System.out.println("Object3::"+object3.hashCode());
		System.out.println("Object4::"+object4.hashCode());

	}

}
