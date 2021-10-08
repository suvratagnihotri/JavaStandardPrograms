package com.java.StandardPrograms;


//Program to pass/return Object in/from an Immutable class.

public class ImmutableToMutable {
	public static void main(String [] args) {
		Radius radius = new Radius();
		radius.setStart(0);
		radius.setEnd(120);
		Point point = new Point(1.23, 1.43, radius);
		System.out.println("Radius start: " + point.getRadius().getStart());
		radius.setStart(5);;
		System.out.println("Radius start: " + point.getRadius().getStart());
	}
}

final class Point{
	private final double x;
	private final double y;
	private final Radius radius;
	
	public Point(double x, double y, Radius radius) {
		this.x = x;
		this.y = y;
		//Conventional method to pass object argument in to an Immutable class.
//		this.radius = radius;
		
		
		//New method -> Clone the Object and then pass it to the Immutable class.
		//To increase the immutability of the Point(Immutable class) class.
		Radius clone = new Radius();
		clone.setStart(0);
		clone.setEnd(120);
		this.radius = clone;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public Radius getRadius() {
		return this.radius;
	}
}

class Radius{
	private int start;
	private int end;
	
	public void setStart(int start) {
		this.start = start;
	}
	
	public int getStart() {
		return this.start;
	}
	
	public void setEnd(int end) {
		this.end = end;
	}
	
	public int getEnd() {
		return this.end;
	}
	
}
