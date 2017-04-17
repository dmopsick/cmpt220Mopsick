import java.util.Date;

abstract class GeometricObject implements Comparable {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;
    
    /** Construct a default Geometric Object */
    public GeometricObject(){
        dateCreated = new Date();
    }
    
    /** Create a Geometric object with color and filled value */
    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    
    /** 13.5 Defining a static max method */
    public static String max(GeometricObject object1, GeometricObject object2){
        if(object1.getArea() > object2.getArea()){
            return "The first object passed, with an area of " + object1.getArea() + ", is the larger of the two objects.";
        }
        else if(object1.getArea() < object2.getArea()){
            return "The second object passed, with an area of " + object2.getArea() + ", is the larger of the two objects.";
        }
        else{
            return "The objects are the same size";
        }
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    // Overwriting a method from the parent class (object)
    @Override
    public String toString(){
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }
    
    abstract double getArea();
    
    abstract double getPerimeter();
}