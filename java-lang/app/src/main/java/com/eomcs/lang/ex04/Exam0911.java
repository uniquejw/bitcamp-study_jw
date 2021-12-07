package com.eomcs.lang.ex04;

//# 값 저장과 메모리 크기 - 정수는 부동소수점 메모리에 저장할 수 있다.
public class Exam0911 {
  public static void main(String[] args) {
    byte b = 100; // 1byte
    float v1 = b; // 정수(1) == 부동소수점(4, 유효자릿수 7자리)

    short s = 100; // 2byte
    float v2 = s; // 정수(2) ==> 부동소수점(4, 유효자릿수 7자리)

    int i = 98765678; // 4byte
    float v3 = i; // 정수(4) ==> 부동소수점(4, 유효자릿수 7자리)
    // 주의!
    // - float의 자리수가 넘어가는 정수를 저장하는 경우 값이 짤릴 수 있다.
    // - 그컴파일 오류가 발생하지 않는다.

    long l = 98765678; // 8byte
    float v4 = l; // 정수(8) ==> 부동소수점(4, 유효자릿수 7자리)

    char c = 100; //2byte

  }
}

// 정리!
// - 정수 메모리의 값(byte, short, char, int, long)을 
//   부동소수점 메모리(float, double)에 저장할 때
//   주의해서 사용하라!
// - 유효자릿수를 넘어가는 정수 값인 경우 부동소수점 메모리에 저장될 때 짤릴 수 있다.
//   그럼에도 컴파일 오류가 발생하지 않기 때문에
//   개발자들이 놓치는 경우가 많다!