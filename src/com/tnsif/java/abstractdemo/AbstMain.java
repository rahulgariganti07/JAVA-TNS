package com.tnsif.java.abstractdemo;

public class AbstMain {
	public static void main(String[] args) {
		Addition a = new Addition();
		a.show();
		a.calculate();
		Multiplication m = new Multiplication();
		m.show();
		m.calculate();
		Subtraction s = new Subtraction();
		s.show();
		s.calculate();
	}
}
