import java.util.Scanner;
import java.util.Arrays;

// Dan Mopsick
// CMPT 220L_112
public class SevenDot19 {
	public static void main(String[] args){
		// Initialize Scanner
		Scanner scanner = new Scanner(System.in);
		
		// Prompt the user to enter the length of the list
		System.out.println("Enter the desired length(integer) of your list.");
		
		// Parse input from user
		int length = scanner.nextInt();
		
		// Prompt the user to enter contents of the list
		System.out.println("Enter " + length + " integers.");
		
		// Initialize array that holds input
		int[] userInput = new int[length];
		
		// Parse input from the user
		for(int x = 0; x < userInput.length; x++){
			userInput[x] = scanner.nextInt();
		}
		
		// Check to see if the list is already sorted
		boolean sorted = isSorted(userInput);
		
		// Display results to the user
		if(sorted){
			System.out.println("This list is already sorted");
		}
		else{
			System.out.println("The list is not sorted");
		}
	}

	private static boolean isSorted(int[] list) {
		int[] sortedList = list.clone();
		Arrays.sort(sortedList);
		
		boolean sorted = Arrays.equals(list, sortedList);
		
		if(sorted){
			return true;
		}
		else{
			return false;
		}
	}
}
