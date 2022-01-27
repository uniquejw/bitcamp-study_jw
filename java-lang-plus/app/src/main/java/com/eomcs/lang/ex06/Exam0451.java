package com.eomcs.lang.ex06;

public class Exam0451 {
	public static void main(String[] args) {
		String[] names = {"홍길동", "임꺽정", "유관순", "윤봉길", "안중근"};

		//	외부에 변수 선언할 수 없다.
		//	String name; 
		//	for (name : names) 

		for (String name : names)
			System.out.println(name);
	}
}
