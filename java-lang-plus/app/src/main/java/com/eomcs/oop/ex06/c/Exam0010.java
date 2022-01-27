package com.eomcs.oop.ex06.c;

public class Exam0010 {
	static class Score {
		String name;
		int kor;
		int eng;
		int math;
		int sum;
		float aver;

		public void compute() {
			this.sum = this.kor + this.eng + this.math;
			this.aver = this.sum / 3f;
		}
	}

	static class Score2 extends Score {
		int music;
		int art;
	}

	public static void main(String[] args) {
		Score2 score = new Score2();

		score.kor = 100;
		score.eng = 100;
		score.math = 100;
		score.music = 50;
		score.art = 50;

		score.compute();
		System.out.printf("%d(%f)\n", score.sum, score.aver);

	}
}
