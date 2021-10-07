package com.java.StandardPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Program to count duplicate characters in a string using Map and HashMap.

public class CountingDuplicateCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String inputString = sc.nextLine();
		CountingDuplicateCharacters counting = new CountingDuplicateCharacters();
		Map<Character, Integer> result = counting.countDuplicateCharacters(inputString);
		System.out.println(result);
	}
	
	public Map<Character, Integer> countDuplicateCharacters(String str) {
		Map<Character, Integer> result = new HashMap<>();
		// or use for(char ch: str.toCharArray()) { ... }
		for (int i = 0; i<str.length(); i++) {
		char ch = str.charAt(i);
		result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
		}
		return result;
	}
	
//	public static Map<String, Long> countDuplicateCharacters(String str) {
//		Map<String, Long> result = str.codePoints()
//		.mapToObj(c -> String.valueOf(Character.toChars(c)))
//		.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//		return result;
//		}
	
}
