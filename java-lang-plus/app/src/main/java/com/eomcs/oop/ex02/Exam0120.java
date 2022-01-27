package com.eomcs.oop.ex02;

public class Exam0120 {
	static class Score{
		String name;
		int kor;
		int eng;
		int math;
		int sum;
		float average;

		public static void calculate(Score score) {
			score.sum = score.kor + score.eng + score.math;
			score.average = score.sum / 3f;
		} // 메서드 선언
	}

	public static void main(String[] args) {
		Score s = new Score();
		s.name = "홍길동";
		s.kor = 100;
		s.eng = 90;
		s.math = 85; // 변수 값 초기화

		Score.calculate(s); // 값을 넣어 sum, average 값 도출

		System.out.printf("%s, %d, %d, %d, %d, %.1f\n", 
				s.name, s.kor, s.eng, s.math, s.sum, s.average);
		// 값 출력
	}
}
