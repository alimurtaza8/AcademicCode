package encapsulationAndInheritance;

public class TestPoly {

	public static void main(String[] args) {
		
		Circle c = new Circle(12,"red",true);
		Rectangle r = new Rectangle(2,3,"Blue",true);
		displayObject(c);
		
		Object o = new GeometricObject();
		System.out.println(o.toString());
	}

	public static void displayObject(GeometricObject object) {
		System.out.println("Created on " + object.getDate() +
		". Color is " + object.getColor());
	 }
}
