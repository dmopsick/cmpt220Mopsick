public class Triangle extends GeometricObject{
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle(String color, boolean filled){
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
		this.setColor(color);
		this.setFilled(filled);
	}
	
	public Triangle(double side1, double side2, double side3, String color, boolean filled){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.setColor(color);
		this.setFilled(filled);
	}
	
	/** Uses Heron's Formula to calculate Triangle area based on the
	 * three side lengths */
	public double getArea(){
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	
	/** Returns the perimeter of the triangle */
	public double getPerimeter(){
		return side1 + side2 + side3;
	}
	
	/** Prints out a string description of the triangle */
	public String toString(){
		return "Triangle: side1 = " + side1 + " side2 = " + side2 
				+ " side2 = " + side3;
	}
}