package com.corejava.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class SortProductBasedOnProductName {

	//Creating List of Products
			static List<Product> productList=new ArrayList<>();
	public static void main(String[] args) throws ParseException {

	
		Scanner scanner=new Scanner(System.in);
		int productid=0;
		String productName=null;
		float price=0.0F;
		String manufacturingDate=null;
		String expDate=null;
		int listSize=0;
		Product product=null;
		
		
		System.out.println("Enter Number of Products you want to be add into List:: ");
		listSize=scanner.nextInt(); //4
		
		
		while(listSize>0) {
		System.out.println("Enter Productid::");
		productid=scanner.nextInt();
		
		scanner.nextLine();
		System.out.println("Enter ProductName::");
		productName=scanner.nextLine();
		
		System.out.println("Enter Product Price::");
		price=scanner.nextFloat();
		
		scanner.nextLine();
		System.out.println("Enter Manufacturing date::");
		manufacturingDate=scanner.nextLine();
		
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		Date manufactureDate=format.parse(manufacturingDate);
		
		System.out.println("Enter Expiry date::");
		manufacturingDate=scanner.nextLine();
		
		Date expiryDate=format.parse(manufacturingDate);
		
		//initialize Product
		product=new Product(productid, productName, price, manufactureDate, expiryDate);
		
		sortProductByName(product);
		
		listSize--;
		}
		
		System.out.println("Products Are::");
		//display List elements
		productList.forEach(System.out::println);
		
	}

	private static void sortProductByName(Product product) {

	    //adding Product into List
         productList.add(product);
		
		//Using Collections Framework for sorting
         Collections.sort(productList);
	}
	

}
