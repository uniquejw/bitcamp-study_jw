package com.eomcs.lang.ex06;

public class Exam0421 {
	public static void main(String[] args) {
		for(int i = 1, j = 3, k = 5; i <= 10; i++, j--, k += 2)
			System.out.printf("(%d, %d, %d)", i, j, k);
		System.out.println();
	}
}
