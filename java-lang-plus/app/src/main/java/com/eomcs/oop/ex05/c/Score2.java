package com.eomcs.oop.ex05.c;

public class Score2 {

	public String name;
	public int kor;
	public int eng;
	public int math;

	public int sum;
	public float aver;

	public int music;
	public int art;

	public void compute() {
		this.sum = this.kor + this.eng + this.math + this.music + this.art;
		this.aver = this.sum /5f;
	}

}
