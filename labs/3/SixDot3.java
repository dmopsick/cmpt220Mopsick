package lab3;

import java.util.Scanner;

//By Dan Mopsick
//CMPT 220_112
public class SixDot3 {

	public static void main(String[] args) {
		// Initialize scanner
		Scanner scanner = new Scanner(System.in);
		
		// Prompt the user to enter an integer
		System.out.println("Enter an integer to test whether it is a palindrome.");
		
		// Parse input from the user
		int input = scanner.nextInt();
		
		// Check if the number is a palindrome
		boolean palindrome = isPalindrome(input);
		
		//Display results to the user
		if(palindrome){
			System.out.println(input + " is a palindrome.");
		}
		else{
			System.out.println(input + " is not a palindrome.");
		}
	}
	
	// Create method that reverses an integer
	public static int reverse(int number){
		int lastDigit;
		int reversedNum = 0;
		while(number != 0){
			// Isolate last digit with modulo
			lastDigit = number % 10;
			
			// Add last digit to the new reversed number
			reversedNum = reversedNum * 10 + lastDigit;
			
			// Divide number by 10 to access next digit
			number = number / 10;
		}
		
		// Return the reversed number
		return reversedNum;
	}
	
	// Create a method that checks if integer is a palindrome
	public static boolean isPalindrome(int number){
		int reverseNum = reverse(number);
		
		if(reverseNum == number){
			return true;
		}
		else{
			return false;
		}
	}
	
}
