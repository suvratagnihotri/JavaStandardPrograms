package com.java.StandardPrograms;

//Program to use equals() and hashcode() method.
public class EqualsAndHashCode {

	public static void main(String[] args) {
		int age = 21;
		String name = "Rahul";
		Player player2 = new Player(22, "Rohan");
		Player player3 = new Player(22, "Rohan");
		System.out.println(player2.equals(player3));
		System.out.println(player2.hashCode());
		System.out.println(player3.hashCode());
	}

}
