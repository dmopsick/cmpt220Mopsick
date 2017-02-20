import java.util.Scanner;

// Dan Mopsick
// CMPT 220_112
public class EightDot1 {

	public static void main(String[] args) {
		// Initialize scanner
		Scanner scanner = new Scanner(System.in);
		
		// Prompt user to enter a 3 by 4 matrix row by row
		System.out.println("Enter a 3-by-4 matrix of numbers row by row.");
		
		// Initialize array to hold user input 
		double[][] userInput = new double[3][4];
		
		// Parse user input
		for(int i = 0; i < userInput.length; i ++){
			for(int j = 0; j <userInput[i].length; j++){
				userInput[i][j] = scanner.nextDouble();
			}
		}
		
		// Calculate sum of each column 
		double column0Sum = sumColumn(userInput, 0);
		double column1Sum = sumColumn(userInput, 1);
		double column2Sum = sumColumn(userInput, 2);
		double column3Sum = sumColumn(userInput, 3);
		
		//Display results to the user
		System.out.println("Sum of the elements at column 0 is " + column0Sum + ".");
		System.out.println("Sum of the elements at column 1 is " + column1Sum + ".");
		System.out.println("Sum of the elements at column 2 is " + column2Sum + ".");
		System.out.println("Sum of the elements at column 3 is " + column3Sum + ".");
	}

	private static double sumColumn(double[][] list, int columnIndex) {
		double sum = 0;
		for(int i = 0; i < list.length; i++){
			sum += list[i][columnIndex];
		}
		return sum;
	}

}
