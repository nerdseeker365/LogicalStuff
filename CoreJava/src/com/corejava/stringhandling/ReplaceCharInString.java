package com.corejava.stringhandling;

import java.util.Scanner;

public class ReplaceCharInString {

	public static void main(String[] args) {

		  Scanner scan=new Scanner(System.in);
		  System.out.println("Enter String");
		  String name= scan.nextLine();
		  char match='s'; //char a[]=name.toCharArray(); 
		  int count=0; 
		  String b = "";
		  
		  
		  for(int i=1;i<name.length();i++) {
		  
		  if(name.charAt(i)==match) { 
		   count++; //2
		   b=b+name.substring(0,i)+count;
		   System.out.println("b:"+b); 
		   name=name.substring(i+1);
		   System.out.println("name:"+name);
		  
		  System.out.println(b); }
		  
		  }
		  
		  
		 
		

	}

}
	




/*	for(int i=0;i<a.length;i++) {

if(a[i]==match) {
count++;
a[i]= (char) count;

}}
for(int i1=0;i1<a.length;i1++) {

System.out.print(a[i1]);

}*/
/*	System.out.println(a.toString());*/



