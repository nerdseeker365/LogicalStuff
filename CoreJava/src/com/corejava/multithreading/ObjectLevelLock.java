package com.corejava.multithreading;

public class ObjectLevelLock implements Runnable {

	//sharable Object
	private Object lock=new Object();
	
	@Override
	public void run() {

		//System.out.println("Current Object(this) reference::" + this);
		System.out.println("inside run() method.....");

		lock();

	}

	// non static synchronized method
	/*
	 * private void lock() {
	 * 
	 * // System.out.println("Current Object(this) reference::"+this);
	 * 
	 * System.out.println("inside lock() method....");
	 * 
	 * System.out.println("Currently Running Thread::"+Thread.currentThread().
	 * getName());
	 * 
	 * 
	 * //Object Level lock is used for non static synchronized method
	 * 
	 * synchronized (this) { System.out.println("Inside Synchronized Block"); }
	 * 
	 * }
	 */
	 

	//OR in another way (Method-2)
	
	/*
	 * private synchronized void lock() {
	 * 
	 * // System.out.println("Current Object(this) reference::"+this);
	 * 
	 * System.out.println("inside lock() method....");
	 * 
	 * System.out.println("Currently Running Thread::"+Thread.currentThread().
	 * getName());
	 * 
	 * }
	 */

	
	private void lock() {
		System.out.println("inside lock() method....");
		synchronized (lock) {
			System.out.println("Inside Synchronized Block"); 
		}
	}
	
	//method-3
	public static void main(String[] args) {

		ObjectLevelLock lock1 = new ObjectLevelLock();

		//System.out.println("Creating Object Reference::" + lock1);

		Thread thread1 = new Thread(lock1);

		thread1.setName("Thread-1");
		thread1.start();

		// creating Thread2 acquiring lock on same object
		Thread thread2 = new Thread(lock1);

		thread2.setName("Thread-2");

		thread2.start();

	}

}
