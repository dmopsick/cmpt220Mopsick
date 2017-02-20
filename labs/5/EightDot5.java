import java.util.Arrays;
import java.util.Scanner;

// Dan Mopsick
// CMPT 220L_112
public class EightDot5 {

	public static void main(String[] args) {
		// Initialize scanner
		Scanner scanner = new Scanner(System.in);
		
		// Prompt the user to enter matrix 1
		System.out.println("Enter the first 3 by 3 matrix.");
		
		// Initialize matrix 1
		double[][] matrix1 = new double[3][3];
		
		// Parse user input for matrix 1
		for(int i = 0; i < matrix1.length; i++){
			for(int j = 0; j < matrix1[i].length; j++){
				matrix1[i][j] = scanner.nextDouble();
			}
		}
		
		// Prompt the user to enter matrix 2
		System.out.println("Enter the second 3 by 3 matrix.");
		
		// Initialize matrix 2
		double[][] matrix2 = new double[3][3];
		
		// Parse user input for matrix 2
		for(int i = 0; i < matrix1.length; i++){
			for(int j = 0; j < matrix2[i].length; j++){
				matrix2[i][j] = scanner.nextDouble();
			}
		}
		
		// Add the matrices together
		double[][] sum = addMatrix(matrix1, matrix2);
		
		
		// Display results to the user
		System.out.println("The matrices are added as follows.");
		for(int i = 0; i < matrix1.length; i ++ ){
			for(int j = 0; j < 3; j ++){
				System.out.print(matrix1[i][j] + "  ");
			}
			
			if(i == 1){
				System.out.print("+  ");
			}
			else{
				System.out.print("   ");
			}
			
			for(int j = 0; j < 3; j ++){
				System.out.print(matrix2[i][j] + "  ");
			}
			
			if(i == 1){
				System.out.print("=  ");
			}
			else{
				System.out.print("   ");
			}
			
			for(int j = 0; j < 3; j ++){
				System.out.print(sum[i][j] + "  ");
			}
			System.out.println();
		}
	}
	
	public static double[][] addMatrix(double[][] matrixA, double[][] matrixB){
		double[][] sum = new double[3][3];
		
		for(int i = 0; i < sum.length; i ++){
			for(int j = 0; j < sum.length; j++){
				sum[i][j] = matrixA[i][j] + matrixB[i][j];
			}
		}
		
		return sum;
	}
}
