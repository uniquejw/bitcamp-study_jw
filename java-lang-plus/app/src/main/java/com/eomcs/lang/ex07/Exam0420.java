package com.eomcs.lang.ex07;

public class Exam0420 {
	static int[] getArray() {
		int[] arr = new int[] {100, 200, 300};

		return arr;
	}

	public static void main(String[] args) {
		int[] arr;
		arr = getArray();
		System.out.println(arr[1]);
	}
}
