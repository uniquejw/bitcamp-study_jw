package com.eomcs.lang.ex05;

public class Exam0143 {
  public static void main(String[] args) {

    float f1 = 987.6543f;
    float f2 = 1.111111f;
    System.out.println(f1);
    System.out.println(f2);

    float r1 = f1 + f2;

    System.out.println(r1); // 유효값을 벗어나 결과 값이 잘린다.

    double r2 = f1 + f2;
    System.out.println(r2);  //float의 왜곡된 결과를 double에서 받으면 잘리지 않고 왜곡된 값이 표출 

    double d1 = 987.6543;
    double d2 = 1.111111;
    double r5 = d1 + d2; 
    System.out.println(r5); // double 연산이 정상적으로 표출된다.
  }
}
