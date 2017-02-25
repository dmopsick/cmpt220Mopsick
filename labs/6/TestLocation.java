import java.util.Scanner;

public class TestLocation {

	public static void main(String[] args) {
		// Initialize scanner
		Scanner scanner = new Scanner(System.in);
		
		// Prompt user to enter the amount of rows and columns in the array
		System.out.println("Enter the number of rows and columns in the array: ");
		
		// Parse user input
		int row = scanner.nextInt();
		int column = scanner.nextInt();
		
		// Prompt the user to enter the array
		double[][] array = new double[row][column];
		System.out.println("Enter the array:");
		
		// Parse user input
		for(int i = 0; i < array.length; i ++){
			for(int j = 0; j < array[i].length; j++){
				array[i][j] = scanner.nextDouble();
			}
		}
		
		// Find location of the largest element
		Location largest = locateLargest(array);
		
		// Display results to the user
		System.out.println("The location of the largest element is " + largest.maxValue + " at (" + largest.row + ", " + largest.column + ")" );
		
		
	}
	
	/** Returns the location of the largest number in the array */
	public static Location locateLargest(double[][] a){
		double biggest = a[0][0];
		int biggestRow = 0;
		int biggestColumn = 0;
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j ++){
				if(a[i][j] > biggest){
					biggest = a[i][j];
					biggestRow = i;
					biggestColumn = j;
				}
			}
		}
		Location biggestLocation = new Location(biggestRow, biggestColumn, biggest);
		return biggestLocation;
	}
}
