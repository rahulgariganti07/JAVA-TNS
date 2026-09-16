package com.tnsif.java.Threads;

public class Main {
	public static void main(String[] args) {
		thread_demo d1 = new thread_demo();
		thread_demo2 d2 = new thread_demo2();
		d1.start();
		d2.start();
			
		}
	}
