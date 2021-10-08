package com.java.StandardPrograms;

import java.util.Objects;

public class Player {
	private String name;
	private int age;
	public Player(int age, String name) {
		this.name = name;
		this.age = age;
	}
	
	@Override 
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj==null) {
			return false;
		}
		if(getClass()!=obj.getClass()) {
			return false;
		}
		final Player  other = (Player) obj;
		if(this.age != other.age) {
			return false;
		}
		if(!Objects.equals(this.name, other.name)) {
			return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		int hash = 7;
		hash = 79 * hash + this.age;
		hash = 79 * hash + Objects.hashCode(this.name);
		return hash;
	}
	
}
