package com.corejava.multithreading;

import java.util.concurrent.CountDownLatch;

 class Worker extends Thread{
	
	private int delay;
	private CountDownLatch latch;
	
	public Worker(int delay, CountDownLatch latch) {
		super();
		this.delay = delay;
		this.latch = latch;
	}

	@Override
	public void run() {

       try {
		Thread.sleep(3000);
		latch.countDown();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}		
	}
	
}

public class CountdownLatchDemo{
	
	public static void main(String[] args) {
		
	}
}
