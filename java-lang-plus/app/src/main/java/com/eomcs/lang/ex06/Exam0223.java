package com.eomcs.lang.ex06;

public class Exam0223 {
	public static void main(String[] args) {
		int score = 49;
		// break 문을 쓰지 않으면 계속 이어서 실행된다.
		// => 일부러 쓰지 않을 때가 있다.
		switch (score) {
		case 100:
			//		case 90 < score <100 : 오류 발생 - 명확한 값 지정해야 함.
		case 90:
			System.out.println("A");
			break;
		case 80:
		case 70:
			System.out.println("B");
			break;
		case 60:
		case 50:
		case 40:
			System.out.println("C");
			break;
		default:
			System.out.println("F");
		}
	}
}
