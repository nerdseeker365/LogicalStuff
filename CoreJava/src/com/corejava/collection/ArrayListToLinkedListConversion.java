package com.corejava.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListToLinkedListConversion {

	public static void main(String[] args) {

		List<String> arraylist=Arrays.asList("Ashutosh","Ashish","Manish");
		
		List<String> linkedlist=new LinkedList<>();
		
		for(String string:arraylist) {
			linkedlist.add(string);
		}
		
		System.out.println(linkedlist);
		
	}

}
