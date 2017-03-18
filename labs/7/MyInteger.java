
/**
 * @author Dan Mopsick
 *
 */
public class MyInteger {
   private int value;
   
   public MyInteger(int value){
       this.value = value;
   }
   
   /** Returns the value variable */
   public int getValue(){
       return value;
   }
   
   /** Determines if the value of this object is even*/
   public boolean isEven(){
       if(value % 2 == 0){
           return true;
       }
       else{
           return false;
       }
   }
   
   /** Determines if the value of this object is odd */
   public boolean isOdd(){
       if(value % 2 == 1){
           return true;
       }
       else{
           return false;
       }
   }   
   
   /** Determines if the value of this object is prime */
   public boolean isPrime(){
       int testInt = 2;
       while(value > testInt){
           if(value % testInt == 0){
               return false;
           }
           testInt ++;
       }
       return true;
   }
   
   /** Determines if the given value is even */
   public static boolean isEven(int value){
       if(value % 2 == 0){
           return true;
       }
       else{
           return false;
       }
   }
   
   /** Determines if the given value is odd */
   public static boolean isOdd(int value){
       if(value % 2 == 1){
           return true;
       }
       else{
           return false;
       }
   }   
   
   /** Determines if the given value is prime */
   public static boolean isPrime(int value){
       int testInt = 2;
       while(value > testInt){
           if(value % testInt == 0){
               return false;
           }
           testInt ++;
       }
       return true;
   }
   
   /** Determines if the value of the passed myInteger object is even */
   public static boolean isEven(MyInteger myInt){
       if(myInt.getValue() % 2 == 0){
           return true;
       }
       else{
           return false;
       }
   }
   
   /** Determines if the value of the passed myInteger object is odd */
   public static boolean isOdd(MyInteger myInt){
       if(myInt.getValue() % 2 == 1){
           return true;
       }
       else{
           return false;
       }
   }   
   
   /** Determines if the value of the passed myInteger object is prime */
   public static boolean isPrime(MyInteger myInt){
       int testInt = 2;
       while(myInt.getValue() > testInt){
           if(myInt.getValue() % testInt == 0){
               return false;
           }
           testInt ++;
       }
       return true;
   }
   
   /** Determine if the value of this object equals the given integer */
   public boolean equals(int myInt){
       if(myInt == value){
           return true;
       }
       else{
           return false;
       }
   }
   
   /**  Determine if the value of this object equals the value of the given myInteger object */
   public boolean equals(MyInteger myInt){
       if(myInt.getValue() == value){
           return true;
       }
       else{
           return false;
       }
   }
   
   /** Parse an array of numeric characters as an integer */
   public static int parseInt(char[] charArray){
       // Create a string to hold the numeric characters
       String numString = "";
       
       // Fill the string with the character array
       for(int i = 0; i < charArray.length; i ++){
          numString += charArray[i];
       }
       
       // Parse the string as an integers
       return parseInt(numString);
   }
   
   /** Parse a string as an integer */
   public static int parseInt(String numString){
       return Integer.parseInt(numString);
   }
}
