package com.eomcs.oop.ex06.a;

public class Exam0211 {
	public static void main(String[] args) {
		Vehicle v1 = new Sedan();

		v1.model = "티코";
		v1.capacity = 5;

		((Sedan)v1).cc = 1980;
		((Sedan)v1).valve = 16;
		((Sedan)v1).sunroof = true;
		((Sedan)v1).auto = true;

	}
}
