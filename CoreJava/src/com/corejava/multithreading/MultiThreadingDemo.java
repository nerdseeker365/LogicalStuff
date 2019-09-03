package com.corejava.multithreading;

//Custom Thread
public class MultiThreadingDemo extends Thread {
	
	@Override
	public void run() {
		
		System.out.println("Thread:"+Thread.currentThread().getName());
       System.out.println("MultiThreadingDemo:run()");
       
       for(int i=1;i<=5;i++) {
    	   try {
				// Making main thread in sleeping state for 5 sec(5000 ms)
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
    	   System.out.println(i);
       }
	}

}
