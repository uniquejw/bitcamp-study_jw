package com.eomcs.oop.ex01;

class A {}

public class Exam0510 {

	static class B {}

	class C {}

	public static void main(String[] args) {
		class D {}

		Object obj = new Object() {
			String name;
			int age;
		};

		D obj4 = new D();
	}

	static void m1() {
		A obj1 = new A();
		B obj2 = new B();
	}

	void m2() {
		A obj1 = new A();
		B obj2 = new B();
		C obj3 = new C();
		//		D obj4 = new D(); 컴파일 오류 
	}
}


