package com.tnsif.java.abstractdemo1;

public class Square extends Shape{
	int side = 2;

	@Override
	void calculatearea() {
		area = side*side;
		
	}

}
