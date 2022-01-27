package com.eomcs.lang.ex07;

public class Exam0240 {
	static String hello(String name, int age) {
		String retVal = String.format("%d살 %s님을 환영합니다!", age, name);
		return retVal;
	}

	public static void main(String[] args) {
		String r = hello("홍길동", 20);
		System.out.println(r);
		// 한 줄 표현
		System.out.println(hello("임꺽정", 35));
		hello("임꺽정", 30);
	}
}
