import java.util.Scanner;

public class TwelveDot3 {
	public static void main(String[] args){
		// Initialize Array
		int[] numArray = new int[100];
		
		// Populate array with random numbers
		for(int i = 0; i < numArray.length; i++){
			numArray[i] = (int)(Math.random() * 100);
		}
		
		// Initialize scanner
		Scanner scanner = new Scanner(System.in);
		
		// Prompt the user to enter an index
		System.out.println("Enter an index 0-99 to view a number.\nEnter -1 to quit.");
		
		int index = scanner.nextInt();
		
		while(index != -1){
			try{
				System.out.println(numArray[index]);
			}catch(ArrayIndexOutOfBoundsException ex){
				System.out.println("Error: invalid index. Enter a integer from 0-99");
			}
			index = scanner.nextInt();
		}
		
		System.out.println("Farewell!");
		System.exit(0);
	}
}
