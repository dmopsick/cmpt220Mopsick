
public class TestCircle2D {
    
    public static void main(String[] args){
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println("Circle 1 area: " + c1.getArea());   
        System.out.println("Circle 1 perimeter: " + c1.getPerimeter());
        System.out.println("It is: " + c1.contains(3, 3) + " that circle one contains the point (3,3)" );
        
        Circle2D c2 = new Circle2D(4, 5, 10.5);
        System.out.println("It is: " + c1.contains(c2) + " that circle one contains the circle with a radius of " + c2.getRadius() +
                ", and a center at (" + c2.getX() + ", " + c2.getY() + ").");
        
        Circle2D c3 = new Circle2D(3, 5, 2.3);
        System.out.println("It is: " + c1.overlaps(c3) + " that circle one overlaps the circle with a radius of " + c3.getRadius() +
                ", and a center at (" + c3.getX() + ", " + c3.getY() + ").");
    }
    
}
