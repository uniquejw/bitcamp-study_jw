package com.eomcs.lang.ex04;

public class Exam0820 {
  public static void main(String[] args) {
    int a = 100;

    {
      a = 200;

      int b = 300;
      System.out.println(b);
    }

    System.out.println(a);

    {
      a = 300;
      int b = 400;
      System.out.println(b);
    }

    System.out.println(a);

    //    System.out.println(b); 
    // 현재 영역에서는 애초에 변수선언이 되어있지 않아 실행 오류 
  }
}
