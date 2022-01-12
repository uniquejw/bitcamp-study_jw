package com.eomcs.lang.ex03;

public class Exam0410 {
  public static void main(String[] args) {
    //문자열을 표현하는 방법
    System.out.println('A');
    System.out.println('가');

    // UTF-16 사용 (자바의 기본)
    System.out.println('\u0041'); 
    System.out.println('\uac00');
    System.out.println('\uAC00');

    // 8진수 사용 문자 표현
    System.out.println('\101');
    System.out.println('\122');
    System.out.println('\377');

    // UTF-16의 다양한 표현
    System.out.println('\u4eba');
    System.out.println('\u00a9');
    System.out.println('\u03c0');
    System.out.println('\u03a3');    
  }
}
