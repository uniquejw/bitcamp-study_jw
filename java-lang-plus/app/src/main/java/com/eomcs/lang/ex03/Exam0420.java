package com.eomcs.lang.ex03;

public class Exam0420 {
  public static void main(String[] args) {
    System.out.println(65);

    System.out.println((char)65);

    System.out.println((char)0x41); // 16진수 65 표현

    System.out.println((char)0xAC00); // 16진수 "가" 표현

    System.out.println((char)(0xAC00 + 1)); // 16진수 "가"의 다음 글자 출력

    for (int i = 0; i < 26; i++) { // 알파벳 출력 반복문
      System.out.println((char)(i + 65) + ",");
    }
  }
}
