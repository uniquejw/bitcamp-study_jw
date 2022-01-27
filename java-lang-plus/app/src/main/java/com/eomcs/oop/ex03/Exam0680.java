package com.eomcs.oop.ex03;

public class Exam0680 {
	public static class A {
		static {
			b = 400;
		}

		static int a = 100;

		static {
			a = 200;
			System.out.println("static {} 실행");
		}

		static int b = 300;

	}

	public static void main(String[] args) {
		System.out.println(A.a); // 200
		System.out.println(A.b); // 300
	}
}
