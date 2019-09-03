package com.corejava.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToListConversion {

	public static void main(String[] args) {

		
		//Method-1
		Set<String> set=new HashSet<>();
		
		set.add("Ashutosh");
		set.add("Manish");
		set.add("Ramesh");
		set.add("Ashutosh");
		
		//System.out.println(set);
		
		//List<String> list=new ArrayList<>();
		
		//list.addAll(set);
		
		//System.out.println(list);
		
		//Method-2
		/*
		 * for(String e1:set) { list.add(e1); }
		 */
		
		//System.out.println(list);
		
		
		//Method-3
		
		List<String> list=new ArrayList<>(set);
		
		System.out.println(list);
		
	}

}
