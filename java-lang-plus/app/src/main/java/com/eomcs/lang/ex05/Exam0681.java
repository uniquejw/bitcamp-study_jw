package com.eomcs.lang.ex05;

public class Exam0681 {
	public static void main(String[] args) {
		int a = 5;
		int r = --a + --a / --a; // 4 + (3 / 2)
		System.out.printf("%d, %d\n", a, r);
	}
}
