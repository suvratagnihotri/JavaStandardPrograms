package com.java.StandardPrograms;

import java.util.Objects;

//Program to throw NullPointerException for null values.
public class ThrewExceptionForNullReference {

	public static void main(String[] args) {
		String name = "Honda";
		String color = "Black";
		Car car = new Car(null , color);
		car.assignDriver("Rohan", "India");
	}

}

class Car {
	private String name;
	private String color;
	public Car(String name, String color) {
		this.name = Objects.requireNonNull(name, "Car name can not be null");
		this.color = Objects.requireNonNull(color, "Car color can not be null");
	}
	
	public void assignDriver(String license, String location) {
		Objects.requireNonNull(license, "License can not be null");
		Objects.requireNonNull(location, "Location can not be null");
		System.out.println(this.name + " car of " +this.color + " is assigned to " + license +" for " + location + " location." );
	}
}
