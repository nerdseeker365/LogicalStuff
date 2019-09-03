package com.corejava.multithreading;

public class ClassLevelLock implements Runnable{

	//sharable state
	private static final Object lock=new Object();
	
	@Override
	public void run() {
		//System.out.println("Current Object(this) reference::" + this);
		System.out.println("inside run() method.....");

			lock();
		
	}
	
	
	//static synchronized method
	
	/*
	 * private static synchronized void lock() {
	 * 
	 * //System.out.println("Current Object(this) reference::"+this);
	 * 
	 * System.out.println("inside lock() method....");
	 * 
	 * System.out.println("Currently Running Thread::"+Thread.currentThread().
	 * getName());
	 * 
	 * }
	 */
	 
		//Or Method-2 for doing same thing 
	
	/*
	 * private void lock() throws InterruptedException {
	 * 
	 * //System.out.println("Current Object(this) reference::"+this);
	 * 
	 * System.out.println("inside lock() method....");
	 * 
	 * //Class Level lock is used for static synchronized method synchronized
	 * (ClassLevelLock.class) {
	 * System.out.println("Currently Running Thread::"+Thread.currentThread().
	 * getName()); System.out.println("Inside Synchronized Block");
	 * 
	 * }
	 * 
	 * }
	 */
	 

	  //method-3 to lock the sharable object
	   private void lock() {
		   
		   System.out.println("inside lock() method....");
		   
		   synchronized (lock) {
			   System.out.println("Currently Running Thread::"+Thread.currentThread().getName()); 
			   System.out.println("Inside Synchronized Block");
		}
	   }
	
		public static void main(String[] args) {

			ClassLevelLock lock1 = new ClassLevelLock();

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
