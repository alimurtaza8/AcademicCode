package oopconecpts;
import java.awt.geom.Point2D;
import java.util.*;


//class Student{
//	String name;
//	int age;
//	
//	
//	// For Polymorpishm
//	
//	public void info(String name) {
//		System.out.println(name);
//	}
//	
//	public void info(int age) {
//		System.out.println(age);
//	}
//	
//	public void info(String name, int age) {
//		System.out.println(name + " " + age);
//	}
	
	// Method
//	public void info() {
//		System.out.println("From class " + this.name);
//		System.out.println("From class " + this.age);
//	}
	
	// Non premitic
//	Student(){
//		System.out.println("Constructor");
//	}
	
	
	
//	Student(String stName,int stAge){
//		this.name = stName;
//		this.age = stAge;
//	}
//	
	
	//copy constructor
	
//	Student(Student s2){
//		this.name = s2.name;
//		this.age = s2.age;
//	}
//	
//	Student(){
//		
//	}
//	
//}


// Inheritance in Java

//class Employee{
//	public void details() {
//		System.out.println("Ali");
//		System.out.println(12);
//	}
//}
//
//class Programmer extends Employee{
//	public void programmer() {
//		System.out.println("He is a programmer");
//	}		
//}



//class Shape{
//	public void area() {
//		System.out.println("Display area");	
//	}
//}
//
//
//class Circle extends Shape{
//	public void area1(int r) {
//		System.out.println((3.14)*r*r);
//	}
//}


//class Employee{
//	String name;
//	int age;
//	private String id;
//	
//	public void details() {
//		System.out.println("The Employee name is: " + this.name);
//		System.out.println("The Employee age is: " + this.age);
//		//System.out.println("The Employee id is: " + this.id);
//	}
//	
//	public String setID() {
//		return this.id;
//	}
//	
//	public void getID(String i) {
//		this.id = i;
//	}
//	
//}

//class Passion extends Employee{
//	
//	String skill;
//	
//	public void skills() {
//		System.out.println("He is a: " + this.skill);
//	}
//	
//	
//}

	// Abstract class
//
//abstract class Animal{
//	abstract void walk();
//}
//
//class Horse extends Animal{
//	public void walk() {
//		System.out.println("walk on 4 legs");
//	}
//}
//
//class Chicken extends Animal{
//	public void walk() {
//		System.out.println("walk on 2 legs");
//	}
//}



	//interface in Java

//interface Animal{
//	int eyes = 2;
//	void walk();
//}
//
//class Horse implements Animal{
//	public void walk() {
//		System.out.println("walks on 4 legs");
//	}
//}


//	// static use in Java
//
//	class Students{
//		String name;
//		static String school;
//		
//		public static void changeSchool() {
//			school = "NED";
//		}
//	}

//	
//class Demo{
//	int value1;
//	int value2;
//	
//	Demo(){
//		value1 = 10;
//		value2 = 20;
//		System.out.println("inside first constructor");
//	}
//	
//	Demo(int a){
//		value1 = a;
//		System.out.println("inside 2nd constructor");
//	}
//	
//	Demo(int a, int b){
//		value1 = a;
//		value2 = b;
//		System.out.println("inside 3rd constructor");		
//	}
//	
//	public void display(){
//		System.out.println("Value1 === "+value1);
//		System.out.println("Value2 === "+value2);
//	}
//
//}	


//class JavaExample{
//	String web;
//	JavaExample(String w){
//		web = w;
//	}
/* This is the Copy Constructor, it
* copies the values of one object
* to the another object (the object
* that invokes this constructor)
*/
//	JavaExample(JavaExample je){   // learn later
//		web = je.web;
//	}
//	void disp(){
//		System.out.println("Website: "+web);
//	}
//
//}

// class Point{
//	private int x;
//	private int y;
//	public Point(int startX, int startY) {
//		x = startX;
//		y = startY;
//	}
//	public int getX() {
//		return x;
//	}
//	public int getY() {
//		return y;
//	}
//	public double distance(Point otherPt) {
//		int dx = x - otherPt.getX();
//		int dy = y - otherPt.getY();
//		return Math.sqrt(dx * dx + dy * dy);
//	}
//}


//class A{
//	public A() {
//		System.out.println("A's no-arg constructor is invoked");
//	}
//}
//
//class B extends A{
//}

//class A{
//	public A(int x) {
//		System.out.println("The num is " + x);		
//	}
//}
//
//class B extends A{
//	public B(int x) {
//		super(x);
//		
//	}
//}


//class A{
//	public A() {
//		System.out.println("Constructor of A");
//	}
//}
//
//
//class B extends A{
//	public B() {
//		System.out.println("Constructor of B");
//	}
//}

