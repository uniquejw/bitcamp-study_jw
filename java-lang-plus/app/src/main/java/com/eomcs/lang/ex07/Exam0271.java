package com.eomcs.lang.ex07;

public class Exam0271 {
	static void m2(int a, String... names) {
		for(int i=0 ; i<names.length; i++) {
			System.out.printf("%s님 반갑습니다\n", names[i]);
		}
	} //OK!

	static void x1(String[] names, String[] emails) {
		for(int i=0; i<names.length;i++) {
			System.out.println(names[i]);
		}
	}

	static void x2(String[] names, int a) {}

	public static void main(String[] args) {
		String[] arr = {"요기요", "배민", "롯데리아"};
		m2(1, arr);
		x1(arr, arr);
	}
}
