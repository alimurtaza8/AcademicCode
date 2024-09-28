package abstractioninterfaces;

//abstract class Animal{
//	
//	protected abstract void walk(); 
//	protected abstract void sound();
//}
//
//class Dog extends Animal{
//	
//	public void walk() {
//		System.out.println("Dog walks");	
//	}
//	
//	public void sound() {
//		System.out.println("Dog sound");
//	}
//}
//
//class Cat extends Animal{
//	
//	public void walk() {
//		System.out.println("Cat walks");	
//	}
//	
//	public void sound() {
//		System.out.println("Cat sound");
//	}
//}

abstract class Object2D{
	protected String color = "white";
	protected boolean isFilled;
	
//	Object2D(){
//	}
	
	abstract void area();
	abstract void changeColor(String color);
}

class Rectangle extends Object2D{
	private double width;
	private double height;
	
	Rectangle(){
	}
	
	Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	void area() {
		System.out.println("area is " + this.width * this.height);
	}
	

	
	void changeColor(String newColor) {
		System.out.println("The Rectangle color is " + newColor);
	}
}

class Circle extends Object2D{
	protected double radius;
	
////	Circle(){
////	}
	
	Circle(double radius){
		this.radius = radius;
	}
	
	void area() {
		System.out.println("Radius is " + this.radius * this.radius * 3.14);
	}
	
	void changeColor(String newColor) {
		System.out.println("The Color of Circle is " + newColor);
	}

}

public class Abstraction {

	public static void main(String[] args) {
		
//		Object2D o = new Object2D(); // Error
		
		Rectangle r1 = new Rectangle();
//		Rectangle r = new Rectangle(10.0,20.0);
		
//		r.area();
		//System.out.println("The area is " + r.area());
//		System.out.println(r.color);
//		System.out.println(r.isFilled);
//		r.changeColor("orange");
		//System.out.println(r.changeColor("Red"));
//		r.color = "Blue";
//		System.out.println(r.color);
////		System.out.println(r.changeColor("Red"));
////		r.color = "black";
////		System.out.println(r.color);
//		r.isFilled = true;
//		System.out.println(r.isFilled);

//		Circle c = new Circle(10.0);
		
//		c.area();
		//System.out.println("The radius is " + c.area());
//		c.changeColor("Dark Blue");
//		c.color = "gray";
//		System.out.println("The color is " + c.color );
		
		
		
		
		
//		Dog d = new Dog();
//		Cat c = new Cat();
//		
//		d.walk();
//		d.sound();
//		c.walk();
//		c.sound();

	}

}
