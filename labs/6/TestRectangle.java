// 9.1
public class TestRectangle {
	public static void main(String[] args){
		Rectangle rectangle1 = new Rectangle(4, 40);
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		
		System.out.println("Rectangle 1:");
		System.out.println("width: "  + rectangle1.getWidth());
		System.out.println("height: "  + rectangle1.getHeight());
		System.out.println("area: "  + rectangle1.getArea());
		System.out.println("perimeter: "  + rectangle1.getPerimeter());
		System.out.println();
		
		System.out.println("Rectangle 2:");
		System.out.println("width: "  + rectangle2.getWidth());
		System.out.println("height: "  + rectangle2.getHeight());
		System.out.println("area: "  + rectangle2.getArea());
		System.out.println("perimeter: "  + rectangle2.getPerimeter());
	}
}