//
//class A{
//	
//	 static void method() {
//		System.out.println("Protected");
//	}
//}
//
//class B extends A{
//	  void method1() {
//		System.out.println("Protected1");
//	}
//}


//class A{
//	
//	public void p(double i) {
//		System.out.println(2 * i);
//	}
//}
//
//class B extends A{
//	
//	public void p(int i) {
//		System.out.println(i);
//	}
//}

//class Circle{
//	private double radius;
//	
//	public Circle(double radius) {
//		this.radius = radius;
//	}
//	
//	public double getRadius() {
//		return radius;
//	}
//	
//	public void setRadius() {
//		this.radius = radius;
//	}
//	
//	public double getArea() {
//		return radius * radius * Math.PI;
//	}
//}
//
//class B extends Circle{
//	private double lenght;
//	
//	public B(double lenght){
//		this.lenght = lenght;
//	}
//	
//	B(double lenght, double radius){
//		
//		this.lenght = lenght;
//		setRadius();
//	}
//	
//	public double getLenght() {
//		return lenght;
//	}
//	
//	public void setLenght() {
//		this.lenght = lenght;
//	}
//	
//	public double getArea() {
//		return getArea() * lenght;
//	}
//}

//
//class Shape{
//	
//	void draw() {
//		System.out.println("Shap draw!");
//	}
//}
//
//class Circle extends Shape{
//	
//	void draw() {
//		System.out.println("Circle draw!");
//	}
//}
//
//class Rectangle extends Shape{
//	
//	void draw() {
//		System.out.println("Rectangle draw!");
//	}
//}

//
//class baseclass {
//	static void print() {
//		System.out.println("print in baseclass.");
//	}
//}
//
//class derivedclass extends baseclass {
//	
//	 static void print() {
//		 //super.print();
//		System.out.println("print in derivedclass.");
//		
//	}
//}

//class NewClass{
//	
//	static {
//		System.out.println("This is static block");
//	}
//	
//	NewClass(){
//		System.out.println("This is constructor");
//	}
//	
//}

//class A{
//	boolean x;
//	
//}

	
//	int i = 5;
//	static int k = 2;
//	
//	public void m1() {
//		i = i + k + m2(i, k);
//	}
//	public static int m2(int i, int j) {
//		return (int)(Math.pow(i, j));
//	}
	
//	public static int factorial(int n) {
//		int result = 1;
//		for (int i = 1; i <= n; i ++)
//		result *= i;
//		return result;
//		}

//class Location{
//	public double lat;
//	public double lon;
//	
//	Location(double latIn, double lonIn){
//		this.lat = latIn;
//		this.lon = lonIn;
//	}
//}

//class ArrayLocation{
//	public double coords [];
//	
//	public ArrayLocation(double[] coords) {
//		this.coords = coords;
//	}
//}

//class T {
//	static int i = 0;
//	int j = 0;
//	
//	T() {
//	i++;
//	j = 1;
//	}
//}

//class Circle{
//	int[] arry;
	
//	Circle(int[] newArray){
//		this.arry = newArray;
//	}
//}

//class One{
//	int i = 1;
//	public int getInt() {
//		return i;
//	}
//}
//class Two extends One{
//	int i = 2;
//	public int getInt() {
//		return i;
//	}
//}

class Person{
	public int id;
	public String name;
	
	Person(){
		
	}
	
	Person(int newId, String newName){
		this.id = newId;
		this.name = newName;
	}
	
	public String toString() {
		return "The name of Person is: " + name + " The id is: " + id;
	}
}

