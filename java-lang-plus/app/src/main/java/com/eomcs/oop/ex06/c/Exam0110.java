package com.eomcs.oop.ex06.c;

public class Exam0110 {

	static class A {
		String name = "A";
		String tel = "A: 010-1111-1111";
		boolean working = true;

		void print() {
			System.out.println("A.print():");
			System.out.printf(" => this.name(%s)\n", this.name);
			System.out.printf(" => this.tel(%s)\n", this.tel);
			System.out.printf(" => this.working(%s)\n", this.working);
		}
	}

	static class A2 extends A{
		int age = 20;

		void print2() {
			System.out.println("A2.print():");
			System.out.printf(" => this.name(%s)\n", this.name);
			System.out.printf(" => this.tel(%s)\n", this.tel);
			System.out.printf(" => this.working(%s)\n", this.working);
			System.out.printf(" => this.name(%s)\n", this.name);
		}
	}

	public static void main(String[] args) {
		A obj1 = new A();
		obj1.print();
		System.out.println("---------------");

		A2 obj2 = new A2();
		obj2.print();
		System.out.println("---------------");
	}
}
