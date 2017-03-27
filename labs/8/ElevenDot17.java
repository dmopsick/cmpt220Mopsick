package lab8;

import java.util.ArrayList;
import java.util.Scanner;

public class ElevenDot17 {

	public static void main(String[] args) {
		// Initialize scanner
		Scanner scanner = new Scanner(System.in);
		
		// Prompt the user to enter an integer
		System.out.print("Enter an integer m: ");
		
		// Parse user input
		int m = scanner.nextInt();
		
		// Find the smallest number n for which m is the perfect square
		int n = smallestPerfectSquare(m);
		
		// Display results
		System.out.println("The smallest number n for m * n to be a perfect square is " + n);
		System.out.println("m * n is " + (m * n));
		
	}

	private static int smallestPerfectSquare(int m) {
		ArrayList<Integer> factors = new ArrayList<>();
		
		// Find all of the factors of m
		int testFactor = 2;
		while(m > 1){
			if(m % testFactor == 0){
				if(factors.contains(testFactor)){
					int index = factors.indexOf(testFactor);
					factors.remove(index);
				}
				else{
					factors.add(testFactor);
				}
				
				m = m / testFactor;
			}
			else{
				testFactor ++;
			}
		}
		
		int n = 1;
		for(int i = 0; i < factors.size(); i ++){
			n = n * factors.get(i);
		}
		
		return n;
	}

}
