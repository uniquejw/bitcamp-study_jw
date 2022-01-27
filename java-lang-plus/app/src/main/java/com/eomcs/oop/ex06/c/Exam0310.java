package com.eomcs.oop.ex06.c;

public class Exam0310 {
	static class C {
		private void m1() {}
		void m2() {}

		protected void m3() {}

		public void m4() {}
	}

	static class C2 extends C {
		private void m1() {}

		@Override void m2() {}
		@Override protected void m3() {}
		@Override public void m4() {}

		public static void main(String[] args) {

		}
	}
}
