package com.eomcs.lang.ex07;

public class Exam0280 {
	public static void main(String[] args) {
		int result = plus(2, 3);
		result = plus(result, 4);
		result = plus(result, 5);
		System.out.println(result);

		result = plus(plus(plus(2, 3), 4),5);

		System.out.println(result);

		int r = plus(100,200);
		System.out.printf("100 + 200 = %d\n", r);

		System.out.printf("100 + 200 = %d\n", plus(100, 200));
	}	


	static int plus(int a, int b) {
		return a + b;
	}

}
