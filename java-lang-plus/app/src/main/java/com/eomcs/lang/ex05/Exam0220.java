package com.eomcs.lang.ex05;

public class Exam0220 {
  public static void main(String[] args) {
    double d1 = 987.6543;
    double d2 = 1.111111;
    System.out.println((d1 + d2) == 988.765411);

    System.out.println(d1);
    System.out.println(d2);
    System.out.println(d1 + d2); 

    double x = 234.765411;
    double y = 754.0;
    System.out.println((x + y) == 988.765411);

    System.out.println(x);
    System.out.println(y);
    System.out.println(x + y);

    System.out.println((d1 + d2) == (x + y)); // false

    double EPSILON = 0.00001;
    System.out.println(Math.abs((d1 + d2) - (x + y)) < EPSILON); 
    // 비교 값을 구하고 싶을 때 EPSILON 값을 이용해서 극소수의 값 이하를 고려한 연산을 한다.
  }
}
