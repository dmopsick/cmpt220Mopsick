import java.util.Scanner;

public class Exercise2dot1{
	public static void main(String[] args){
		//Initialize scanner
		Scanner scanner = new Scanner(System.in);
		
		//Take Celsius value from user
		double celsius = scanner.nextDouble();
		
		//Convert Celsius value to Fahrenheit
		double farenheit = (celsius * 9 / 5) + 32;
		
		//Return value to the user
		System.out.println(celsius + " Celsius is " + farenheit + " Fahrenheit");
	}
}