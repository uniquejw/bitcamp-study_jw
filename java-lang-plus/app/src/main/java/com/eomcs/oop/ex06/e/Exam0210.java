package com.eomcs.oop.ex06.e;

class B{
	final void m1() {
		System.out.println("B.m() 호출");
	}
	void m2() {

	}
}


public class Exam0210 extends B{

	@Override
	void m2() {
	}
}
