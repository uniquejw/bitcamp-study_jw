package com.eomcs.oop.ex06.c;

public class Exam0410 {
	static class A {
		void m() {
			System.out.println("A의 m()");
		}
	}

	static class A2 extends A {
		@Override
		void m() {
			System.out.println("A2의 m()");
		}

		void test() {
			this.m();

			super.m();
		}
	}

	public static void main(String[] args) {
		A2 obj = new A2();
		obj.test();
	}
}
