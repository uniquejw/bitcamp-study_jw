package com.eomcs.lang.ex04;

public class Exam0550 {
  public static void main(String[] args) {
    int[] arr1;
    arr1 = new int[5];

    int[] arr2 = arr1;

    arr2[0] = 100;
    //  arr2[0]에 담아도 같은 값을 가리키는 주소이므로 출력결과가 같다
    System.out.println(arr1[0]); 
  }
}
