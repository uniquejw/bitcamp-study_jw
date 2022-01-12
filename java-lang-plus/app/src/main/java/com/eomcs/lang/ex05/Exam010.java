package com.eomcs.lang.ex05;

public class Exam010 {
  public static void main(String[] args) {
    byte b;
    b = 5;
    b = 7;

    b = 5 + 7;

    System.out.println(b);

    byte x = 5, y = 6, z;
    z = x;
    z = y;
    //  z = x + y; 실행 오류
    int e = x + y;

    //    변수 연산 시 기본으로 4바이트 블록에 넣고 실행하므로 byte 변수에는 담을 수 없다.
  }
}
