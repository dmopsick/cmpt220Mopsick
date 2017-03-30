public class TwelveDot7 {

	public static void main(String[] args){
		int num1 = bin2Dec("0110");
		System.out.println(num1);
	}
	
	public static int bin2Dec(String binaryString){
		try{
			return Integer.parseInt(binaryString, 2);
		}
		catch(NumberFormatException e){
			System.out.println("Error: String is not a binary number. " + e.getMessage());
		}
		return -1;
	
	}
}
