package com.eomcs.lang.ex04;

public class Exam0822 {
  public static void main(String[] args) {
    int a = 100;

    switch (a) {
      case 1:
        //        int a; switch 밖에 같은 이름 변수 존재. 컴파일 오류 발생


        int b; // case 문에서 선언한 변수는 switch 문에 소속
        {

          int c;

        }
        break;

      case 2:

        //        int b; // case문 내부에서 한번 선언되면 같은 변수는 선언할 수 없다.
        int c;

        break;

      case 3:
        for (int i = 0; i < 100; i++) {
          //          int b; // for문의 바깥 블럭에 이미 b 변수가 있으므로 사용할 수 없다.
        }
        break;

      default:
    }
  }
}
