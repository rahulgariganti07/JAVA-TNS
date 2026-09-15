package com.tnsif.java.exceptionhandling;

public class Main {
	public static void main(String[] args) {
		Throw_Throws_demo obj = new Throw_Throws_demo();
		try{
			obj.m1();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
