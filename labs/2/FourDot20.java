package lab2;
import java.util.Scanner;

//Dan Mopsick
//CMPT 220L_112
public class FourDot20 {

	public static void main(String[] args) {
		// Intialize Scanner
		Scanner scanner = new Scanner(System.in);
		
		// Prompt the user to enter a string
		System.out.println("Please enter a string");
		
		// Parse input from the user
		String input = scanner.next();
		
		// Calculate length of the string
		int length = input.length();
		
		// Parse the first character of the string
		char firstChar = input.charAt(0);
		
		// Display results to the user
		System.out.println("The length of the inputted string is " + length + ".\nThe first character of the inputted string is " + firstChar + ".");
	}

}
