package com.eomcs.oop.ex05.x3.app4;

public class Engine {
	int cc;
	int valve;

	public void run() {
		if (kwh > 0) {
			System.out.println("전기로 간다!");
		} else {
			System.out.println("씽씽 달리다!");
		}
	}

	public void start() {
		System.out.println("시동 건다!");
	}
	public void stop() {
		System.out.println("시동 끈다!");
	}

	int kwh;
	public void chargeBattery(int kwh) {
		this.kwh = kwh;
	}
}
