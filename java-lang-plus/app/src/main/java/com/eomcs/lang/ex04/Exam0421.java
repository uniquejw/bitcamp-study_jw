package com.eomcs.lang.ex04;

public class Exam0421 {
  public static void main(String[] args) {
    float f;

    f = 9.876545f; // Ok
    System.out.println(f);

    f = 987654.5f; //Ok
    System.out.println(f);

    f = 0.0000098765456f; // 유효자리수 초과 반올림
    System.out.println(f);

    f = 9.8765456f; // 유효자리수 초과 반올림
    System.out.println(f);

    f = 9876545.6f; // 유효자리수 초과 반올림
    System.out.println(f);
  }
}
