import java.math.BigInteger;
import java.util.ArrayList;

public class ThirteenDot3 {

    public static void main(String[] args) {
        ArrayList<Number> sampleList = new ArrayList<>();
        
        sampleList.add(new BigInteger("1000"));
        sampleList.add(10);
        sampleList.add(1.5);
        sampleList.add(new BigInteger("6"));
        sampleList.add(15.5);
        sampleList.add(10);
        sampleList.add(0.1);
        
        System.out.println("Unsorted list: " + sampleList.toString());
        
        sort(sampleList);
        
        System.out.println("Sorted list: " + sampleList.toString());

    }
    
    public static void sort(ArrayList<Number> list){
        for(int i = 0; i < list.size(); i ++){
            for(int j = 0; j < list.size(); j ++){
                if(list.get(i).doubleValue() < list.get(j).doubleValue()){
                    Number temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
}
