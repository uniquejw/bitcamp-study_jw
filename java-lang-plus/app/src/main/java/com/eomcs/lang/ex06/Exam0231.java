package com.eomcs.lang.ex06;

public class Exam0231 {
	public static void main(String[] args) {
		int x = 1, y = 300;
		switch (x) {
		case 1 * 300: // OK
			//      case 1 * y: // 컴파일 오류!
		}
	}
}
