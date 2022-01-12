package com.eomcs.lang.ex05;

public class Exam0120 {
  public static void main(String[] args) {
    System.out.println(2 + 3 * 7);
    System.out.println(3 * 7 + 2);

    System.out.println(2 / 3 * 7); // 왼쪽부터 연산한다.
    System.out.println(3 * 7 / 2);

    System.out.println(4 * (3 / 2)); // 강제로 연산 순서를 바꿀 수 있다.
    System.out.println(3 / (2 * 4));


  }
}
