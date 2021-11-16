package com.java.StandardPrograms;

public class ProgramC {

	public static void main(String[] args) {
		String str = "source";
		int average = 0;
		int asciiCode = 0;
		int sum = 0;
		for(int i = 0; i<str.length(); i++) {
			asciiCode = (int)str.charAt(i);
			sum = sum + asciiCode;
		}
		average = sum / str.length();
		System.out.print(average);

	}

}
