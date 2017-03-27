package lab8;

import java.util.Date;

abstract class GeometricObject {
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