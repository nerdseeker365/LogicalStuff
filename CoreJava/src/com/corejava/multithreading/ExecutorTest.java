package com.corejava.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {

	private String taskname;

	public Task(String s) {
		super();
		this.taskname = s;
	}

	@Override
	public void run() {

		System.out.println("run() method executed.....");
		
		System.out.println("Current Running Thread::"+Thread.currentThread().getName());
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
	}

	
	
}

 public class ExecutorTest{
	
	  // Maximum number of threads in thread pool 
	    static final int MAX_T = 3;              
	  
	  public static void main(String[] args) {
		
		  
		  //step-1 (Creating a Set of Tasks to execute)
		 Runnable runnable1=new Task("Task1");
		 Runnable runnable2=new Task("Task2");
		 Runnable runnable3=new Task("Task3");
		 Runnable runnable4=new Task("Task4");
		 Runnable runnable5=new Task("Task5");


		 //step-2 (creating ExecutorPool using Executors)
		 ExecutorService pool=Executors.newFixedThreadPool(MAX_T);
		 
		 //step-3 (passing Tasks to Executor Pool)
		 pool.execute(runnable1);
		 pool.execute(runnable2);
		 pool.execute(runnable3);
		 pool.execute(runnable4);
		 pool.execute(runnable5);

		 //step-4 (Shutdown the Executor Pool)
		 pool.shutdown();
	}
}
