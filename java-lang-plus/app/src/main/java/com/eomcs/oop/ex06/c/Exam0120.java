package com.eomcs.oop.ex06.c;

public class Exam0120 {
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

	static class A3 extends A {
		int age = 30;

		@Override
		void print() {
			System.out.println("A3.print():");
			System.out.printf(" => this.name(%s)\n", this.name);
			System.out.printf(" => this.tel(%s)\n", this.tel);
			System.out.printf(" => this.working(%s)\n", this.working);
			System.out.printf(" => this.age(%s)\n", this.age);
		}
	}

	public static void main(String[] args) {
		A3 obj = new A3();
		obj.name = "홍길동";
		obj.age = 20;

		obj.print();
	}
}
