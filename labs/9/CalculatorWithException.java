public class CalculatorWithException {

	public static void main(String[] args) {
		// Check the number of strings passed
		if(args.length != 3){
			System.out.println(
					"Usage: java Calculator operand1 operator operand 2");
			System.exit(0);
		}
		
		// The result of the operation
		int result = 0;
		
		// Parse integers to be used in operations
		int num1 = 1;
		int num2 = 1;
		try{
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[2]);
		}
		catch(NumberFormatException ex){
			System.out.println("Wrong input: " + ex.getMessage());
			System.exit(0);
		}
		
		// Determine the operator
		switch(args[1].charAt(0)){
			case '+': result = num1 + num2;
					  break;
			case '-': result = num1 - num2;
					  break;
			case '.': result = num1 * num2;
			          break;
			case '/': result = num1 / num2;
					  break;
		}
		
		// Display result
		System.out.println(num1 + " " + args[1] + " " + num2 + " = " + result);

	}

}
