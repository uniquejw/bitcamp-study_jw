package com.eomcs.lang.ex04;

public class Exam0320 {
  public static void main(String[] args) {
    int age1 = 20; // 20 초기화
    int age2 = age1; // 20 변수의 주소 가리키기
    int age3 = age2; // 20 변수의 주소 가리키기

    age1 = 30; // age1으로 30 주소 가리키기

    System.out.println(age1); // 30
    System.out.println(age2); // 20
    System.out.println(age3); // 20
  }
}
