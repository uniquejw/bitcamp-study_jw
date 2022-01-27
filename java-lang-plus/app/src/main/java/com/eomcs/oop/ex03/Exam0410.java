package com.eomcs.oop.ex03;

public class Exam0410 {

	static class Score {
		String name;
		int kor;
		int eng;
		int math;
		int sum;
		float average;

		Score(){
			System.out.println("Score()");
		}

		public void compute () {
			this.sum = this.kor + this.eng + this.math;
			this.average = this.sum / 3f;
		}
	}

	public static void main(String[] args) {
		Score s1 = new Score();
		//		Score s2 = new Score; // 생성자가 없으면 컴파일 오류
		Score s3 = new Score();
		//		s3.Score(); // 생성자만 따로 호출할 수는 없다.
	}
}
