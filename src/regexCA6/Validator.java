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
		    
		    
		    
	}
}
