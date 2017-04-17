public class IllegalTriangleException extends Exception {

	private double side1;
	private double side2;
	private double side3;
	
	public IllegalTriangleException(double side1, double side2, double side3){
		super("The sum of any given two sides must be larger than the third side"
				+ "\nSide lengths: " + side1 + " " + side2 + " " + side3);
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
	
	
}
