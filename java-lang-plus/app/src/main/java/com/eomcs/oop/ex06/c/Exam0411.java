package com.eomcs.oop.ex06.c;

public class Exam0411 {
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

	static class A3 extends A2 {
		@Override
		void m() {
			System.out.println("A3의 m()");
		}
	}

	public static void main(String[] args) {
		A3 obj = new A3();
		obj.test();
	}
}
