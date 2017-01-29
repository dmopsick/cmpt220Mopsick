package lab3;

import java.util.Scanner;

// By Dan Mopsick
// CMPT 220L_112
public class FiveDot1 {

	public static void main(String[] args) {
		// Initialize Scanner
		Scanner scanner = new Scanner(System.in);
		
		// Prompt the user
		System.out.println("Enter an integer, the input if it is 0.");
		
		// Create loop to take in multiple inputs
		Boolean running = true;
		
		// Integer to store inputs
		int input;
		int positives = 0;
		int negatives = 0;
		int total = 0;
		
		while(running){
			// Take in input from user
			input = scanner.nextInt();
			
			// Check for 0
			if(input == 0){
				break;
			}
			
			// Count positives and negatives
			if(input > 0){
				positives ++;
			}
			else{
				negatives ++;
			}
			
			// Calculate the total
			total += input;
		}
		
		// Calculate average
		double totalNums = negatives + positives;
		double average = total / totalNums;
		
		//Display results to the user
		System.out.println("The number of positives is " + positives + ".");
		System.out.println("The number of negatives is " + negatives + ".");
		System.out.println("The total is " + total + ".");
		System.out.println("The average is " + average + ".");
	}

}
