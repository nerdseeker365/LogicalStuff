package com.corejava.basic;

import com.corejava.basic.Outer.Inner;

public class NestedInnerClassTest {

	public static void main(String[] args) {
		
		//invoke Inner class method
       Outer.Inner inner=new Outer().new Inner();
		
		inner.show();
	}
}
