package com.eomcs.lang.ex06;

public class Exam0432 {
	public static void main(String[] args) {
		loop1: {
			for (int i = 1; i <= 10; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j + " ");
					if (j == 5)
						break loop1;
				}
				System.out.println();
			}
			System.out.println("------");
		}
		System.out.println("loop1 밖!");
	}
}
