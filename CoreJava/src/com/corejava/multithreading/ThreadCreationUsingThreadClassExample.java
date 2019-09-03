package com.corejava.multithreading;

public class ThreadCreationUsingThreadClassExample {

	public static void main(String[] args) {

		// creating Thread object
		MultiThreadingDemo demo = new MultiThreadingDemo();

		System.out.println("Thread:" + Thread.currentThread().getName()); //main
		// this job performed by main thread
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// starting a thread
		demo.start();

		
		
	
	
		
	}

}
