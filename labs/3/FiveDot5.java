//By Dan Mopsick
//CMPT 220L_112
public class FiveDot5 {

	public static final double CONVERSION_RATIO = 2.2;
	
	public static void main(String[] args) {
		// Initialize variables
		double kilogram = 1;
		double pound = 20;
		
		// Print the table heading
		System.out.println("Kilograms   Pounds    |    Pounds    Kilograms");
		// For loop to print the table
		for(int x = 0; x < 100; x ++){
			if(kilogram < 10){
				System.out.printf((int)kilogram + "%17.1f    |    " + (int)pound + "%16.2f", kilogram * CONVERSION_RATIO, pound / CONVERSION_RATIO);
			}
			else if(kilogram < 100){
				System.out.printf((int)kilogram + "%16.1f    |    " + (int)pound + "%16.2f", kilogram * CONVERSION_RATIO, pound / CONVERSION_RATIO);
			}
			else{
				System.out.printf((int)kilogram + "%15.1f    |    " + (int)pound + "%16.2f", kilogram * CONVERSION_RATIO, pound / CONVERSION_RATIO);
			}
			System.out.println();
			kilogram += 2;
			pound += 5;
		}
	}

}
