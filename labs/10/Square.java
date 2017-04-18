public class Square extends GeometricObject implements Colorable {
    private double width;
        
    public Square(String color, Boolean filled){
        setColor(color);
        setFilled(filled);
    }
    
    public Square(Double width, String color, Boolean filled){
        this.width = width;
        setColor(color);
        setFilled(filled);
    }
    
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    double getArea() {
        return width * width;
    }

    @Override
    double getPerimeter() {
        return 4 * width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

}
