package com.eomcs.oop.ex02;

public class Exam0210 {
	public static void main(String[] args) {
		int result = 0;

		result = plus(2, 3);
		result = minus(result, 1);
		result = multiple(result, 7);
		result = divide(result, 3);

		System.out.printf("result = %d\n", result);
	}

	static int plus(int a, int b) {
		return a + b;
	}
	static int minus(int a, int b) {
		return a - b;
	}
	static int multiple(int a, int b) {
		return a * b;
	}
	static int divide(int a, int b) {
		return a / b;
	}
}
