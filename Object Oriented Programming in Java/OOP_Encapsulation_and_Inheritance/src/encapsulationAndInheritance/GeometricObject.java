package encapsulationAndInheritance;

class GeometricObject {

	private String color = "white";
	private boolean filled;
	java.util.Date dateCreated;
	
	public GeometricObject(){
		dateCreated = new java.util.Date();
	}
	
	public GeometricObject(String color , boolean filled){
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
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
	
	public java.util.Date getDate(){
		return dateCreated;
	}
	
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color +
				 " and filled: " + filled; 
	}
		
}

class Circle extends GeometricObject{
	
	private double radius;
	
	Circle(){
	}
	
	Circle(double radius){
		this.radius = radius;
	}
	
	Circle(double radius, String color, boolean filled){
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
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public double getPrimeter() {
		return 2 * radius * Math.PI;
	}
	
	public double getDiameter() {
		return 2 * radius;
	}
	
//	public void printCircle() {
//		System.out.println("The circle is created " + getDate() +
//				 " and the radius is " + radius);
//	}
	
	public String toString() {
		return super.toString() + "\nradius is " + radius;
	}
		
}

class Rectangle extends GeometricObject{
	
	private double width;
	private double height;
	
	Rectangle(){
	}
	
	Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	Rectangle(double width, double height, String color, boolean filled){
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPrimeter() {
		return 2*(width + height);
	}
}


