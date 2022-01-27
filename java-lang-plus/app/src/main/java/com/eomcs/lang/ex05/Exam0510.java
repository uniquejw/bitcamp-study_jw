package com.eomcs.lang.ex05;

public class Exam0510 {
	public static void main(String[] args) {
		int age = 20;
		int age2 = 18;

		String message = age > 18 ? "성년" : "미성년";
		String message2 = age2 > 18 ? "성년" : "미성년";
		System.out.printf("나이 %d는(은) %s이다.\n", age, message);
		System.out.printf("나이 %d는(은) %s이다.\n", age2, message2);


	}
}
