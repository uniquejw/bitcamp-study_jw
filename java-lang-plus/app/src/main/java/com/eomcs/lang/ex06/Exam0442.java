package com.eomcs.lang.ex06;

public class Exam0442 {
	public static void main(String[] args) {
		String[] names = {"홍길동", "임꺽정", "유관순", "윤봉길", "안중근"};

		for (int i = 0; i < names.length; i += 2) {
			System.out.println(names[i]);
		}
	}
}
