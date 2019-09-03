package com.corejava.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSetConversion {

	public static void main(String[] args) {

		//Method-1
		List<String> list=Arrays.asList("Ashutosh","Ashutosh","Dinesh","Ramesh");
		
	/*	System.out.println(list);
		
		Set<String> set=new HashSet<>(list);
		
		System.out.println(set);
		
		//Method-2
		
		Set<String> set2=new HashSet<>();
		
		set2.addAll(list);
		
		System.out.println(set2);*/
		
		//Method-3
		Set<String> set=new HashSet<>();

		for(String e:list) {
			set.add(e);
		}
		System.out.println(set);
	}

}
