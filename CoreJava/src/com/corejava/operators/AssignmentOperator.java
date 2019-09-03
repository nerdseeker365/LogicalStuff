package com.corejava.operators;

public class AssignmentOperator {

	public static void main(String[] args) {

		// Assigning Primitive Values
		int j, k;
		j = 10;
		// j gets the value 10.
		j = 5;
		// j gets the value 5. Previous value is overwritten.
		k = j;
		// k gets the value 5.
		System.out.println("j is : "+j); // j is : 5
		System.out.println("k is : "+k); // k is : 5
		// Assigning References
		Integer i1 = new Integer("1");
		Integer i2 = new Integer("2");
		System.out.println("i1 is : "+i1); //i1 is :1
		System.out.println("i2 is : "+i2); //i2 is :2
		i1 = i2;
		System.out.println("i1 is : "+i1); //i1 is :2
		System.out.println("i2 is : "+i2); //i2 is :2
		// Multiple Assignments
		k = j = 10;
		// (k = (j = 10))
		System.out.println("j is : "+j); //j is :10
		System.out.println("k is : "+k); //k is :10
	}

}
