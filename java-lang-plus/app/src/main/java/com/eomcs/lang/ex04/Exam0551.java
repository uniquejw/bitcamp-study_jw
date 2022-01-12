package com.eomcs.lang.ex04;

public class Exam0551 {
  public static void main(String[] args) {
    int [] arr1;
    arr1 = new int[5];

    arr1 = null;

    // 레퍼런스가 배열 인스턴스를 가리키지 않은 상태에서의 사용은
    //    System.out.println(arr1[0]);  // NullPointerException 실행 오류
  }
}
