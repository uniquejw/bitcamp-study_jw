
package com.eomcs.lang.ex05;
public class Exam0355 {
	public static void main(String[] args) {
		int pixel = 0x003f4478; // 각 바이트의 값이 '00RRGGBB' 이라 가정하다.
		System.out.println(pixel | 0x00000057);
		// pixel = 00000000_00111111_01000100_01111000
		//       | 00000000_00000000_00000000_01010111
		//         00000000_00111111_01000100_01111111
	}
}
