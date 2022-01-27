package com.eomcs.io.ex01;

import java.io.File;
import java.sql.Date;

public class Exam0520 {

	public static void main(String[] args) {
		File dir = new File(".");

		File[] files = dir.listFiles();

		for (File file : files) {
			System.out.printf("%s %s %12d %s \n",
					file.isDirectory() ? "d" : "-",
							new Date(file.lastModified()),
							file.length(),
							file.getName());
		}
	}
}
