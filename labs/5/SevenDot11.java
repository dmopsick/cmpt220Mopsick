import java.util.Scanner;

// Dan Mopsick
// CMPT 220L_112
public class SevenDot11 {

	public static void main(String[] args) {
		// Initialize the scanner
		Scanner scanner = new Scanner(System.in);
		
		// Initialize array to hold user input
		double[] userInput = new double[10];
		
		// Prompt the user to enter ten numbers
		System.out.println("Enter 10 numbers.");
		
		// Parse user input
		for(int x = 0; x < userInput.length; x++){
			userInput[x] = scanner.nextDouble();
		}
		
		// Calculate mean of numbers
		double mean = mean(userInput);
		
		// Calculate standard deviation of numbers
		double deviation = deviation(userInput);
		
		// Display results to the user
		System.out.printf("The mean is: %6.2f.\n", mean );
		System.out.printf("The standard deviation is %6.5f.", deviation);
	}

	// Computer the deviation of double values
	public static double deviation(double[] x){
		double mean = mean(x);
		double squareSum = 0;
		
		for(int i = 0; i < x.length; i ++){
			squareSum  += Math.pow((x[i] - mean), 2);
		}
		
		return Math.sqrt(squareSum / (x.length - 1));
	}
	
	// Compute the mean of an array of double values
	public static double mean(double[] x){
		double total = total(x);
		
		double mean = total / x.length;
		return mean;
	}
	
	public static double total(double[] array){
		double total = 0;
		for(int i = 0; i < array.length; i++){
			total += array[i];
		}
		return total;
	}
}
