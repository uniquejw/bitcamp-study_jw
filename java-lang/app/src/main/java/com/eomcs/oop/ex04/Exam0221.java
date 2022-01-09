// Integer 클래스 : new Integer() vs Integer.valueOf()
package com.eomcs.oop.ex04;

public class Exam0221 {
  public static void main(String[] args) throws Exception {
    // 다음과 같이 생성자를 통해 Integer 객체를 생성할 수 있지만,
    // 이 생성자는 사용하지 말라고 권고한 것이기 때문에 
    // 가능한 개발 중에 사용하지 말라!
    Integer obj1 = new Integer(100);
    Integer obj2 = new Integer(100);
    Integer obj3 = new Integer(100);

    Integer i1 = Integer.valueOf(127); // int 값을 가지고 Integer 객체를 생성할 때!
    Integer i2 = Integer.valueOf(127);
    Integer i3 = Integer.valueOf(127);

    System.out.println(obj1 == obj2);
    System.out.println(obj1 == obj3);
    System.out.println(obj2 == obj3);
    System.out.println("--------------------------------");


    System.out.println(i1 == i2);
    System.out.println(i1 == i3);
    System.out.println(i2 == i3);
  }
}





