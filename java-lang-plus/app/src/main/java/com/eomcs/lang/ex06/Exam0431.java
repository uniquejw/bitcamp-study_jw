package com.eomcs.lang.ex06;

public class Exam0431 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
				if (j == 5)
					break;
			}
			System.out.println();
		}
	}
}
