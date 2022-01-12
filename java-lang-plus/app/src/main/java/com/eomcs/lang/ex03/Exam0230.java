package com.eomcs.lang.ex03;

public class Exam0230 {
  public static void main(String[] args) {
    // int(4바이트) 최대값 최소값
    System.out.println(2147483647);
    System.out.println(-2147483648);

    // long(8바이트)
    System.out.println(2147483648L);
    System.out.println(-2147483649L);

    // 바이트 블록별 최대, 최소값
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);
    System.out.println(Long.MAX_VALUE);
    System.out.println(Long.MIN_VALUE);

    // 크기가 다른 정수 블록
    System.out.println(100); // 4바이트
    System.out.println(100L); // 8바이트
  }
}
