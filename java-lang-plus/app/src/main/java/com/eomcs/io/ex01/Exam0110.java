package com.eomcs.io.ex01;

import java.io.File;

public class Exam0110 {
	public static void main(String[] args) throws Exception{
		File currentDir = new File("./src/main/java");
		System.out.printf("폴더명: %s\n", currentDir.getName());
		System.out.printf("경로: %s\n", currentDir.getPath());
		System.out.printf("절대 경로: %s\n", currentDir.getAbsolutePath());
		System.out.printf("계산된 절대 경로: %s\n", currentDir.getCanonicalPath());

		System.out.printf("총크기 : %s\n", currentDir.getTotalSpace());
		System.out.printf("남은 크기: %d\n", currentDir.getFreeSpace());
		System.out.printf("가용 크기: %d\n", currentDir.getUsableSpace());

		System.out.printf("디렉토리 여부: %b\n", currentDir.isDirectory());
		System.out.printf("파일 여부: %b\n", currentDir.isFile());
		System.out.printf("감춤 폴더: %b\n", currentDir.isHidden());
		System.out.printf("존재여부: %b\n", currentDir.exists());
		System.out.printf("실행가능여부: %b\n", currentDir.canExecute());
	}
}
