package com.eomcs.oop.ex06.a;

public class Exam0110 {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		Bike bike = new Bike();
		Car car = new Car();
		Sedan sedan = new Sedan();
		Truck truck = new Truck();

		Vehicle vehicle2 = null;
		vehicle2 = bike;
		vehicle2 = car;
		vehicle2 = sedan;
		vehicle2 = truck;

		Car car2 = null;
		car2 = sedan;
		car2 = truck;

		Bike bike2 = null;

	}
}