public class OopPractice {
	public static void main(String args[]) {
		
		Person p1 = new Person();
		
		p1.id = 12;
		p1.name = "ABC";
		
		System.out.println(p1.toString());
		
		
//		System.out.println(Float.MAX_VALUE);
		
		
		
//		Integer i = new Integer();
		
//		System.out.println("start");
		
//		One one = new One();
//		One two = (Two)one;
//		System.out.println(two.getInt());
		
		
//		Circle[] circleArray = new Circle[10];
//	//	To initialize circleArray, you can use a for loop like this one:
//		for (int i = 0; i < circleArray.length; i++) {
//		circleArray[i] = new Circle();
//		}
		
		
//		T t1 = new T();
//		T t2 = new T();
//		System.out.println("t1's i = " +T.i + " and j = " + t1.j);
//		System.out.println("t2's i = " +T.i + " and j = " + t2.j);
//	
		
//		double[] coords = {5.0,0.0};
//		ArrayLocation arr = new ArrayLocation(coords);
//		arr.coords[0] = 1.01;
//		System.out.println(arr.coords[0]);
		
//		Location loc1 = new Location(32.9,-117.2);
//		Location loc2 = new Location(32.0,130.0);
//		loc1 = loc2;
//		loc2 = loc1;
//		
//		System.out.println("For loc1 " + loc1.lat + " " + loc1.lon);
//		System.out.println("For loc2 " + loc2.lat + " " + loc2.lon);
		
//		int lon = 123;
//		Location loc1 = new Location(12.0,lon);
//		loc1.lat = 12.4;
//		loc1.lon = 1234.98;
//		System.out.println(loc1.lat + " " + loc1.lon );
		
//		Location loc1 = new Location(39.9, 116.4);
//		Location loc2 = new Location(55.8, 37.6);
//		System.out.println(loc1.lat + ", " + loc1.lon);
//		loc1 = loc2;
//		loc1.lat = -8.3;
//		loc1.lon = -11;
//		System.out.println(loc2.lat + ", " + loc2.lon);
//		System.out.println(loc1.lat + ", " + loc1.lon);
		
//		Location loc1 = new Location(39.9, 116.4);
//		Location loc2 = new Location(55.8, 37.6);
//		
//		System.out.println(loc1.lat + ", " + loc1.lon);
//		loc2 = loc1;
//		loc2.lat = -8.3;
//		loc2.lon = -11;
//		System.out.println(loc2.lat + ", " + loc2.lon);
//		System.out.println(loc1.lat + ", " + loc1.lon);
		
//		double latitued = 12;
//		Location loc1 = new Location(latitued,11);
//		loc1.lat = 20;
//		System.out.println(loc1.lat);
		
//		OopPractice p = new OopPractice();
		
//		System.out.println(factorial(5));
		
		
		
//		OopPractice p = new OopPractice();
//		int j = p.i;
//		System.out.println(j);
//		p.m1();
		
		
//		Random r1 = new Random();
//		
//		for(int i=0; i < 10; i++) {
//			System.out.print(r1.nextInt(10) + " ");
//		}
		
//		A a = new A();
//		System.out.println(a.x);
		
		
//		System.out.println("Before the main class");
//		
//		new NewClass();
		
	
//		baseclass A = new baseclass();
//		baseclass B = new derivedclass();
		
//		baseclass.print();
//		derivedclass.print();
		
		
		
//		Circle shape1 = new Circle();
//		shape1.draw();
			
		
//		A a = new A();
//		a.p(10);
//		a.p(10.0);
		
//		B b =  new B();
//		b.p(10);
//		b.p(10.0);
	
//		Circle c = new Circle(1.0);
//		System.out.println(c.getArea());
//		System.out.println(c.getRadius());
//		B b = new B(10.0);
//		System.out.println(b.getArea());
		
		
		
		
		
		
		
//		Point p1 = new Point(3,4);
//		Point p2 = new Point(6,8);
////		Point p3 = new Point(10,4);
////		Point p4 = new Point(3,6);
//		System.out.println(p1.distance(p2));
////		System.out.println(p3.distance(p4));
		
		
	
		
//		JavaExample obj1 = new JavaExample("BeginnersBook");   // learn later
//		/* Passing the object as an argument to the constructor
//		* This will invoke the copy constructor
//		*/
//		JavaExample obj2 = new JavaExample("Python book");
//		obj1.disp();
//		obj2.disp();
//		
		
		
		
		
		
		
		
		
		
		
		
		
//		Demo d1 = new Demo();
//		Demo d2 = new Demo(30);
//		Demo d3 = new Demo(30,40);
//		d1.display();
//		d2.display();
//		d3.display();
		
		
		

		
		
		
//		Students.school = "KU";
//		Students s1 = new Students();
//		s1.name = "Ali";
//		System.out.println(s1.name);
//		
//		Students.changeSchool();
//		System.out.println("School for s1: " + Students.school);
//		System.out.println("School for s1: " + s1.school); // 2nd way

		
//		Horse h1 = new Horse();
//		h1.walk();
//		System.out.println(h1.eyes);
		
		
//		
//		Horse horse = new Horse();
//		horse.walk();
//		
//		Chicken chic = new Chicken();
//		chic.walk();
		
	
		
//		Employee p = new Employee();
//		Passion p1 = new Passion();
//		p1.name = "Ali Murtaza";
//		p1.age = 21;
//		p1.skill = "Java Programmer";
//		
	
		
//		p1.details();
//		p1.skills();
		
		//Student s1 = new Student();	
		
//		Employee s1 = new Employee();
//		Programmer s1 = new Programmer();
//		s1.name = "Murtaza";
//		s1.age = 24;
		//s1.details();
//		s1.programmer();
		
//		s1.info(s1.name , s1.age);
//		
//		Circle c1 = new Circle();
//		c1.area();
//		c1.area1(4);
//		
	
		
		
	
	}


}