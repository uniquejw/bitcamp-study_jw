package com.eomcs.lang.ex05;

public class Exam0431 {
	public static void main(String[] args) {
		int i = -87; // [11111111111111111111111110101001]

		System.out.println(i);

		System.out.println(i >>> 1);
		// [ 1111111111111111111111111010100]1
		// [01111111111111111111111111010100]1      => 2147483604

		System.out.println(i >>> 2);
		// [  111111111111111111111111101010]01
		// [00111111111111111111111111101010]01     => 1073741802

		System.out.println(i >>> 3);
		// [   11111111111111111111111110101]001
		// [00011111111111111111111111110101]001     => 536870901

		System.out.println(i >>> 4);
		// [    1111111111111111111111111010]1001
		// [00001111111111111111111111111010]1001     => 268435450

		System.out.println(i >>> 5);
		// [    1111111111111111111111111010]1001
		// [00001111111111111111111111111010]1001     => 268435450

	}
}
