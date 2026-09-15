package com.tnsif.java.exceptionhandling;

public class Throw_Throws_demo{
	
	public void m1() throws Exception{
		int age = 16;
		
		if (age < 18) {
			throw new Exception("You are not eligible");
		}else {
			System.out.print("Welcome");
		}
	}

}


