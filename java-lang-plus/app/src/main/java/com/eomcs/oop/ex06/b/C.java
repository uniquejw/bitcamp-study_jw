package com.eomcs.oop.ex06.b;

public class C {

	public void m1() {}
	public void m1(float a) {}
	public void m1(byte a) {}
	public int m1(short a) {return 0;}
	public String m1(long a) {return null;}

	public float m1(float a, float b) {return 0f;}
	public void m1(short a, String b) {}

	void m1(float a, int b) {}
	private void m1(float a, int b, int c) {}
	protected void m1(float a, int b, int c, String d) {}

}
