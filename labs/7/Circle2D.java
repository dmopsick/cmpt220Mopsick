/**
 * 
 * @author Dan Mopsick
 *
 */
public class Circle2D {
    private double x;
    private double y;
    private double radius;

    public Circle2D() {
        x = 0;
        y = 0;
        radius = 1;
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    /** Returns the area of the circle */
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    /** Returns the perimeter of the circle */
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean contains(double x, double y) {
        // Find the difference in x value from point to center of the circle
        double dx = Math.abs(x - this.x);
        // Find the difference in y value from point to center of the circle
        double dy = Math.abs(y - this.y);

        // Determine if the point is inside the circle using pythagorean theorem
        boolean inside = ((Math.pow(dx, 2) + Math.pow(dy, 2)) <= Math.pow(radius, 2));

        // Return result
        return inside;
    }

    public boolean contains(Circle2D circle){
        double smallRadius = circle.getRadius();
        double difference = Math.abs(radius - smallRadius);
        double distanceBetweenCenters = distanceBetweenTwoPoints(x, y, circle.getX(), circle.getY());

        Boolean inside = ((smallRadius < radius) && (difference > distanceBetweenCenters));
        
        return inside;
    }

    private double distanceBetweenTwoPoints(double x1, double y1, double x2, double y2) {
       double distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
       return distance;
    }

    public boolean overlaps(Circle2D circle) {
        double smallRadius = circle.getRadius();
        double difference = Math.abs(radius - smallRadius);
        double distanceBetweenCenters = distanceBetweenTwoPoints(x, y, circle.getX(), circle.getY());

        Boolean overlaps = ((smallRadius < radius) && (difference < distanceBetweenCenters));
        
        return overlaps;
    }

}
