package com.tnsif.java.Threads;

public class Main_runable {

	public static void main(String[] args) {
		runable_demo d1 = new runable_demo();
		Thread t = new Thread(d1);
		runable_demo1 d2 = new runable_demo1();
		Thread t2 = new Thread(d2);
		t.start();
		t2.start();
		
	}

}
