package com.java.StandardPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

//Program to check null reference of the object and remove null values from the given list of Integers.
public class NullReference {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,2,3,null,4,5,null,6,7,null);
		List<Integer> outputIntegers = checkNullReference(integers);
		System.out.println(outputIntegers);

	}

	@SuppressWarnings("unchecked")
	private static List<Integer> checkNullReference(List<Integer> integers) {
		if(Objects.isNull(integers)) {
			return Collections.EMPTY_LIST;
		}
		List<Integer> outputList = new ArrayList<>();
		for(Integer integer : integers) {
			if(Objects.nonNull(integer)) {
				outputList.add(integer);
			}
		}
		return outputList;
	}

}
