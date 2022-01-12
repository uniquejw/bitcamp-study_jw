package com.eomcs.lang.ex03;

public class Exam0220 {
  public static void main(String[] args) {

    //    문자 삽입 가능
    System.out.println(12783406);
    System.out.println(127834_06);
    System.out.println(12783_406);

    //    문자 삽입 가능 예외
    //    System.out.println(_12783406);
    //    System.out.println(12783406_);

    //    ## 8진수에 _문자 삽입
    System.out.println(077);
    System.out.println(07_7);
    System.out.println(0_77);

    //    ## 8진수에 _문자 삽입 예외
    //    System.out.println(_077);
    //    System.out.println(077_);

    //    ## 2진수에 _ 문자 삽입
    System.out.println(0b1100100);
    System.out.println(0b110_0100);
    System.out.println(0b1_1_0_0_1_0_0);
    //    2진수에 _문자 삽입 예외
    //    System.out.println(0b_1100100);
    //    System.out.println(0b1100100_);

    //    ## 16진수에 _ 문자 삽입
    System.out.println(0xffaa);
    System.out.println(0xff_aa);

    //    ## 16진수에 _ 문자 삽입 예외
    //    System.out.println(0xffaa_);
    //    System.out.println(0x_ffaa);

  }
}
