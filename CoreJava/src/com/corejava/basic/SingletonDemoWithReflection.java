package com.corejava.basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonDemoWithReflection {
	
	public static void main(String[] args) {
		
		SingletonDemoEagerInitialization instance1=SingletonDemoEagerInitialization.getInstance();
		SingletonDemoEagerInitialization instance2=null;
		
		
		Constructor[] constructors=SingletonDemoEagerInitialization.class.getDeclaredConstructors();
		
		
		for(Constructor constructor:constructors) {
			
			constructor.setAccessible(true);
			
			try {
				instance2=(SingletonDemoEagerInitialization) constructor.newInstance();
				break;
			} 
			catch (Exception e) {
                     e.printStackTrace();
			}
		}
		
		System.out.println("Object1::"+instance1.hashCode());
		System.out.println("Object2::"+instance2.hashCode());

		
	}

}
