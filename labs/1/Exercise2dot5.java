import java.util.Scanner;

public class Exercise2dot5 {
	public static void main(String[] args){
		//Initialize scanner
		Scanner scanner = new Scanner(System.in);
		
		//Prompt the user
		System.out.println("Enter the subtotal and a gratuity rate (percentage).");
		
		//Take the subtotal and gratuity rate from the user
		double subtotal = scanner.nextDouble();
		double gratuityRate = scanner.nextDouble();
		
		//Convert gratuity rate to decimal
		double gratuityDecimal = gratuityRate / 100; 
				
		//Calculate tip
		double tip = subtotal * gratuityDecimal;
		
		//Calculate total
		double total = subtotal + tip;
		
		//Return tip and total to user
		System.out.println("The gratuity is $" + tip + " and total is $" + total);
	}
}
