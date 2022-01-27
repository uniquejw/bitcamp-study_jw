package com.eomcs.oop.ex06.a;

public class Exam0111 {
	public static void main(String[] args) {
		Bike bike = new Bike();

		Vehicle vehicle = bike;

		vehicle.model = "티코";
		vehicle.capacity = 5;
	}
}
