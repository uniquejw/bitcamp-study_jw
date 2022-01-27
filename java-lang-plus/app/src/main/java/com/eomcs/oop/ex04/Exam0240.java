package com.eomcs.oop.ex04;

import java.util.Date;

public class Exam0240 {
	public static void main(String[] args) {
		Date d1 = new Date();

		String str0 = d1.toString();
		System.out.println(str0);

		System.out.println(d1.getYear()); // 현재년도 -1900가 출력
		System.out.println(d1.getYear() + 1900);
		System.out.println(d1.getMonth() + 1);
		System.out.println(d1.getDate());

		long millis = Date.parse("Sat, 12 Aug 1995 13:30:00 GMT");
		System.out.println(millis);

		long currMillis = System.currentTimeMillis();

		java.sql.Date today = new java.sql.Date(currMillis);

		String str = today.toString();
		System.out.println(str);

		java.sql.Date d = java.sql.Date.valueOf("2019-12-30");
		System.out.println(d);
	}
}
