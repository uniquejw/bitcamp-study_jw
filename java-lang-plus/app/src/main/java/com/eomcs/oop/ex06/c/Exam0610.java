package com.eomcs.oop.ex06.c;

public class Exam0610 {
	static class Car {}
	static class Sedan extends Car {}
	static class Truck extends Car {}
	static class Tico extends Sedan{}

	static class CarFactory {
		Car create() {
			return new Car();
		}
	}

	static class SedanFactory extends CarFactory {
		@Override
		Sedan create() {
			return new Sedan();
		}
	}

	static class TicoFactory extends SedanFactory {
		@Override
		Tico create() {
			return new Tico();
		}
	}
	public static void main(String[] args) {

	}
}