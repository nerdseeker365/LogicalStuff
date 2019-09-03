package com.corejava.basic;

import java.util.Scanner;

public class MatrixSumProgram {

	public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        
		//First matrix Elements
		System.out.println("Enter Number of rows  in  matrix::");
		int row=scanner.nextInt();
		
		System.out.println("Enter Number of columns  in  matrix::");
		int column=scanner.nextInt();
		
		int first[][]=new int[row][column];
		int second[][]=new int[row][column];
		
		System.out.println("Enter First Matrix Elements");
		//first matrix initialization
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				first[i][j]=scanner.nextInt();
			}
		}
		
		System.out.println("Enter Second Matrix Elements");
		      //second matrix initialization
				for(int i=0;i<row;i++) {
					for(int j=0;j<column;j++) {
						second[i][j]=scanner.nextInt();
					}
				}
				
				int sum[][]=calculateSumofTwoMatrix(first,second,row,column);
			
				System.out.println("The Matrix Sum is::");
				for(int[] i:sum) {
					for(int i1:i) {
						System.out.print(i1+"  ");
					}
					System.out.println();
				}
	}
	
	private static int[][] calculateSumofTwoMatrix(int[][] first,int[][] second,int row,int column){
		System.out.println("inside method...");
		int sum[][]=new int[row][column];
		//sum of above 2 matrix
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				sum[i][j]=first[i][j]+second[i][j];
			}
		}		
		return sum;
	}

}
