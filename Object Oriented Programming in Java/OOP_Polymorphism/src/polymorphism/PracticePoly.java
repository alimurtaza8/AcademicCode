package polymorphism;

class Animal{
	
	void eating() {
		System.out.println("Animal is eating");
	}
}

class Bird extends Animal{
	void eating() {
		System.out.println("Bird is eating");
	}
	void fly() {
		System.out.println("Bird is fly");
	}
}

public class PracticePoly {

	public static void main(String[] args) {
		
//		Animal animal = new Animal();
//		animal.eating();
//		
//		Bird bird = new Bird();
//		bird.eating();
		
		Animal bird = new Bird();
//		bird.eating();
//		bird.fly(); error
		
		Bird bird1 = new Bird();
//		bird.eating();
		bird1.fly();
		

	}

}
