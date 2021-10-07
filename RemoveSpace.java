package com.java.StandardPrograms;

import java.util.Scanner;


//Program to remove leading and trailing spaces from a given string .
public class RemoveSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string with spaces");
		String inputString = new String(sc.nextLine());
		//Using trim() method 
		String trimmedString = inputString.trim();
		System.out.println(trimmedString);
		//Using split() method
		String strippedString = inputString.strip();
		System.out.println(strippedString);

	}

}
