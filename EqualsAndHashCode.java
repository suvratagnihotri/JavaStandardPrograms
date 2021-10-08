package com.java.StandardPrograms;

import java.util.HashSet;
import java.util.Set;

//Program to use equals() and hashcode() method.
public class EqualsAndHashCode {

	public static void main(String[] args) {
		int age = 21;
		String name = "Rahul";
		Player player2 = new Player(age, name);
		Player player3 = new Player(age, name);
		System.out.println(player2.equals(player3));//true
		System.out.println(player2.hashCode());
		System.out.println(player3.hashCode());
		Set<Player> players = new HashSet<>();
		players.add(player3);
		players.add(player2);
		
		//The size of this HashSet is 1 because the hashCode of both the 
		//objects of Player class player2 and player 3 are same .
		//For that I have override the hashCode() and equals() and modified them as per requirements.
		System.out.print(players.size()); //1
		
	}

}
