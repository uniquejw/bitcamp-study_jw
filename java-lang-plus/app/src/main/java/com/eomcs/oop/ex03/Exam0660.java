package com.eomcs.oop.ex03;

public class Exam0660 {

	public static class A{
		static {
			int x = 200;
			System.out.println(x);
			System.out.println("Static{} 11111");
		}
		static int a;

		static {
			String x = "Hello";
			System.out.println(x);
			System.out.println("Static{} 22222");
		}

		static void m() {}

		static {
			int x = 300;
			System.out.println(x);
			System.out.println("Static{} 33333");
		}
	}

	public static void main(String[] args) throws Exception {
		A obj;
		System.out.println("-------------");

		A.a = 100;
		A.m();
		new A();
		Class.forName("com.eomcs.oop.ex03.Exam0660$A");
		System.out.println("----");

		new A();
	}
}
