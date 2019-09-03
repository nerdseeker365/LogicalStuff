package com.corejava.multithreading;

public class Thread1 extends Thread {

	private Shared s1;
	private Shared s2;

	public Thread1(Shared s1, Shared s2) {
		super();
		this.s1 = s1;
		this.s2 = s2;
	}

	@Override
	public void run() {
     System.out.println("run()........");
     s1.test1(s2);
	}

}
