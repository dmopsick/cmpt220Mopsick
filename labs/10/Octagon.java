public class Octagon extends GeometricObject implements Comparable, Cloneable{
	private double side;
	
	public Octagon(String color, boolean filled){
		setColor(color);
		setFilled(filled);
	}
	
	public Octagon(double side, String color, boolean filled){
		this.side = side;
		setColor(color);
		setFilled(filled);
	}
	
	@Override
	public int compareTo(Object octagon) {
		if(octagon instanceof Octagon){
			if(((Octagon) octagon).getArea() > this.getArea()){
				// Negative if this object is smaller
				return -1;
			}
			else if(this.getArea() >((Octagon) octagon).getArea()){
				// Positive if this object is bigger
				return 1;
			}
			else{
				// 0 if the obejcts are the same area
				return 0;
			}
		
		}
		else{
			// The second object passed is not a circle
			return -2;
		}
	}

	@Override
	public double getArea() {
		return ((2 + 4 / Math.sqrt(2)) * side * side);
	}

	@Override
	public double getPerimeter() {
		return 8 * side;
	}

	public double getSide() {
		return side;
	}

	public void setSize(double side) {
		this.side = side;
	}
	
	public Octagon clone(){
		return new Octagon(getSide(), getColor(), isFilled());
	}
}
