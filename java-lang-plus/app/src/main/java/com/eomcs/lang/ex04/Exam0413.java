package com.eomcs.lang.ex04;

public class Exam0413 {
  public static void main(String[] args) {
    long l = 100;
    int i = 100;
    short s = 100;
    byte b = 100;
    char c = 100;

    // 변수의 값을 다른 변수에 저장할 때, 값의 크기와 상관없이 같거나 큰 크기의 메모리여야 한다.

    long l2;
    int i2;
    short s2;
    byte b2;
    char c2;

    l2 = l;
    //  컴파일 오류
    //  i2 = l;
    //  s2 = l;
    //  b2 = l;
    //  c2 = l;

    l2 = i;
    i2 = i;
    //  컴파일 오류
    //  s2 = i;
    //  b2 = i;
    //  c2 = i;

    l2 = s;
    i2 = s;
    s2 = s;
    //  컴파일 오류
    //  b2 = s;
    //  c2 = s;

    l2 = b;
    i2 = b;
    s2 = b;
    b2 = b;
    //  컴파일 오류
    //  c2 = b;
  }
}
