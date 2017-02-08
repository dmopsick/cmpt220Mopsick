package lab3;

import java.util.Scanner;

// By Dan Mopsick
// CMPT 220_112
public class FiveDot16 {

	public static void main(String[] args) {
		// Initialize Scanner
		Scanner scanner = new Scanner(System.in);
		
		// Prompt user for an integer
		System.out.println("Enter an integer.");
		
		// Parse input from the user
		int input = scanner.nextInt();
		int num = input;
		
		// Create string to hold list of factors
		String factors = "";
		
		// Find smallest factors
		// Start with two and increase once cannot divide by 2
		for(int x = 2; x <= num; x++){
			while(num % x == 0){
				// Add the factor to the list
				factors += x + " ";
				
				// Divide the number by the factor
				num = num / x;
			}
		}
		
		// Display the results to the user
		System.out.println("Smallest factors of " + input + ": " + factors);
	}

}
