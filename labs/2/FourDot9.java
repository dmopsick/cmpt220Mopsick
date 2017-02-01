

import java.util.Scanner;

// Dan Mopsick
// CMPT 220L_112
public class FourDot9 {

	public static void main(String[] args){
		//Initialize scanner
		Scanner scanner = new Scanner(System.in);
		
		//Prompt the user to enter a character
		System.out.println("Enter a character.");
		
		//Take in string from the user
		String input = scanner.next();
		
		//Convert string into a char
		char character = input.charAt(0);

		//Display the unicode to the user
		System.out.println("The Unicode for the character " + input + " is " + (int)character + ".");
	}
	
}
