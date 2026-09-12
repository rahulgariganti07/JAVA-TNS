package com.tnsif.java.abstractdemo1;

public class ShapeMain {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Square s = new Square();
		
		r.calculatearea();
		r.showArea();
		
		s.calculatearea();
		s.showArea();
	}
}
