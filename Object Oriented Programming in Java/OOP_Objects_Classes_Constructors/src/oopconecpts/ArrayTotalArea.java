package oopconecpts;

class CircleWithPrivateDataFields{
	private double radius;
	private static int noOfObjects;

	CircleWithPrivateDataFields(){
		radius = 0;
		noOfObjects++;
	}
	CircleWithPrivateDataFields(double newRadius){
		radius = newRadius;
		noOfObjects++;
	}
	double getRadius() {
		return radius;
	}
	void setRadius(double newRadius) {
		radius = (newRadius >= 0) ? newRadius : 0;
	}
	static int getNoOfObjects() {
		return noOfObjects;
	}
	double getArea() {
		return radius * radius * Math.PI;
	}
}

public class ArrayTotalArea {

	public static void main(String[] args) {
		
		CircleWithPrivateDataFields[] circleArray;
		
		circleArray = creatCircleArray();
		printCircleArray(circleArray);	
	}
	
	public static CircleWithPrivateDataFields[] creatCircleArray() {
		CircleWithPrivateDataFields[] circleArray = new CircleWithPrivateDataFields[5];
		
		for (int i=0; i < circleArray.length; i++) {
			circleArray[i] = new CircleWithPrivateDataFields(Math.random() * 100);
		}
		return circleArray;
	}
	
	public static void printCircleArray(CircleWithPrivateDataFields[] circleArray) {
		
		System.out.println("Radius " + "\t\t\t\t" + "Area");
		for(int i=0; i < circleArray.length; i++) {
			System.out.println(circleArray[i].getRadius() + "\t\t" + circleArray[i].getArea());
		}
		System.out.println("----------------------------------------------------");
		System.out.println("The total area of circle is " + sum(circleArray));
		System.out.println("The total radius of circle is " + radiusSum(circleArray));
		System.out.println("The Total number of objects is " + CircleWithPrivateDataFields.getNoOfObjects());
	}
	
	public static double sum(CircleWithPrivateDataFields[] circleArray) {
		double sum = 0;
		for(int i=0; i < circleArray.length; i++) {
			sum += circleArray[i].getArea();		
		}
		return sum;
	}
	
	public static double radiusSum(CircleWithPrivateDataFields[] circleArray) {
		double radiusSum = 0;
		for(int i=0; i < circleArray.length; i++) {
			radiusSum += circleArray[i].getRadius();
		}
		return radiusSum;
	}
	
}
