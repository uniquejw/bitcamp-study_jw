package com.eomcs.oop.ex02;

public class Exam0110 {
	static class Score {
		String name;
		int kor;
		int eng;
		int math;
		int sum;
		float average;
	}

	public static void main(String[] args) {
		Score score = new Score();

		score.name = "홍길동";
		score.kor = 100;
		score.eng = 90;
		score.math = 80;
		score.sum = score.kor + score.eng + score.math;
		score.average = score.sum / 3f;

		System.out.printf("%s, %d, %d, %d, %d, %.1f\n", 
				score.name, score.kor, score.eng, score.math, 
				score.sum, score.average);
	}
}
