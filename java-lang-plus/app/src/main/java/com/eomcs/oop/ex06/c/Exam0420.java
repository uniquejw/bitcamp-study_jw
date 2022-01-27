package com.eomcs.oop.ex06.c;

public class Exam0420 {
	static class X{
		void m1() {
			System.out.println("X의 m1()");
		}
		void m2() {
			System.out.println("X의 m2()");
		}
	}

	static class X2 extends X {
		@Override
		void m1() {
			System.out.println("X2의 m1()");
		}
	}

	static class X3 extends X2{
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
		void test() {
			this.m1();
			super.m1();

			this.m2();
			super.m2();
		}
	}


	public static void main(String[] args) {
		X4 obj = new X4();
		obj.test();
	}


}

