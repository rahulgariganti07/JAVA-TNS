package com.tnsif.java.exceptionhandling;

public class exceptiondemo {
	public static void main(String[] args) {
		
		try {
			int[] arr = {1,2,3,4,5,6};
			System.out.print(arr[6]);
			
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("the given index number is not in array");
		}
		finally {
			System.out.println("End of execution");
		}
		
	}
}
