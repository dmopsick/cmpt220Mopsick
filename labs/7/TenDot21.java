import java.math.BigInteger;

public class TenDot21 {

    public static void main(String[] args) {
        // Create an array to hold the first ten values divisible by 5 or 6
        BigInteger[] firstTen = new BigInteger[10];

        // Create a counter to count the numbers added to the array
        int numInArray = 0;
        
        // Create a starting point for test values
        BigInteger testValue = BigInteger.valueOf(Long.MAX_VALUE);
        
        // Create a loop to fill the array
        while(numInArray < 10){
            if((testValue.mod(BigInteger.valueOf(5)) == BigInteger.ZERO) || (testValue.mod(BigInteger.valueOf(6)) == BigInteger.ZERO)){
                firstTen[numInArray] = testValue;
                numInArray++;
            }
            testValue = testValue.add(BigInteger.ONE);
        }
        
        // Display results to the user
        System.out.println("The first 10 numbers bigger than Long.MAX_VALUE that are divisible by 5 or 6 are:");
        for(int i = 0; i < firstTen.length; i++){
            System.out.println(firstTen[i]);
        }
    }

}
