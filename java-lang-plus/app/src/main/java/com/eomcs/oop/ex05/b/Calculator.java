package com.eomcs.oop.ex05.b;

public class Calculator {
	public int result;

	public void plus (int value) {
		this.result += value;
	}

	public void minus (int value) {
		this.result -= value;
	}

	public void multiple (int value) {
		this.result *= value;
	}

	public void divide (int value) {
		this.result /= value;
	}
}
