package com.eomcs.oop.ex06.a;

public class Exam0411 {
	public static void printSedan(Sedan sedan) {
		System.out.printf("모델명: %s\n", sedan.model);
		System.out.printf("cc: %d\n", sedan.cc);
		System.out.println("--------------------");
	}

	public static void printTruck(Truck truck) {
		System.out.printf("모델명: %s\n", truck.model);
		System.out.printf("cc: %d\n", truck.cc);
		System.out.println("--------------------");
	}

	public static void main(String[] args) {
		Sedan sedan = new Sedan();
		sedan.model = "티코";
		sedan.cc = 800;

		Truck truck = new Truck();
		truck.model = "타이탄II";
		truck.cc = 10000;

		printSedan(sedan);

		printTruck(truck);
	}
}
