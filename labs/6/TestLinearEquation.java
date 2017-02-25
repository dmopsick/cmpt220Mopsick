import java.util.Scanner;

public class TestLinearEquation {

	public static void main(String[] args) {
		// Initialize scanner
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter 6 numbers
		System.out.println("Enter six numbers for a, b, c, d, e, and f.");
		
		// Parse the user input
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		double d = scanner.nextDouble();
		double e = scanner.nextDouble();
		double f = scanner.nextDouble();
		
		// Create an instance of Linear Equation
		LinearEquation linearEquation = new LinearEquation(a,b,c,d,e,f);
		
		// Check if the equation is solvable
		Boolean solvable = linearEquation.isSolvable();
		
		// Solve the equation if it is solvable, if not tell the user
		if(solvable){
			double x = linearEquation.getX();
			double y = linearEquation.getY();
			System.out.println("x is: " + x + ", and y is: " + y + ".");
		}
		else{
			System.out.println("The equation has no solution");
		}
	}

}
