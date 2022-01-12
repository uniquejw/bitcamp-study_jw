package com.eomcs.lang.ex04;

public class Exam0570 {
  public static void main(String[] args) {
    // 배열 선언의 다양한 방법

    int[] arr1 = new int[5];

    arr1[0] = 100;
    arr1[1] = 90;
    arr1[2] = 80;
    arr1[3] = 70;
    arr1[4] = 60;

    int[] arr2 = new int[] {100, 90, 80, 70, 60}; // OK!

    int[] arr3 = {100, 90, 80, 70, 60}; // new int[] 생략 가능

    int[] arr4;

    int[] arr5;
    arr5 = new int[] {0, 0, 0, 0, 0};
  }
}
