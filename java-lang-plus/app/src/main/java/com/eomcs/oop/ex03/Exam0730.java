package com.eomcs.oop.ex03;

public class Exam0730 {
	static class A{
		int a;
		int b;
		int c;

		A() {
			System.out.println("A()");
			b=200;
			c=300;
		}

		A(int b) {
			System.out.println("A(int)");
			this.b = b;
			this.c = 300;
		}

		A(int b, int c) {
			System.out.println("A(int, int)");
			this.b = b;
			this.c = c;
		}

		{ 
			a= 100;
			System.out.println("Hello!");
		}
	}

	public static void main(String[] args) {
		A obj1 = new A();
		System.out.printf("a=%d, b=%d, c=%d\n",
				obj1.a, obj1.b, obj1.c);
		System.out.println("-------------");

		A obj2 = new A(222);
		System.out.printf("a=%d, b=%d, c=%d\n",
				obj2.a, obj2.b, obj2.c);
		System.out.println("-------------");

		A obj3 = new A();
		System.out.printf("a=%d, b=%d, c=%d\n",
				obj3.a, obj3.b, obj3.c);
		System.out.println("-------------");

		A obj4 = new A(20, 20);
		System.out.printf("a=%d, b=%d, c=%d\n",
				obj4.a, obj4.b, obj4.c);
		System.out.println("-------------");
	}
}
