
public class Circle extends GeometricObject{
    private double radius;
    
    public Circle(String color, Boolean filled){
        setColor(color);
        setFilled(filled);
        radius = 1;
    }
    
    public Circle(double radius, String color, Boolean filled){
        setColor(color);
        setFilled(filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
