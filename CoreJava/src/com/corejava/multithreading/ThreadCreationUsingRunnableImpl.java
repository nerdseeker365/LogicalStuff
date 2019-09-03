package com.corejava.multithreading;

public class ThreadCreationUsingRunnableImpl {

	public static void main(String[] args) {

		System.out.println("Current Running Thread::" + Thread.currentThread().getName());

		// Create Thread object
		Thread th = new Thread(new RunnableImpl());

		// start a thread
		th.start();

		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

}
