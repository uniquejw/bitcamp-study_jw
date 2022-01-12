package com.eomcs.lang.ex05;

public class Exam0142 {
  public static void main(String[] args) {
    int x = Integer.MAX_VALUE;
    int y = Integer.MAX_VALUE;

    int r1 = x + y; // 비트 연산 결과를 도출하므로 의도하지 않은 결과가 나온다.

    System.out.println(r1);

    long r2 = x + y; // 연산 후의 결과를 저장하므로 역시 의도하지 않은 결과가 나온다.
    System.out.println(r2);

    r2 = (long)x + (long)y; // long 형으로 연산 후 결과를 저장하므로 의도한 결과가 나온다.
    System.out.println(r2);

  }
}
