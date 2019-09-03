package com.corejava.collection;

import java.util.Arrays;
import java.util.List;

public class FindOneListInsideAnotherList {

	public static void main(String[] args) {

           List<Integer> list1= Arrays.asList(1,2,3,4,5);
           List<Integer> list2= Arrays.asList(2,5,4);
           
         //  list1.stream().forEach(System.out::println);
         //  list2.stream().forEach(System.out::println);
           
         String message=checkForSubList(list1,list2);
           
         System.out.println(message);
	}

	private static String checkForSubList(List<Integer> list1, List<Integer> list2) {
        boolean status=  list1.containsAll(list2);
         
         if(status)
        	return "One List contains another List";
         return "One List does not contain another List";
	}

}
