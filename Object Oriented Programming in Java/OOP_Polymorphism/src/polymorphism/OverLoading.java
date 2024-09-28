package polymorphism;

import java.util.Scanner;

public class OverLoading {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number a: ");
		int a = sc.nextInt();
		
		System.out.print("Enter number b: ");
		int b = sc.nextInt();
		
		OverLoading obj1 = new OverLoading(a,b);
		
		System.out.println("Value of width is " + obj1.width  + " and length is " + obj1.length);
		method1(obj1);
		System.out.println("Value of width is " + a  + " and length is " + b);

		obj1.width = a;
		obj1.length = b;
		System.out.println("final Value of width is " + obj1.width  + " and length is " + obj1.length);

		double value1;
		double value2;
		
		value1 = obj1.width;
		value2 = obj1.length;
		
		System.out.println("New Value of width is " + value1  + " and length is " + value2);

	}
	
	private double width;
	private double length;

	OverLoading(double width, double length){
		this.width = width;
		this.length = length;
	}
	
	public static void method1(OverLoading obj) {
		System.out.println("Value of width is " + obj.width  + " and length is " + obj.length);
		obj.width += 5;
		obj.length += 10;
		System.out.println("Value of width is " + obj.width  + " and length is " + obj.length);
	}

	public static void method1(double a, double b) {
		System.out.println("Value of a is " + a  + " and b is " + b);
		a = a + 2;
		b = b - 10;
		System.out.println("Value of a is " + a  + " and b is " + b);
	}

}
