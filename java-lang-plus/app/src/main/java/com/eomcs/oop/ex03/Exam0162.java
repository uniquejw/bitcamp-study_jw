package com.eomcs.oop.ex03;

public class Exam0162 {

	static class Member {
		public static final int GUEST = 0;
		public static final int MEMBER = 1;
		public static final int MANAGER = 2;

		String id;
		String password;
		int type; // 0: 손님, 1: 회원, 2: 관리자
	}

	public static void main(String[] args) {
		Member m4 = new Member();
		m4.id = "aaa";
		m4.password = "1111";
		m4.type = Member.GUEST;

		Member m5 = new Member();
		m5.id = "bbb";
		m5.password = "1111";
		m5.type = Member.MANAGER;

		Member m6 = new Member();
		m5.id = "ccc";
		m5.password = "1111";
		m5.type = Member.MEMBER;
	}
}
