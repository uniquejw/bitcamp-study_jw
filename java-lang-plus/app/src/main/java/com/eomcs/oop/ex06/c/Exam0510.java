package com.eomcs.oop.ex06.c;

public class Exam0510 {
	static class A {
		String name = "A";
		String tel = "A: 010-1111-1111";
		boolean working = true;
	}

	static class A2 extends A {
		int age = 20;
	}

	static class A3 extends A {
		int age = 30;
		String tel = "A3: 010-1111-2222";
	}

	static class A4 extends A3{
		String age = "40";
		boolean working = false;
	}

	public static void main(String[] args) {
		A4 obj1 = new A4();

		System.out.println(obj1.name);
		System.out.println(obj1.age);
		System.out.println(obj1.working);
		System.out.println("----------------");

		System.out.println(((A3)obj1).age);
		System.out.println(((A3)obj1).working);
		System.out.println("----------------");

		System.out.println(((A)obj1).working);
	}
}
