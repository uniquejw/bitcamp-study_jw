package com.eomcs.oop.ex04;

import java.util.Calendar;

public class Exam0130 {
	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		System.out.println(c1 == c2);

		System.out.println(c1.get(1));
		System.out.println(c2.get(Calendar.YEAR));
	}
}
