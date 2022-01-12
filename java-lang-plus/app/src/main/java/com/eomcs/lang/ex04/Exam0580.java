package com.eomcs.lang.ex04;

public class Exam0580 {
  public static void main(String[] args) {
    int[] arr1;
    arr1 = new int[5];
    arr1[0] = 100;

    arr1 = new int[] {200, 200, 200};

    System.out.println(arr1[0]);
    System.out.println(arr1[1]);
    System.out.println(arr1[2]);
    //    System.out.println(arr1[3]); //오류 발생 : 배열이 [3]으로 초기화 되었기 때문
  }
}
