public class Rectangle extends GeometricObject {
    private double width;
    private double height;
    
    public Rectangle(String color, Boolean filled){
        setColor(color);
        setFilled(filled);
        width = 1;
        height = 1;
    }
    
    public Rectangle(double width, double height, String color, Boolean filled){
        setColor(color);
        setFilled(filled);
        this.width = width;
        this.height = height;
    }
    
    public double getArea(){
        return width * height;
    }
    
    public double getPerimeter(){
        return 2 * width + 2 * height;
    }
    
    public double getWidth(){
        return width;
    }
    
    public double getHeight(){
        return height;
    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }
}