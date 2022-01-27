package com.eomcs.oop.ex03;

public class Exam0640 {

	public static class A {
		static int a = 100;
		static void m() {
			System.out.println(a);
		}

		static {
			System.out.println("Static{} 11111");
		}

		static {
			System.out.println("Static{} 22222");
		}
	}

	public static void main(String[] args) {

		new A();

		A d = new A();
		A.m();
		d.m();

		System.out.println("--------------------");

		new A();
		System.out.println("--------------------");

		new A();
		System.out.println("--------------------");

		System.out.println("종료!");
		// 스태틱으로 선언된 변수나 메소드등은 한번 선언된 후 
	}
}
