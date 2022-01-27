package com.eomcs.oop.ex06.c;

public class Exam0130 {

	static class A {
		String name;
		String tel;
		boolean working;

		void print() {
			System.out.println("A.print():");
			System.out.printf(" => this.name(%s)\n", this.name);
			System.out.printf(" => this.tel(%s)\n", this.tel);
			System.out.printf(" => this.working(%s)\n", this.working);
		}
	}

	static class A4 extends A {
		String working;
	}

	public static void main(String[] args) {
		A4 obj = new A4();
		obj.name = "홍길동";
		obj.tel = "1111-1111";
		obj.working = "취업";

		obj.print();
	}
}
