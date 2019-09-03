package com.corejava.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ConvertMapToSet {

	public static void main(String[] args) {

		Map<Integer,String> map=new HashMap<>();
		
		map.put(1, "Ashutosh");
		map.put(2, "Ramesh");
		map.put(3, "Vinay");
		
        Set<Map.Entry<Integer,String>> entrySet=map.entrySet();
        
        for(Map.Entry<Integer, String> entry:entrySet) {
        	System.out.println("keys:"+entry.getKey());
        	System.out.println("values:"+entry.getValue());
        }
	}

}
