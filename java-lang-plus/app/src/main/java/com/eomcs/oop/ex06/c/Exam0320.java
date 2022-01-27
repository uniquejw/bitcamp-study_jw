package com.eomcs.oop.ex06.c;

public class Exam0320 {

	static class C {
		private void m1() {}
		void m2() {}
		protected void m3() {}
		public void m4() {}
	}

	static class C3 extends C {
		@Override public void m2() {}
		@Override public void m3() {}
		@Override public void m4() {}
	}

	public static void main(String[] args) {
	}
}
