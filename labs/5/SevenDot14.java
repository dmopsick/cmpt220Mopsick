import java.util.Scanner;
import java.util.ArrayList;

// Dan Mopsick
// CMPT 220L_112
public class SevenDot14 {

	public static void main(String[] args) {
		// Initialize scanner
		Scanner scanner = new Scanner(System.in);
		
		// Initialize array to hold input
		int[] userInput = new int[5];
		
		// Prompt user to enter five integers
		System.out.println("Enter five integers.");
		
		// Parse user input
		for(int x = 0; x < userInput.length; x++){
			userInput[x] = scanner.nextInt();
		}
		
		// Find the gcd of the numbers
		int gcd = gcd(userInput);
		
		// Display the gcd of the numbers
		System.out.println("The gcd of the entered integers is " + gcd + ".");
	}

	// Calculate gcd of 5 integers
	public static int gcd(int... numbers){
		// Initialize variable to hold gcd
		int gcd = 1;
		int testInt = 1;
		
		// Determine smallest number entered
		int smallest = numbers[0];
		for(int i = 1; i < numbers.length; i++){
			if(smallest > numbers[i]){
				smallest = numbers[i];
			}
		}
		
		while(testInt <= smallest){
			for(int i = 0; i < numbers.length; i ++){
				if(numbers[i] % testInt != 0){
					break;
				}
				if(i == numbers.length - 1){
					gcd = testInt;
				}
			}
			testInt++;
		}
		
		return gcd;
	}

	private static int gcdOfPair(int currentGcd, int num) {
		int gcd = 1;
		int possibleGcd = 1;
		
		while(possibleGcd <= currentGcd && possibleGcd <= num){
			if(gcd % possibleGcd ==  0 && num % possibleGcd == 0){
				gcd = possibleGcd;
			}
			possibleGcd ++;
		}
		return gcd;
	}
}
