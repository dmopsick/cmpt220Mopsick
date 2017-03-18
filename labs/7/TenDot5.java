import java.util.Scanner;

/** 
 * @author Dan Mopsick
 * */
public class TenDot5 {

    public static void main(String[] args) {
        // Initialize scanner
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a positive integer
        System.out.println("Enter a positive integer.");
        
        // Parse the user input
        int userInt = scanner.nextInt();
        
        // Find smalllest factors
        StackOfIntegers stack = findSmallestFactors(userInt);
        
        // Display results to the user
        System.out.println("The smallest factors of " + userInt + " are the following:");
        
        while(!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
    }

    private static StackOfIntegers findSmallestFactors(int userInt) {
        // Create a stack to hold the factors
        StackOfIntegers returnStack = new StackOfIntegers();
        
        // Create an int to test factors
        int testInt = 2;
        
        while(userInt != 1){
            if(userInt % testInt == 0){
                returnStack.push(testInt);
                userInt = userInt / testInt;
            }
            else{
                if(testInt == 2){
                    testInt ++;
                }
                else{
                    // Increment by 2 to check odd numbers, don't need to check evens after 2
                    testInt += 2;
                }
            }
        }
        return returnStack;
    }

}
