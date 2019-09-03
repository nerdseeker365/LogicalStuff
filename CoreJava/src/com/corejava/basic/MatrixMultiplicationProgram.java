package com.corejava.basic;

import java.util.Scanner;

public class MatrixMultiplicationProgram {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// First matrix Elements
		System.out.println("Enter Number of rows  in  First matrix::");
		int row = scanner.nextInt();

		System.out.println("Enter Number of columns  in First  matrix::");
		int column = scanner.nextInt();

		int first[][] = new int[row][column];
		
		System.out.println("Enter First Matrix Elements");
		// first matrix initialization
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				first[i][j] = scanner.nextInt();
			}
		}

		int r=column;
		
		System.out.println("Enter Number of Colums in second matrix::");
		int col=scanner.nextInt();
		
		int second[][] = new int[r][col];

		
		System.out.println("Enter Second Matrix Elements");
		// second matrix initialization
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < col; j++) {
				second[i][j] = scanner.nextInt();
			}
		}

		int mul[][] =calculateMultiplicationofTwoMatrix(first, second,row, r,col);

		System.out.println("The Matrix Multiplication is::");
		for (int[] i : mul) {
			for (int i1 : i) {
				System.out.print(i1 + "  ");
			}
			System.out.println();
		}
	}

	private static int[][] calculateMultiplicationofTwoMatrix(int[][] first, int[][] second, int row, int r,int col) {
		System.out.println("inside method...");
		int mul[][] = new int[r][col];
		// multiply of above 2 matrix
		
		return null;
	}

}
