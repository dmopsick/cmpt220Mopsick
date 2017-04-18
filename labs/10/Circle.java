public class Circle extends GeometricObject implements Comparable{
	private double radius;
	
	public Circle(String color, boolean filled){
		setColor(color);
		setFilled(filled);
		radius = 1;
	}
	
	public Circle(double radius, String color, boolean filled){
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea(){
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double getPerimeter(){
		return 2 * Math.PI * radius;
	}
	
	public void printCircle(){
		System.out.println("The circle is created "  + this.getDateCreated()
				+ " and the radius is " + radius);
	}

	@Override
	public boolean equals(Object circle){
		if(circle instanceof Circle){
			if(this.radius == ((Circle) circle).getRadius()){
				return true;
			}
			return false;
		}
		else{
			return false;
		}
	}
	
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}