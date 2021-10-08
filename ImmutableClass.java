package com.java.StandardPrograms;

//Program to create a immutable class
public class ImmutableClass {
	private int age ;
	private String name ;
	public ImmutableClass(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	public String getName() {
		return this.name;
	}
	
	public static void main(String args[]) {
		ImmutableClass immutableClass = new ImmutableClass(21, "Abid");
		System.out.println(immutableClass.getAge());
		System.out.println(immutableClass.getName());
		
	}
}
