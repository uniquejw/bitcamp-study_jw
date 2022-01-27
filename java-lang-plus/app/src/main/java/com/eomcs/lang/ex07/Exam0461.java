package com.eomcs.lang.ex07;

public class Exam0461 {
	static int sum(int value, int value2, int value3, int value4, int value5, int value6) {
		System.out.println(value);
		if(value == 1)
			return 1;

		return value + sum(value - 1, value2, value3, value4, value5, value6);
	}

	public static void main(String[] args) {
		System.out.println(sum(19000, 0, 0, 0, 0, 0));
	}
}
