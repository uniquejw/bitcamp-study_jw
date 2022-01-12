package com.eomcs.lang.ex03;

public class Exam0340 {
  public static void main(String[] args) {
    // 유효자리수 안에서 거의 정상적 저장
    System.out.println(999.9999f);
    System.out.println(999999.9f);
    System.out.println(9.999999f);
    System.out.println("---------");

    System.out.println(987654321.1234567);
    System.out.println(9.876543211234567);
    System.out.println(987654321123456.7);
    System.out.println("-----------------");

    // 유효 자리수가 넘어가는 경우 잘릴 수 있다
    System.out.println(987654321.12345678);
    System.out.println(9.8765432112345678);
    System.out.println(987654321123456.78);
    System.out.println("----------------");

    // 부동소수점 정확히 저장되지 않는 예
    System.out.println(7 * 0.1);
  }
}
