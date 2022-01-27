package com.eomcs.oop.ex03;

public class Exam0650 {

	public static class A {
		static int a;

		static void m() {}

		static {
			System.out.println("Static{} 11111");
		}
		static {
			System.out.println("Static{} 22222");
		}
	}

	public static void main(String[] args) throws Exception {

		A.a = 100;
		A.m();

		Class.forName("com.eomcs.oop.ex03.Exam0650$A");

		System.out.println("------------------");

		Class.forName("com.eomcs.oop.ex03.Exam0650$A"); // 클래스는 중복 로딩 x

		System.out.println("------------------");

		System.out.println("종료!");		
	}
}
