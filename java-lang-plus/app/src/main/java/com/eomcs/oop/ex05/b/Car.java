package com.eomcs.oop.ex05.b;

public class Car {

	public String model;
	public String maker;
	public int capacity;

	public boolean sunroof;
	public boolean auto;

	public Car() {}

	public Car(String model, String maker, int capacity) {
		this.model = model;
		this.maker = maker;
		this.capacity = capacity;
	}

	public Car(String model, String maker, int capacity,
			boolean sunroof, boolean auto) {
		this(model, maker, capacity);

		this.sunroof = sunroof;
		this.auto = auto;
	}
}
