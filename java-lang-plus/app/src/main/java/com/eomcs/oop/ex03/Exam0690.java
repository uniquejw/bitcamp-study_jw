package com.eomcs.oop.ex03;

public class Exam0690 {

	public static class A {
		static float pi;

		static {
			pi = 3.141592f;
		}

		static float area(int r) {
			return pi * r * r;
		}

	}

	public static void main(String[] args) {
		System.out.println(A.area(25));
	}
}
