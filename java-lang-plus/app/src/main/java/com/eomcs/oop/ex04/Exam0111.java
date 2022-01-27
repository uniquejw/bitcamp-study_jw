package com.eomcs.oop.ex04;

public class Exam0111 {
	public static void main(String[] args) {
		String s0 = new String();
		System.out.println(s0);
		System.out.println("---------");

		String s1 = new String("HelloABCabc012가각간");
		System.out.println(s1);
		System.out.println("---------");

		char[] chars = new char[] {'H', 'e', 'l', 'l', 'o'};
		String s2 = new String(chars);
		System.out.println(s2);
		System.out.println("-----------");

		s2 = new String(chars, 1, 3);
		System.out.println(s2);
		System.out.println("--------");

		byte[] bytes = {
				(byte)0x48,
				(byte)0x65,
				(byte)0x6c,
				(byte)0x6c,
				(byte)0x6f,
		};
		String s3 = new String(bytes);

		System.out.printf("%s, %s, %s, %s\n", s0, s1, s2, s3);

	}
}
