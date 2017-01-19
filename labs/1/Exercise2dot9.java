import java.util.Scanner;

public class Exercise2dot9 {
	public static void main(String[] args){
		//Initialize scanner
		Scanner scanner = new Scanner(System.in);
		
		//Prompt the user
		System.out.println("Enter v0, v1, and t.");
		
		//Get v0 from the user
		double v0 = scanner.nextDouble();
		
		//Get v1 from the user
		double v1 = scanner.nextDouble();
		
		//Get t from the user
		double t = scanner.nextDouble();
		
		//Calculate acceleration
		double acceleration = (v1 - v0) / t;
		
		//Display acceleration to the user
		System.out.println("The average acceleration is " + acceleration + ".");
	}
}
