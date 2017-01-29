package lab3;

//By Dan Mopsick
//CMPT 220_112
public class SixDot1 {

	public static void main(String[] args) {
		int num;
		for(int n = 1; n < 100; n++){
			num = getPentagonalNumber(n);
			System.out.print(num + " ");
			if(n % 10 == 0){
				System.out.println();
			}
		}
	}

	// Create method that returns a pentagonal number
	public static int getPentagonalNumber(int n){
		return n * (3 * n - 1) / 2;
	}
}
