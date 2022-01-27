package com.eomcs.oop.ex03;

public class Exam0750 {
	static class A {
		int a;
		int b;
		int c;

		{
			this.a = 101;
			System.out.println("첫 번째 인스턴스 초기화 블록");
		}

		A(){
			System.out.println("A()");
			b = 200;
			c = 300;
		}
		{
			this.a = 102;
			System.out.println("두 번째 인스턴스 초기화 블록");
		}
		{
			this.a = 103;
			System.out.println("두 번째 인스턴스 초기화 블록");
		}
	}

	public static void main(String[] args) {
		A obj1 = new A();
		System.out.printf("a=%d, b=%d, c=%d\n", obj1.a, obj1.b, obj1.c);
	}
}
