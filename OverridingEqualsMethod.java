package com.java.StandardPrograms;

//Program to override equals()  method.
public class OverridingEqualsMethod {
	public static void main(String []args) {
		Employee employee1 = new Employee(1,"Suresh",25000);
		Employee employee2 = new Employee(1,"Suresh",25000);
		System.out.println(employee1.equals(employee2));
	}
}

class Employee{
	private int id;
	private String name;
	private int salary;
	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public boolean equals(Object object) {
		if(object == this) {
			return true;
		}
		if (!(object instanceof Employee)) {
	         return false;
	      }
		Employee emp = (Employee) object;
	    return name.equals(emp.name)&& Integer.compare(salary, emp.salary) ==0 && Integer.compare(id, emp.id) == 0;
	}
}
