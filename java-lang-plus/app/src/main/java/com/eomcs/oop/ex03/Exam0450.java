package com.eomcs.oop.ex03;


class X{
	private X() {
		System.out.println("X()");
	}
}

public class Exam0450 {

	public static void main(String[] args) {
		X obj1;

		//		obj1 = new X(); // 컴파일 오류
	}

}
