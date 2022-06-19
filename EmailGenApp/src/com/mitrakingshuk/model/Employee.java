package com.mitrakingshuk.model;

public class Employee {

	//Private variables to store employee name
	private String firstName; 
	private String lastName;

	//Constructor to take employee name as input
	public Employee (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	//Getter and Setter methods to access private employee name variables
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
