package com.eomcs.lang.ex03;

public class Exam0430 {
  public static void main(String[] args) {
    System.out.println((char)65);
    System.out.println('A');

    System.out.println((int)'A');

    // 숫자를 리턴하는 문자의 특성으로 다른 숫자와 연산을 수행할 수 있다.
    System.out.println(('각' + 1));
    System.out.println(('각' - 1));

    System.out.println((char)('각' + 1));
    System.out.println((char)('각' - 1));

  }
}
