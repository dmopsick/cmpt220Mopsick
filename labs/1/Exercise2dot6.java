import java.util.Scanner;

public class Exercise2dot6 {
	public static void main(String[] args){
		//Initialize scanner
		Scanner scanner = new Scanner(System.in);
		
		//Prompt the user
		System.out.println("Enter an integer between 0 and 1000");
		
		//Get a number from the user
		int number = scanner.nextInt();
		
		//Get the first digit
		int firstDigit = number % 10;
		
		//Extract the first digit
		number = number / 10;
		
		//Get the second digit
		int secondDigit = number % 10;
		
		//Extract the second digit 
		number = number / 10;
		
		//Get the third digit
		int thirdDigit = number;
		
		//Add digits
		int sum = firstDigit + secondDigit + thirdDigit;
		
		//Display sum to the user
		System.out.println("The sum of the digits is " + sum +".");
	}
}
