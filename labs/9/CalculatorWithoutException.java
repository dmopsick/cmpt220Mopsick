public class CalculatorWithoutException {

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
		
		for(int i = 0; i < args[0].length(); i ++){
			char numChar = args[0].charAt(i);
			if(!Character.isDigit(numChar)){
				System.out.println("Error: incorrect input.\n" + numChar + " is not an integer.");
				System.exit(0);
			}
		}
		
		for(int i = 0; i < args[2].length(); i ++){
			char numChar = args[2].charAt(i);
			if(!Character.isDigit(numChar)){
				System.out.println("Error: incorrect input.\n" + numChar + " is not an integer.");
				System.exit(0);
			}
		}
		
		num1 = Integer.parseInt(args[0]);
		num2 = Integer.parseInt(args[2]);
		
		
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
