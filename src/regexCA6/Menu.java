package regexCA6;
import java.util.Scanner;

public class Menu {
	public void options(){
		int userInput = 0;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Type 1 for writing text, 2 for deleting text, or 3 to quit.");
		userInput = scnr.nextInt();
		
		if(userInput == 1) {
		System.out.println("Lets type some text!");
		}
		else if (userInput == 2) {
			System.out.println("Made a mistake. Lets delete some text!");
			}
		else if (userInput == 3) {
			System.out.println("We are sad to see you go. Goodbye.");
			}
		else {
			System.out.println("Try again!");
			}

}
}
