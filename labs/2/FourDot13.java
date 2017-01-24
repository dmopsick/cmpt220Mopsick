package lab2;

import java.util.Scanner;

// Dan Mopsick
// CMPT 220L_112
public class FourDot13 {

	public static void main(String[] args) {
		// Initialize scanner
		Scanner scanner = new Scanner(System.in);
		
		//Prompt the user
		System.out.println("Enter a letter.");
		
		//Take in input from the user
		String input = scanner.next();
		
		//Initialize message to be displayed to the user
		String message = "";
		
		//Testing program
		//System.out.println(input.length());
		
		//Determine if input is too long
		if(input.length() == 1){
			
			//Determine if the input is valid
			char letter = input.charAt(0);
			if(Character.isLetter(letter)){
				
				//Convert letter to lowercase
				input = input.toLowerCase();
				
				//Determine if the input is a consonant or vowel 
				if(input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u")){
					message = letter + " is a vowel";
				}
				else{
					message = letter + " is a consonant";
				}
			}
			else{
				message = input + " is an invalid input";
			}
		}
		else{
			message = input + " is an invalid input because it is longer than one character.";
		}
		
		
		
		

		//Display results to the user
		System.out.println(message);
	}

}
