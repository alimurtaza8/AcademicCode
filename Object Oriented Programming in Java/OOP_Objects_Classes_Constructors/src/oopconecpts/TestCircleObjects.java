package oopconecpts;

//class Circle{
//	double radius;
//	
//	Circle(){
//		
//	}
//	
//	Circle(double newRadius){
//		radius = newRadius;
//	}
//	
//	double getArea() {
//		return radius * radius * Math.PI;
//	}
//	
//	double getPerimeter() {
//		return 2 * radius * Math.PI;
//	}
//	
//	void setRadius(double newRadius) {
//		radius = newRadius;
//	}
//}

//
//class Circle{
//	double radius;
//	static int noOfObjects;
//	
//	Circle(){
//		radius = 1;
//		noOfObjects++;
//	}
//	Circle(double newRadius){
//		radius = newRadius;
//		noOfObjects++;
//	}
//	static int getNoOfObjects(){
//		return noOfObjects;
//	}
//	double getArea() {
//		return radius * radius * Math.PI;
//	}
//}

//class CircleWithPrivateDataFields{
//	private double radius;
//	private static int noOfObjects;
//	
//	CircleWithPrivateDataFields(){
//		radius = 1;
//		noOfObjects++;
//	}
//	CircleWithPrivateDataFields(double newRadius){
//		radius = newRadius;
//		noOfObjects++;
//	}
//	double getRadius() {
//		return radius;
//	}
//	void setRadius(double newRadius) {
//		radius = (newRadius >= 0) ? newRadius : 0;
//	
//	}
//	static int getNoOfObjects() {
//		return noOfObjects;
//	}
//	double getArea() {
//		return radius * radius * Math.PI;
//	}
//}


//class Circle{
//	private double radius;
//	
//	Circle(double rad){
//		this.radius = rad;
//	}
//	
//	double getRadius() {
//		return radius;
//	}
//	void setRadius(double rad) {
//		this.radius = rad;
//	}
//	
//	double getArea() {
//		return radius * radius * Math.PI;
//	}
//}

//class Count {
//	public int count;
//	
//	public Count(int c) {
//		count = c;
//	}
//	public Count() {
//		count = 1;
//	}
//}

//class Circle {
//	double radius;
//	
//	Circle(double newRadius) {
//		radius = newRadius;	
//	}
//	
//}

//class T {
//	int e1 = 1;
//	int e2 = 2;
//}

//class T {
//	static int i = 0;
//	int j = 0;
//	
//	T() {
//	i++;
//	j = 1;
//}

public class TestCircleObjects {

//	public static void printAreas(Circle c, int times) {
//			System.out.println("Radius \t\tArea");
//			while (times >= 1) {
//				System.out.println(c.getRadius() + "\t\t" + c.getArea());
//				c.setRadius(c.getRadius() + 1);
//				times--;
//			}
//	}
	
//	public static void increment(Count c, int times) {
//		c.count++;
//		times++;
//		}
	
//	public static void swap1(Circle x, Circle y) {
//		Circle temp = x;
//		x = y;
//		y = temp;
//	}
//	public static void swap2(Circle x, Circle y) {
//		double temp = x.radius;
//		x.radius = y.radius;
//		y.radius = temp;
//	}
	
//	public static void swap(int[] a) {
//		int temp = a[0];
//		a[0] = a[1];
//		a[1] = temp;
//		}
	
//	public static void swap(T t) {
//		int temp = t.e1;
//		t.e1 = t.e2;
//		t.e2 = temp;
//		}
	
//	private static int i = 0;
//	private static int j = 0;
	
	public static void main(String[] args) {
		
		int i = 2;
		int k = 3;
		
		int j = 3;
		int sum = i + j;
		System.out.println("i + j is " + (i + j));
		System.out.println("sum is " + sum);
		
		k = i + j;
		System.out.println("k is " + (k + i));
		System.out.println("j is " + j);
		
		
//		T t1 = new T();
//		T t2 = new T();
//		System.out.println("t1's i = " +T.i + " and j = " + t1.j);
//		System.out.println("t2's i = " +T.i + " and j = " + t2.j);
//		
		
		
//		T t = new T();
//		swap(t);
//		System.out.println("e1 = " + t.e1
//		+ " e2 = " + t.e2);
		
//		int[] a = {1, 2};
//		swap(a);
//		System.out.println("a[0] = " + a[0]
//		+ " a[1] = " + a[1]);
		
//		Circle circle1 = new Circle(1);
//		Circle circle2 = new Circle(2);
//		
//		
//		Circle tem;
//		circle1 = circle2;
//		circle2 = circle1;
//		tem = circle1;
//		circle1 = tem;
//		tem = circle2;
//		
//		System.out.println(circle1.radius);
//		System.out.println(circle2.radius);
//		System.out.println(tem.radius);
		
//		swap1(circle1, circle2);
//		System.out.println("After swap1: circle1 = " +
//		circle1.radius + " circle2 = " + circle2.radius);
//		
//		swap2(circle1, circle2);
//		System.out.println("After swap2: circle1 = " +
//		circle1.radius + " circle2 = " + circle2.radius);
		
//		Count myCount = new Count();
//		int times = 0;
//		for (int i = 0; i < 100; i++) 
//		increment(myCount, times);
//		System.out.println("count is " + myCount.count);
//		System.out.println("times is " + times);
		
		
//		Circle myCircle = new Circle (1);
//		
//		// Print areas for radius 1, 2, 3, 4, and 5.
//		int n = 5;
//		printAreas(myCircle, n);
//		
//		 // See myCircle.radius and times
//		System.out.println("\n" + "Radius is " + myCircle.getRadius());
//		System.out.println("n is " + n);
		
		
		
		
//		CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(2.3);
//		
//		System.out.println("The area of the circle of radius "+ myCircle.getRadius() + " is " + myCircle.getArea());
//		// Increase myCircle's radius by 10%
//		myCircle.setRadius(myCircle.getRadius() * 1.1);
//		System.out.println("The area of the circle of radius "
//		+ myCircle.getRadius() + " is " + myCircle.getArea());
//				
//		System.out.println("The number of objects created is "
//		+ CircleWithPrivateDataFields.getNoOfObjects());
		
		
		
		
//		System.out.println("When no object is created " + Circle.getNoOfObjects());
//		
//		Circle c1 = new Circle();
//		System.out.println(c1.radius + " No of objects " + Circle.getNoOfObjects());
//		
//		Circle c2 = new Circle(5);
//		c1.radius = 9;
//		System.out.println(c1.radius + "and " + " area is " + c1.getArea() + " No of objects " + Circle.getNoOfObjects());
//		System.out.println(c2.radius + "and " + " area is " + c2.getArea() + " No of objects " + Circle.getNoOfObjects());
//		
//		Circle c3 = new Circle();
//		System.out.println(Circle.getNoOfObjects());
//		
//		Circle c4 = new Circle();
//		System.out.println(Circle.getNoOfObjects());
		
		
//		Circle c1 = new Circle(1);
//		System.out.println(c1.getArea());
//		System.out.println(c1.getPerimeter());
//		c1.setRadius(10);
//		System.out.println("New area is : " + c1.getArea());
//		
//		Circle c2 = new Circle(25);
//		System.out.println(c2.getArea());
//		System.out.println(c2.getPerimeter());
//		
//		Circle c3 = new Circle(125);
//		System.out.println(c3.getArea());
//		System.out.println(c3.getPerimeter());
		
	
	}

}

