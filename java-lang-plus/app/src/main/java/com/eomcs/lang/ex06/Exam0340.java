package com.eomcs.lang.ex06;

public class Exam0340 {
	public static void main(String[] args) {

		int i = 0;

		do
			System.out.println(++i);
		while (i < 10);

		System.out.println("---------");

		// 여러 개의 문장 반복 시 블록으로 묶자
		i = 0;
		do {
			i += 1;
			System.out.println(i);
		} while (i < 10);
	}
}
