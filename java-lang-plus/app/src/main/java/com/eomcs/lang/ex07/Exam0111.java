package com.eomcs.lang.ex07;

import java.util.Scanner;

public class Exam0111 {

	static void printSpaces(int len) {
		int spaceCnt = 1;
		while (spaceCnt <= len) {
			System.out.print(" ");
			spaceCnt++;
		}
	}

	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		System.out.print("밑변의 길이? ");
		int len = keyScan.nextInt();
		keyScan.close();

		int starLen = 1;
		while (starLen <= len) {
			printSpaces((len - starLen) / 2);


			int starCnt = 1;
			while (starCnt <= starLen) {
				System.out.print("*");
				starCnt++;
			}

			System.out.println();
			starLen += 2;
		}
	}

}
