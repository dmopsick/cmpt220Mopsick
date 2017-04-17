import java.util.Scanner;

public class TestTriangle {
	public static void main(String[] args){
		// Initialize scanner
		Scanner scanner = new Scanner(System.in);
		
		// Prompt user to enter three sides
		System.out.println("Enter the lengths of the three sides of the triangle");
		
		// Parse user input
		double side1 = scanner.nextDouble();
		double side2 = scanner.nextDouble();
		double side3 = scanner.nextDouble();
		
		// Prompt user to enter color
		System.out.println("Enter the color of the triangle");
		
		// Parse user input
		String color = scanner.next();
		
		// Prompt user to enter whether or not the triangle is filled
		System.out.println("Enter 0 if the triangle is empty. Enter 1 if filled.");
		
		// Parse user input
		String fillChoice = scanner.next();
		while((!fillChoice.equals("0")) && (!fillChoice.equals("1"))){
			System.out.println("Enter 0 if the triangle is empty. Enter 1 if filled.");
			
			fillChoice = scanner.next();
		}
		
		Boolean fill;
		if(fillChoice.equals("0")){
			fill = false;
		}
		else{
			fill = true;
		}
		
		// Create a triangle object
		Triangle triangle = new Triangle(side1, side2, side3, color, fill);
		
		// Display attributes of the triangle
		System.out.println(triangle.getArea());
		System.out.println(triangle.getPerimeter());
		System.out.println(triangle.getColor());
		System.out.println(triangle.isFilled());
	}
}
