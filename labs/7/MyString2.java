
public class MyString2 {
    private String s;
    
    public MyString2(String s){
        this.s = s;
    }
    
    public String getS(){
        return s;
    }
    
    /** Negative result if this.s precedes s. 0 if they are the same, positive if this.s follows s*/
    public int compare(String s){
        if(this.s.length() > s.length()){
            for(int i = 0; i < s.length(); i ++){
                if(s.charAt(i) != this.s.charAt(i)){
                    return this.s.charAt(i) - s.charAt(i); 
                }
            }
            return this.s.length() - s.length();
           
        }
        else{
            for(int i = 0; i < this.s.length(); i ++){
                if(s.charAt(i) != this.s.charAt(i)){
                    return this.s.charAt(i) - s.charAt(i); 
                }
            }
            return this.s.length() - s.length();
        }
    }
    
    
    /** Returns the sub string beginning at a specified index */
    public MyString2 substring(int begin){
        // Initialize an array of letters in s
        char[] charArray = toChars();
        
        // Create string to hold substring
        String subString = "";
        
        // Fill in sub string
        for(int i = begin; i < charArray.length; i++){
            subString += charArray[i];
        }
        
        // Create a new myString 2 object
        MyString2 sub = new MyString2(subString);
        
        return sub;
    }
    
    /** Not sure how to manually convert to upper case */
    public MyString2 toUpperCase(){
        String upperCaseS = s.toUpperCase();
        return new MyString2(upperCaseS);
    }
    
    /** Converts the string to a an array */
    public char[] toChars(){
     // Initialize an array of the string
        char[] charArray = new char[s.length()];
        
        // Fill that array
        for(int i = 0; i < charArray.length; i++){
            charArray[i] =  s.charAt(i);
        }
        
        return charArray;
    }
    
    /** Returns the string representation of the boolean argument */
    public static MyString2 valueOf(boolean b){
        String argument = "" + b;
        return new MyString2(argument);
    }
}
