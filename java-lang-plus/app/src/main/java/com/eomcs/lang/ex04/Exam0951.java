package com.eomcs.lang.ex04;

public class Exam0951 {
  public static void main(String[] args) {
    byte b = Byte.valueOf("100");
    short s = Short.valueOf("32767");
    int i1 = Integer.valueOf("2122223333");
    int i2 = Integer.parseInt("2122223333");
    //    int i3 = Integer.parseInt("111231232122223333"); // 오류 표시가 없지만 실행 오류 발생
    long l = Long.valueOf("9221111222233334444");
    float f1 = Float.valueOf("3.14f");
    float f2 = Float.valueOf("3.14f");
    double d = Double.valueOf("9876.54321");
    // TRUE가 아닌 것들은 모두 FALSE
    boolean bool1 = Boolean.valueOf("TRUE"); 
    boolean bool1_1 = Boolean.valueOf("1");
    boolean bool2 = Boolean.parseBoolean("TRUE");
    //    boolean bool2_1 = byte.parseBoolean("TRUE"); // parseBoolean에는 Boolean외에 지정할 수 없다.
    boolean bool3 = Boolean.parseBoolean("");
    char c1 = "가".charAt(0); // 문자열에서 순서에 맞는 문자 뽑아내기
    char c2 = "가나다라".charAt(1); // 문자열에서 순서에 맞는 문자 뽑아내기

    System.out.println(b);
    System.out.println(s);
    System.out.println(i1);
    System.out.println(i2);
    //    System.out.println(i3);
    System.out.println(l);
    System.out.println(f1);
    System.out.println(f2);
    System.out.println(d);
    System.out.println(bool1); 
    System.out.println(bool1_1); 
    System.out.println(bool2);
    System.out.println(bool3);
    System.out.println(c1);
    System.out.println(c2);

  }
}
