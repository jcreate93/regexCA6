package regexCA6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Validator {

	public static void main (String[] args) throws FileNotFoundException{
		
		Scanner scnr =new Scanner(System.in);
		
		//variables
		String username;
		String password;
		boolean foundUser = false;
		boolean foundPass = false;
		
		
		//user enters username :: Username must: 1. Contain 6 to 8 characters 2. Include letters and numbers only 3. Start with a capital letter 4. End with a number
		System.out.println("Enter username: ");
		username = scnr.nextLine();
		
		//match username with regex - 1 unit capital, 1 unit numb or letter or capital letter repeated 4-6 times, 1 unit is a digit 0-9
		if(username.matches("[A-Z][a-zA-Z0-9]{4,6}[0-9]")) {
			System.out.println("It's a match!");
			foundUser = true;
			}
		else {
			System.out.println("Not a match!");
			foundUser = false;
		}
		
			
		//user enters password :: Password must: 1. Contain 8 to 12 characters 2. Can include letters, numbers or symbols -- could also be written as [a-zA-Z0-9\\W] where the period is at
		System.out.println("Enter password: ");
		password = scnr.nextLine();
		if (password.matches("[.]{8,12}")) {
			System.out.println("It's a match!");
			foundPass = true;
		}
		else {
			System.out.println("Not a match!");
			foundPass = false;
		}
		
		
		
		
		
	}
}
