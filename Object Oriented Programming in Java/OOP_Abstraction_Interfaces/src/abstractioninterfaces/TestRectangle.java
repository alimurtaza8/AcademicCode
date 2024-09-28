package abstractioninterfaces;

import java.util.*;

class GeometricObject{
	private String color;
	private boolean filled;
    private Date dateCreated;	
    
	GeometricObject(){
		this.color = "white";
		this.filled = false;
	    this.dateCreated = new Date();
	}
	GeometricObject(String color,boolean filled){
		this.color = color;
		this.filled = filled;
	    this.dateCreated = new Date();
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
	public Date getDate() {
		return dateCreated;
	}
}

class Rectangle2 extends GeometricObject{
	private double width;
	private double height;
	
	Rectangle2(){
		super();
		this.width = 2.0;
		this.height = 1.0;
	}
	Rectangle2(double width, double height){
		super();
		this.width = width;
		this.height = height;
	}
	Rectangle2(double width, double height,String color,boolean filled){
		super(color,filled);
		this.width = width;
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getArea() {
		return width * height;
	}
	public double getPerimeter() {
		return 2 * (width + height);
	}
	public String toString() {
		return "Rectangle width = " + width + " height = " + height;
	}
}

public class TestRectangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter width ");
		double width = sc.nextDouble();
		
		System.out.print("Enter height ");
		double height = sc.nextDouble();
		
		System.out.print("Enter color ");
		String color = sc.next();
		
		System.out.print("Enter filled ");
		boolean filled = sc.nextBoolean();
		
		Rectangle2 r1 = new Rectangle2(width,height,color,filled);
		System.out.println(r1.getArea());
		System.out.println(r1.getPerimeter());
		System.out.println(r1.getColor());
		System.out.println(r1.isFilled());


	}

}
