package com.eomcs.oop.ex05.b;

public class Exam02 {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();

		c1.plus(5);
		c1.multiple(2);
		c1.minus(2);
		c1.divide(4);
		System.out.println(c1.result);
	}
}
