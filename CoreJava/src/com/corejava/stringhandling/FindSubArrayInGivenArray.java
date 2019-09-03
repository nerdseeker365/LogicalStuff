package com.corejava.stringhandling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSubArrayInGivenArray {

	public static void main(String[] args) {
	
		int[] arr1=new int[] {1,2,3,4,5};
		
		int[] arr2=new int[] {2,3,4};
		
		
		
		boolean status=false;
		
		status=checkSubArrayInsideMainArray(arr1,arr2);
		
		if(status) {
			System.out.println("Main Array contains Sub Array");
		}else {
			System.out.println("Main Array does not contain Sub Array");
		}
		
	}
	
	private static boolean checkSubArrayInsideMainArray(int[] mainArray,int[] subArray) {
		
        List<Integer> list1=new ArrayList<>();
		
		List<Integer> list2=new ArrayList<>();
		
		boolean status=false;
		
		List<int[]> list=Arrays.asList(mainArray);
		
		for(int[] i1:Arrays.asList(mainArray)) {
			for(int i:i1) {
				//System.out.println("main Array Elements:"+i);
				list1.add(i);
			}
		};
		
       // System.out.println(list);
		
		/*
		 * for(int i1:mainArray) { list1.add(i1); //1,2,3,4,5 }
		 */
		
		//after inserting I am printing List data
		//System.out.println("list1:"+list1);
		
		/*
		 * for(int i2:subArray) { list2.add(i2); //2,3,4 }
		 */
		
		//System.out.println("list2:"+list2);
		
		for(int[] i1:Arrays.asList(subArray)) {
			for(int i:i1) {
				//System.out.println("Sub Array Elements:"+i);
				list2.add(i);
			}
		};
		
		
		status=list1.containsAll(list2);
		
		
		return status;
	}

}
