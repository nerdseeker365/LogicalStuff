package com.corejava.logical;

public class DuplicateNumberCheckerInIntegerArray {

	public static void main(String[] args) {

		int[] intArray={1, 2, 3, 4, 2, 7, 8, 8, 3};  //2->2,3->2,8->2
		
		System.out.println("Duplicate Numbers Are::");
		for(int i=0;i<intArray.length;i++) {
			
			  for(int j=i+1;j<intArray.length;j++) {
				  if(intArray[i]==intArray[j]) {
					  
					  System.out.println(intArray[j]);
					  
				  }
			  }
		}
		
		

	}

}
