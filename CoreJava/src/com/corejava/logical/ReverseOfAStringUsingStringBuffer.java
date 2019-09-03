package com.corejava.logical;

public class ReverseOfAStringUsingStringBuffer {

	public static void main(String[] args) {

		String str="Ashutosh";
		
		StringBuffer  buffer=new StringBuffer(str);
		
		System.out.println("Reverse Of a Given String Are::"+buffer.reverse());
	}

}
