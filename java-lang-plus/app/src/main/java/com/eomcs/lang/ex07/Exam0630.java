package com.eomcs.lang.ex07;

public class Exam0630 {
	public static void main(String[] args) {


		java.util.Properties props = System.getProperties();

		java.util.Set keySet = props.keySet();

		for (Object key : keySet) {
			String value = props.getProperty((String) key);
			System.out.printf("%s ==> %s\n", key, value);
		}
	}
}
