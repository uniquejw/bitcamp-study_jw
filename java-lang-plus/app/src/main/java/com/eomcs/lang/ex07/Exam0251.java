package com.eomcs.lang.ex07;

public class Exam0251 {
	static void hello(String... names) {
		for (int i = 0; i < names.length; i++) {
			names[i] += "^^";
			System.out.printf("%s님 반갑습니다.\n", names[i]);
		}
	}

	public static void main(String[] args) {
		String[] arr = {"김구", "안중근", "윤봉길", "유관순"};

		hello(arr);
		System.out.println("-----------");

		for(String value : arr) {
			System.out.println(value);
		}
	}


}
