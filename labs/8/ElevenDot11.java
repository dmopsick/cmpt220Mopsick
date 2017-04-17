import java.util.ArrayList;
import java.util.Scanner;

public class ElevenDot11 {

	public static void main(String[] args) {
		// Initialize scanner
		Scanner scanner = new Scanner(System.in);
		
		// Prompt user to enter five integers
		System.out.println("Enter five integers");
		
		// Parse user input
		int int1 = scanner.nextInt();
		int int2 = scanner.nextInt();
		int int3 = scanner.nextInt();
		int int4 = scanner.nextInt();
		int int5 = scanner.nextInt();
		
		// Store values in an array list
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(int1);
		intList.add(int2);
		intList.add(int3);
		intList.add(int4);
		intList.add(int5);
		
		// Sort the array list
		sort(intList);
		
		// Display results to the user
		for(int i = 0; i < intList.size(); i++){
			System.out.print(intList.get(i) + " ");
		}

	}

	public static void sort(ArrayList<Integer> list){
		for(int i = 0; i < list.size(); i ++){
			for(int j = i + 1; j < list.size(); j++){
				if(list.get(i) > list.get(j)){
					int tempValue = list.get(i);
					list.set(i, list.get(j));
					list.set(j, tempValue);
				}
			}
		}
	}
	
}
