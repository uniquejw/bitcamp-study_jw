package com.eomcs.oop.ex06.e;

class C {
	final int v1;

	public C() {
		v1=100;
	}

	public void m1() {

	}
}
public final class Exam0310 {
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.v1);
	}
}
