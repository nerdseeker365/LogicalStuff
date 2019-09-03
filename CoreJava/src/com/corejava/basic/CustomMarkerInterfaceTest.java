package com.corejava.basic;

public class CustomMarkerInterfaceTest {

	public static void main(String[] args) {

		
		Product1 product1=new Product1();
		Product2 product2=new Product2();
		
		
		//For Product1
		testingForMarkerInterface(product1);
		
		//For Product2
		testingForMarkerInterface(product2);
	}

	private static void testingForMarkerInterface(Object product) {

		        //Testing for Marker Interface using instanceof operator
				if(product instanceof ProductMarkerInterface ) {
					System.out.println(product.getClass().getSimpleName()+" is given Marker Interface Type...");
				}else {
					System.out.println(product.getClass().getSimpleName()+" is not given Marker Interface Type...");
				}
	}

}
