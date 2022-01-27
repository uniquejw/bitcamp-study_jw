package com.eomcs.oop.ex05.x1.upgrade1;

public class CalculatorTest {
	public static void main(String[] args) {
		com.eomcs.oop.ex05.x1.Calculator c = new com.eomcs.oop.ex05.x1.Calculator();

		c.plus(100);
		c.minus(200);
		//		c.multiple(2);

		System.out.println(c.result);
	}
}
