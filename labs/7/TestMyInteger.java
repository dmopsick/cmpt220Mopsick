
public class TestMyInteger {
    public static void main(String[] args){
        MyInteger myInt = new MyInteger(6);
        System.out.println("The value of my int is : " + myInt.getValue());
        System.out.println("It is " + myInt.isEven() + " that my int is even.");
        System.out.println("It is " + myInt.isOdd() + " that my int is odd.");
        System.out.println("It is " + myInt.isPrime() + " that my int is prime.");
        
        System.out.println();
        int testInt = 7;
        System.out.println("It is " + MyInteger.isEven(testInt) + " that " + testInt + " is even.");
        System.out.println("It is " + MyInteger.isOdd(testInt) + " that " + testInt  + " is odd.");
        System.out.println("It is " + MyInteger.isPrime(testInt) + " that " + testInt + " is prime.");
        
        System.out.println();
        
        MyInteger myInt2 = new MyInteger(15);
        System.out.println("It is " + MyInteger.isEven(myInt2) + " that " + myInt.getValue()  + " is even.");
        System.out.println("It is " + MyInteger.isOdd(myInt2) + " that " + myInt.getValue()  + " is odd.");
        System.out.println("It is " + MyInteger.isPrime(myInt2) + " that " + myInt.getValue()  + " is prime.");
        
        System.out.println();
        
        System.out.println("It is " + myInt.equals(testInt) + " that " + myInt.getValue() + " equals " + testInt);
        System.out.println("It is " + myInt.equals(myInt2) + " that " + myInt.getValue() + " equals " + myInt2.getValue());
        
        System.out.println();
        
        char[] charArray =  new char[] {'1', '5', '0'};
        System.out.println(MyInteger.parseInt(charArray));
        
        String numString = "679";
        System.out.println(MyInteger.parseInt(numString));
    }
}
