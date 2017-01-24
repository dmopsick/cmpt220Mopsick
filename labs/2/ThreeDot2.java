package lab2;
import java.util.Scanner;

//Dan Mopsick
//CMPT 220L_112
public class ThreeDot2 {
	public static void main(String[] args){
		//Initialize scanner
		Scanner scanner = new Scanner(System.in);
		
		//Generate three random numbers using same method from Listing 3.1
		int num1 = (int)(System.currentTimeMillis() % 10);
		int num2 = (int)(System.currentTimeMillis() / 7 % 10);
		int num3 = (int)(System.currentTimeMillis() / 9 % 10);
		
		//Display the problem to the user
		System.out.println("What is the sum of " + num1 + " + " + num2 + " + " + num3 + "?");
		
		//Parse input from the user
		int userSum = scanner.nextInt();
		
		//Display problem to the user and whether they are correct
		System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + userSum + " is " + (num1 + num2 + num3 == userSum) + ".");
	}
}
