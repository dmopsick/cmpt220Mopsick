
public class ThirteenDot7 {

    public static void main(String[] args) {
        // Create an array of 5 Geometric Objects
        GeometricObject[] sampleArray = new GeometricObject[5];
        sampleArray[0] = new Circle("Red", false);
        sampleArray[1] = new Rectangle("Red", false);
        sampleArray[2] = new Square("Red", false);
        sampleArray[3] = new Triangle("Red", false);
        sampleArray[4] = new Square(6.0,"Red", false);

        // Display the area and how to color method where applicable
        for(int i = 0; i < sampleArray.length; i ++){
            System.out.println("Object " + i + " has an area of " + sampleArray[i].getArea());
            if(sampleArray[i] instanceof Colorable){
                Square square = (Square) sampleArray[i];
                square.howToColor();
            }
        }
    }

}
