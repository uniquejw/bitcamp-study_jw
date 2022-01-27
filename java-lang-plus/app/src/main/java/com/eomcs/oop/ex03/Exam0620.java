package com.eomcs.oop.ex03;

public class Exam0620 {

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

	public static void main(String[] args) {
		A.a = 100; // 선언해야 해당 class 발동

		System.out.println("종료!");
	}
}
