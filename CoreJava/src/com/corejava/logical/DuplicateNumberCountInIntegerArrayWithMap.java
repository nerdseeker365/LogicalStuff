package com.corejava.logical;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumberCountInIntegerArrayWithMap{

	public static void main(String[] args) {

		int[] intArray={1, 2, 3, 4, 2, 7, 8, 8, 8,3};  //2->2,3->2,8->2

		Map<Integer,Integer> integerMap=new HashMap<>();
		
		for(int i:intArray) {
			if(integerMap.containsKey(i)) {
				integerMap.put(i, integerMap.get(i)+1);
			}else {
				integerMap.put(i, 1);
			}
		}
		
		for(int i:integerMap.keySet()) {
			if(integerMap.get(i)>1) {
				System.out.println("Duplicate Character are::"+i+"count::"+integerMap.get(i));
			}
		}
	}

}
