package com.eomcs.lang.ex05;

public class Exam0511 {
	public static void main(String[] args) {
		int age = 20;
		int age2 = 18;

		test(age > 18? "성년" : "미성년");
		test2(age2 > 18? "성년" : "미성년");

	}

	static void test(String value) {
		System.out.println(value + "입니다.");
	}
	static void test2(String value) {
		System.out.println(value + "입니다.");
	}
}
