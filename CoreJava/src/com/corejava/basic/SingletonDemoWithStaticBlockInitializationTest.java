package com.corejava.basic;

public class SingletonDemoWithStaticBlockInitializationTest {

	public static void main(String[] args) {

		SingletonDemoWithStaticBlockInitialization object1=SingletonDemoWithStaticBlockInitialization.getInstance();
		SingletonDemoWithStaticBlockInitialization object2=SingletonDemoWithStaticBlockInitialization.getInstance();
		SingletonDemoWithStaticBlockInitialization object3=SingletonDemoWithStaticBlockInitialization.getInstance();
		SingletonDemoWithStaticBlockInitialization object4=SingletonDemoWithStaticBlockInitialization.getInstance();

		System.out.println("Object1::"+object1.hashCode());
		System.out.println("Object2::"+object2.hashCode());
		System.out.println("Object3::"+object3.hashCode());
		System.out.println("Object4::"+object4.hashCode());

		
	}

}
