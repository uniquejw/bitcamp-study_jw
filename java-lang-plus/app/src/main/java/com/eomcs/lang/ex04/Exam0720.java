package com.eomcs.lang.ex04;

class MyClass {
  int a = 11; // 인스턴스 변수
  static int b = 22; // 클래스 변수

  static void m1(int v1/*로컬변수=파라미터*/) {
    int v2; //로컬 변수
    v2 = 200;

    System.out.println(v1);
    System.out.println(v2);
  }
}

public class Exam0720 {
  public static void main(String[] args) {
    MyClass obj1 = new MyClass();
    System.out.println(obj1.a);
    //    System.out.println(MyClass.a); 실행 오류 선언 후 사용 가능
    System.out.println(obj1.b);
    System.out.println(MyClass.b);
    obj1.m1(100);
    MyClass.m1(100);
  }
}
