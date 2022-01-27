package com.eomcs.lang.ex07;

public class Exam0250 {

	// 가변 파라미터
	// [리턴타입] 메서드명(타입... 변수) {...}
	// => 0 개 이상의 값을 받을 때 선언하는 방식.
	// => 메서드 내부에서는 배열처럼 사용한다.
	//
	// 다음은 hello()를 호출할 때 String 값을 0개 이상 전달할 수 있다.
	static void hello(String... names) {
		for (int i = 0; i < names.length; i++) {
			System.out.printf("%s님 반갑습니다.\n", names[i]);
		}
	}
	public static void main(String[] args) {
		hello();
		System.out.println("----------");

		hello("홍길동");
		System.out.println("----------");

		hello("홍길동", "임꺽정", "유관순");
		System.out.println("----------");

		String[] arr = {"김구", "안중근", "윤봉길", "유관순"};

		hello(arr);
		System.out.println("----------");
	}
}

