package com.eomcs.oop.ex06.c;

public class Exam0210 {
	static class B {
		void m(int a) {
			System.out.println("B의 m()");
		}
	}

	static class B2 extends B {
		void m(float x) {
			System.out.println("B2의 m2()");
		}
	}

	public static void main(String[] args) {
		B2 obj = new B2();

		obj.m(100);
		obj.m(3.14f);
	}
}
