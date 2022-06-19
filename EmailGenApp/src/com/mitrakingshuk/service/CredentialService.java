package com.mitrakingshuk.service;

import java.util.Random;

import com.mitrakingshuk.model.Employee;

public class CredentialService {

	//Method to generate a random password for an employee
	public char[] generatePassword() {
		
		char [] password = new char[8];
		
		String capLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialChars = "~`!@#$%^&*()_+-=[]{};':?/>.<,";
		
		String allChars = capLetters+smallLetters+numbers+specialChars;
		
		//rand will help in generating random numbers within a certain bound
		Random rand = new Random();
		
		//To ensure at least one of each letter type is present in the password
		password[0] = capLetters.charAt(rand.nextInt(capLetters.length()));
		password[1] = smallLetters.charAt(rand.nextInt(smallLetters.length()));
		password[2] = numbers.charAt(rand.nextInt(numbers.length()));
		password[3] = specialChars.charAt(rand.nextInt(specialChars.length()));
		
		//Rest 4 password characters to be chosen randomly from a concatenation of all letter types
		for(int j=4;j<8;j++)
			password[j] = allChars.charAt(rand.nextInt(allChars.length()));
		
		return password;
	}
	
	//Method to generate a email for an employee
	public String generateEmailAddress(String firstName, String lastName, String department) {
		
		return firstName+lastName+"@"+department+".abc.com";
	}
	
	//Method to print email and password for an employee
	public void showCredentials(Employee e, String email, char[] pwd) {
		System.out.println("Dear " + e.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email    ---> " + email);
		System.out.println("Password ---> " + new String(pwd));
	}

}
