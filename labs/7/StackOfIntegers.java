
public class StackOfIntegers {
    private int[] elements;
    private int size;
    
    public StackOfIntegers(){
        elements = new int[16];
    }
    
    /** Creates a stack of integers with a specified capacity */
    public StackOfIntegers(int capacity){
        elements = new int[capacity];
    }
    
    /** Returns true if the stack is empty */
    public boolean empty(){
        if(size == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    /** Returns the integer at the top of the stack without removing it from the stack */
    public int peak(){
        if(!empty()){
            return elements[size];
        }
        else{
            return -1;
        }
       
    }
    
    /** Store an integer at the top of the stack */
    public void push(int value){
        if(size == elements.length){
            int[] temp = elements.clone();
            elements = new int[temp.length * 2];
            for(int i = 0; i < temp.length; i ++){
                elements[i] = temp[i];
            }
        }
        
        elements[size++] = value;
    }
    
    /** Removes the integer at the top of the stack and returns it */
    public int pop(){
        if(!empty()){
            return elements[-- size];
        }
        else{
            return -1;
        }
    }
    
    /** Returns the size of the stack */
    public int getSize(){
        return size;
    }
}
