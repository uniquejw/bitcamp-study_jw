package com.eomcs.lang.ex07;

public class Exam0430 {
	static class MyObject {
		int a;
		int b;
	}

	static MyObject getMyObject() {
		MyObject ref = new MyObject();
		ref.a = 100;
		ref.b = 200;

		return ref;
	}

	public static void main(String[] args) {
		MyObject ref;
		ref = getMyObject();
		System.out.println(ref.a);
		System.out.println(ref.b);
	}
}
