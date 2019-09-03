package com.corejava.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingletonDemoWithSerializationTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		SingletonDemoWithSerialization instance1=SingletonDemoWithSerialization.getInstance();
		
		
		 ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
	                "singleton.ser"));
	        out.writeObject(instance1);
	        out.close();
	        
	        ObjectInput in = new ObjectInputStream(new FileInputStream(
	                "singleton.ser"));
	        
	        SingletonDemoWithSerialization instance2=(SingletonDemoWithSerialization) in.readObject();
	        
	        in.close();
	        
	        System.out.println("Object1::"+instance1.hashCode());
	        System.out.println("Object2::"+instance2.hashCode());

	}

}
