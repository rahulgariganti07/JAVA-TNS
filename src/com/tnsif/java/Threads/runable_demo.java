package com.tnsif.java.Threads;

public class runable_demo implements Runnable{

	@Override
	public void run() {
		for (int i =0;i<=5;i++) {
			System.out.println("runnable 1");
		}
		
	}

}
