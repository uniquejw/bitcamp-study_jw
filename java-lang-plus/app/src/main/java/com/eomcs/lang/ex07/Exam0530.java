package com.eomcs.lang.ex07;

public class Exam0530 {
	public static void main(String[] args) {


		int sum = 0;
		for (String arg : args)
			sum += Integer.parseInt(arg);
		System.out.printf("합계: %d\n", sum);
	}
}