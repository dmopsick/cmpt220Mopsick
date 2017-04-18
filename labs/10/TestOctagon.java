public class TestOctagon {

	public static void main(String[] args) {
		Octagon octagon = new Octagon(5, "Blue", false);
		System.out.println("Octagon area: " + octagon.getArea());
		System.out.println("Octagon perimeter " + octagon.getPerimeter());
		
		Octagon octagonClone = octagon.clone();
		
		System.out.println("Comparison of the two ocatgons: " + octagon.compareTo(octagonClone));
	}

}
