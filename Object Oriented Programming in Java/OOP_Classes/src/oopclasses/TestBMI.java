package oopclasses;

class BMI{
	private String name;
	private int age;
	private double weight;
	private double height;

	BMI(String newName, int newAge, double newWeight, double newHeight){
		this.name = newName;
		this.age = newAge;
		this.weight = newWeight;
		this.height = newHeight;
	}
	BMI(String newName, double newWeight, double newHeight){
		this(newName,20,newWeight,newHeight);
	}

//	public double getBMI(){
//		
//	}
}

public class TestBMI {

	public static void main(String[] args) {

	}

}
