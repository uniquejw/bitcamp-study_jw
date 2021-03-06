package com.eomcs.io.ex01;

import java.io.File;
import java.io.FilenameFilter;

public class Exam0610 {
	public static void main(String[] args) {
		class JavaFilter implements FilenameFilter {
			@Override
			public boolean accept (File dir/*부모 경로*/, String name/*파일, 디렉토리 이름*/) {
				if (name.endsWith(".java"))
					return true;
				return false;
			}
		}

		File dir = new File(".");
		JavaFilter javaFilter = new JavaFilter();

		String[] names = dir.list(javaFilter);

		for (String name : names) {
			System.out.println(name);
		}

	}
}
