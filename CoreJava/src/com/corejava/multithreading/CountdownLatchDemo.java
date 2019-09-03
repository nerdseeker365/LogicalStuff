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
		Thread.sleep(delay);
		latch.countDown();
		 System.out.println(Thread.currentThread().getName() 
                 + " finished"); 

	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}		
	}
	
}

public class CountdownLatchDemo{
	
	public static void main(String[] args) {
		
		CountDownLatch latch=new CountDownLatch(3);
		
		Worker worker=new Worker(1000, latch);
		Worker worker2=new Worker(2000, latch);
		Worker worker3=new Worker(2000, latch);
		
		worker.start();
		worker2.start();
		worker3.start();
		
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		// Main thread has started 
        System.out.println(Thread.currentThread().getName() + 
                           " has finished"); 
		
		
		
	}
}
