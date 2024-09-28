package encapsulationAndInheritance;

public class TestCircleRectangle {

	public static void main(String[] args) {
	
//		Circle c1 = new Circle(1);
//		System.out.println("A circle " + c1.toString());
//		System.out.println("The color is " + c1.getColor());
//		System.out.println("The radius is " + c1.getRadius());
//		System.out.println("The area is " + c1.getArea());
//		System.out.println("The diameter is " + c1.getDiameter());
//		
//		Rectangle r1 = new Rectangle(2,4);
//		System.out.println("A Rectangle is " + r1.toString());
//		System.out.println("The area is " + r1.getArea());
//		System.out.println("The primeter is " + r1.getPrimeter());
		
		
		
		displayObject(new Circle(1, "red", false));
	    displayObject(new Rectangle(1, 1, "black", true));
		displayCircle(new Circle());
		
	}
	
	public static void displayObject(GeometricObject o) {
	    System.out.println("Created on " + o.getDate() + ". Color is " + o.getColor() + " " );
	}
	
	public static void displayCircle(Circle c) {
	    System.out.println("Created on " + c.getArea() + ". Color is " + c.getColor() + " " );
	}

}
