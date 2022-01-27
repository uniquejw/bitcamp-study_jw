package com.eomcs.lang.ex05;

public class Exam0640 {
	public static void main(String[] args) {
		int i = 2;
		int result = i++ + i++ * i++; // 2 + (3 * 4)
		System.out.printf("%d, %d\n", i, result);
	}
}
