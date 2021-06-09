/*
 * This class is intended to check that username and password entered follow the regex pattern,
 *  and check that the username and password match the text document that was inputed
 */
package regexCA6;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Validator {

	public static void main (String[] args) throws IOException{
		
		Scanner scnr =new Scanner(System.in);
		
		//variables
		String username = null;
		String password = null;
		String currUser;
		String currPass;
		boolean foundUser = false;
		boolean foundPass = false;
		FileInputStream fileByteStream = null;
		Scanner inFS = null;

		
		while(foundUser == false) {
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
			}
			
		
		
		//user enters password :: Password must: 1. Contain 8 to 12 characters 2. Can include letters, numbers or symbols -- could also be written as [a-zA-Z0-9\\W] where the period is at
		while(foundPass == false) {
			System.out.println("Enter password: ");
			password = scnr.nextLine();
			if (password.matches(".{8,12}")) {
				System.out.println("It's a match!");
				foundPass = true;
				}
				
			else {
				System.out.println("Not a match!");
				foundPass = false;
			}
		}
		
		
		/*validating username and password match text file
		both username and password must be valid in order to continue 
		with checking them against the FileInputStream
		*/
		if (foundUser==true && foundPass==true){
			
			//opens file and starts verifying username and password against the text file
			try {
				System.out.println("Opening file... "); //Opening file loginMatch.txt.
				fileByteStream = new FileInputStream("checkLogin.txt"); //created a new fileInputStream
				inFS = new Scanner(fileByteStream);
				
				System.out.println("Verifying your username and password.");
				while (inFS.hasNext()) {                                            
					currUser = inFS.next();                                //matches inputed username to the text file
			    	currPass = inFS.next();
				
			    	if (currUser.equals(username)) {
			    		foundUser = true;
			    		System.out.print("Username verified.\n");
			    		if (currPass.equals(password)) {
				    		foundPass = true;
				    		System.out.print("Password verified.\n");
				    		System.out.println("Welcome " + currUser);
				    		return;
				    		}
			    		else {
				    		System.out.print("Password incorrect.");
				    		return;
				    		}
			    		}
			    	}
			
				 System.out.println("Username not found");
				  //close confidentialInfo.txt file
				    System.out.println("Closing program...");  
				    fileByteStream.close();
			}
			catch (IOException excpt) {
				System.out.println("Caught IOException: " + excpt.getMessage());
			}
			finally {
				fileByteStream.close();
			}
		}  	
		    	
			
		
		
		
		
		
		
		
		

	}
}
