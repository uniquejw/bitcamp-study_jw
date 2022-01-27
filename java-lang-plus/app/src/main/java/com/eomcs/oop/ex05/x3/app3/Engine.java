package com.eomcs.oop.ex05.x3.app3;

import com.eomcs.oop.ex05.x2.CampingTrailer;

public class Engine {
	int cc;
	int valve;

	public void run() {
		if (trailer == null) {
			System.out.println("씽씽 달랜다!");
		} else {
			System.out.println("느릿 느릿 조심히 움직인다!");
		}
	}

	public void start() {
		System.out.println("시동 건다!");
	}

	public void stop() {
		System.out.println("시동 끈다!");
	}

	CampingTrailer trailer;
	public void setTrailer(CampingTrailer trailer) {
		this.trailer = trailer;
	}
}
