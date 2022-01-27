package com.eomcs.lang.ex07;

public class Exam0460 {
	static int sum(int value) {
		System.out.println(value);
		if (value == 1)
			return 1;

		return value + sum(value -1);
	}

	public static void main(String[] args) {
		System.out.println(sum(19100));
	}
}
