import java.util.Scanner;

// Dan Mopsick
// CMPT 220L_112
public class SevenDot10 {

	public static void main(String[] args) {
		// Initialize Scanner
		Scanner scanner = new Scanner(System.in);
		
		// Prompt the user to enter 10 numbers
		System.out.println("Enter 10 numbers.");
		
		// Initialize array to store user input
		double[] userInput = new double[10];
		
		// Parse input from the user
		for(int x = 0; x < userInput.length; x++){
			userInput[x] = scanner.nextDouble();
		}
		
		// Calculate the index of the smallest element
		int smallestIndex = indexOfSmallestElement(userInput);
		
		// Display index to the user
		System.out.println("The index of the smallest element is " + smallestIndex + ".");
	}

	// Method finds and returns the index of the smallest element of an array
	public static int indexOfSmallestElement(double[] array){
		int indexOfSmallest = 0;
		for(int x = 0; x < array.length; x++){
			if(array[indexOfSmallest] > array[x]){
				indexOfSmallest = x;
			}
		}
		return indexOfSmallest;
	}
}
