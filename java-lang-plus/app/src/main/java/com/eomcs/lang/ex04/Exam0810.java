package com.eomcs.lang.ex04;

public class Exam0810 {

  int a;

  static int b;

  public static void main(String[] args) {
    int a;
    int b;
    //    static int b; static은 오류 발생

  }
  // 같은 블럭 안에서는 같은 이름의 변수를 선언할 수 없지만
  // 스코프가 메서드 영역이 다를 때는 선언 가능
  public static void m2() {
    int a;
    int b;
  }
}
