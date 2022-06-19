package com.mitrakingshuk.service;

import java.util.Scanner;

import com.mitrakingshuk.model.Employee;

public class DriverClass {

	static {
		System.out.println("Welcome to Employee Email Generator App!");
		System.out.println();
	}

	public static void main(String[] args) {

		Employee e = new Employee("Diego", "Maradona");

		CredentialService cs = new CredentialService();

		String empEmail;
		char[] empPassword;

		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		//Scanner object takes input from user
		Scanner sc = new Scanner(System.in);
		int choice;

		//try-catch used for user inputs which are not integers where nextInt throws an exception
		try {
			choice = sc.nextInt();

			if (choice == 1) {
				empEmail = cs.generateEmailAddress(e.getFirstName().toLowerCase(), e.getLastName().toLowerCase(),
						"tech");
				empPassword = cs.generatePassword();
				cs.showCredentials(e, empEmail, empPassword);
			} else if (choice == 2) {
				empEmail = cs.generateEmailAddress(e.getFirstName().toLowerCase(), e.getLastName().toLowerCase(),
						"admin");
				empPassword = cs.generatePassword();
				cs.showCredentials(e, empEmail, empPassword);
			} else if (choice == 3) {
				empEmail = cs.generateEmailAddress(e.getFirstName().toLowerCase(), e.getLastName().toLowerCase(), "hr");
				empPassword = cs.generatePassword();
				cs.showCredentials(e, empEmail, empPassword);
			} else if (choice == 4) {
				empEmail = cs.generateEmailAddress(e.getFirstName().toLowerCase(), e.getLastName().toLowerCase(),
						"legal");
				empPassword = cs.generatePassword();
				cs.showCredentials(e, empEmail, empPassword);
			} else {
				System.out.println("Please input a valid option: A number between 1 and 4");
			}

		} catch (Exception ex) {
			System.out.println("Please run program again and input an integer between 1 and 4");
		}

		sc.close();

	}

}
