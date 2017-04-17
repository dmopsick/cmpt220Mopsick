import java.util.ArrayList;
import java.util.Scanner;

public class ElevenDot13 {
	public static void main(String[] args){
		// Initialize scanner
		Scanner scanner = new Scanner(System.in);
		
		// Prompt the user to enter 10 integers
		System.out.println("Enter 10 integers");
		
		// Parse user input
		int int1 = scanner.nextInt();
		int int2 = scanner.nextInt();
		int int3 = scanner.nextInt();
		int int4 = scanner.nextInt();
		int int5 = scanner.nextInt();
		int int6 = scanner.nextInt();
		int int7 = scanner.nextInt();
		int int8 = scanner.nextInt();
		int int9 = scanner.nextInt();
		int int10 = scanner.nextInt();
		
		// Save user input to an array list
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(int1);
		intList.add(int2);
		intList.add(int3);
		intList.add(int4);
		intList.add(int5);
		intList.add(int6);
		intList.add(int7);
		intList.add(int8);
		intList.add(int9);
		intList.add(int10);
		
		// Remove duplicates
		removeDuplicate(intList);
		
		// Display results to the user
		for(int i = 0; i < intList.size(); i++){
			System.out.print(intList.get(i) + " ");
		}
	}
	
	public static void removeDuplicate(ArrayList<Integer> list){
		int testIndex = 0;
		while(testIndex < list.size()){
			int lastIndex = list.lastIndexOf(list.get(testIndex));
			if(lastIndex != testIndex){
				list.remove(lastIndex);
			}
			else{
				testIndex ++;
			}
		}
	}
}
