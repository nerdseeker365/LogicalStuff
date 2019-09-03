package com.corejava.operators;

public class ArithmeticOperator {

	public static void main(String[] args) {

		int x, y = 10, z = 5;
		x = y + z; //10+5=15
		System.out.println("+ operator resulted in " + x);//15
		x = y - z; //10-5=5
		System.out.println("- operator resulted in " + x);//5
		x = y * z; //10*5=50
		System.out.println("* operator resulted in " + x);//50
		x = y / z;//10/5=2
		System.out.println("/ operator resulted in " + x);//2
		x = y % z; //10%5=0
		System.out.println("% operator resulted in " + x); //0
		x = y++; //
		System.out.println("Postfix ++ operator resulted in " + x); //10
		x = ++z;
		System.out.println("Prefix ++ operator resulted in " + x); //6
		System.out.println("y:"+y); //y:11
		x = -y; 
		System.out.println("Unary operator resulted in " + x);
		// Some examples of special Cases
		int tooBig = Integer.MAX_VALUE + 1; // -2147483648 which is
		// Integer.MIN_VALUE.
		int tooSmall = Integer.MIN_VALUE - 1; // 2147483647 which is
		// Integer.MAX_VALUE.
		System.out.println("tooBig becomes " + tooBig);
		System.out.println("tooSmall becomes " + tooSmall);System.out.println(4.0 / 0.0); // Prints: Infinity
		System.out.println(-4.0 / 0.0); // Prints: -Infinity
		System.out.println(0.0 / 0.0); // Prints: NaN
		double d1 = 12 / 8; // result: 1 by integer division. d1 gets the value
		// 1.0.
		double d2 = 12.0F / 8; // result: 1.5
		System.out.println("d1 is " + d1);
		System.out.println("d2 iss " + d2);
	}

}
