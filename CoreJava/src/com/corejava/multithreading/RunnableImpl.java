package com.corejava.multithreading;

public class RunnableImpl implements Runnable{

	@Override
	public void run() {
		System.out.println("RunnableImpl:run()");
		System.out.println("Thread:"+Thread.currentThread().getName());
		
		  for(int i=1;i<=5;i++) {
	    	   System.out.println(i);
	       }
	}

}
