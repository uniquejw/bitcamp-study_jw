package com.eomcs.oop.ex06.c;

public class Exam0511 {
	static class X{
		void m1() {
			System.out.println("X의 m1()");
		}
		void m2() {
			System.out.println("X의 m2()");
		}
	}

	static class X2 extends X{
		@Override
		void m1() {
			System.out.println("X2의 m1()");
		}
	}

	static class X3 extends X2 {
		@Override
		void m2() {
			System.out.println("X3의 m2()");
		}
	}

	static class X4 extends X3{
		@Override
		void m1() {
			System.out.println("X4의 m1()");
		}
	}

	public static void main (String[] args) {
		X4 x4 = new X4();
		x4.m1();

		((X3)x4).m1();
		((X2)x4).m1();
		((X)x4).m1();

		X3 x3 = x4;
		X2 x2 = x4;
		X x = x4;

		x3.m1();
		x2.m1();
		x.m1();
	}
}
