package com.eomcs.oop.ex04;

public class Exam0221 {
	public static void main(String[] args) {


		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer(100);
		Integer obj3 = new Integer(100);

		Integer i1 = Integer.valueOf(127);
		Integer i2 = Integer.valueOf(127);
		Integer i3 = Integer.valueOf(127);

		System.out.println(obj1 == obj2);
		System.out.println(obj1 == obj3);
		System.out.println(obj2 == obj3);
		System.out.println("-----------");

		System.out.println(i1 == i2);
		System.out.println(i1 == i3);
		System.out.println(i2 == i3);
	}
}
