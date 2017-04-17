
public class ThirteenDot5 {

    public static void main(String[] args) {
        // Create two sample circles
        Circle circle1 = new Circle(2, "Blue", true);
        Circle circle2 = new Circle(8, "Red", false);

        // Compare the two circles
        System.out.println(GeometricObject.max(circle1, circle2));
        System.out.println();
        
        // Create two sample rectangles
        Rectangle rectangle1 = new Rectangle(4, 8, "Green", false);
        Rectangle rectangle2 = new Rectangle(2, 4, "Yellow", true);
        
        
        // Compare the sample rectangles
        System.out.println(GeometricObject.max(rectangle1, rectangle2));
    }

}
