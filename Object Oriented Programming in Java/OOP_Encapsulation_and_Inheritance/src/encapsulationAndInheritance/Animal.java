package encapsulationAndInheritance;

class Animal {
	
	protected String id;
	
	Animal(String s){
		this.id = "ani" + s;
		System.out.println("Constructir");
	}
	

	Animal(){
		System.out.println("The constructor from Animal");  // No argument constructor
	}
	
	
	void move() {
		System.out.println("Animal is move");
	}

	void sound() {
		System.out.println("Animal have sound");
	}
	
	
	void eat() {
		System.out.println("Animal is eating");
	}
	

	
}

class Dog extends Animal{
	
	Dog(){
		System.out.println("The constructor from Dog");  // No argument constructor
	}
	
	Dog(String s){
		super(s);
	}

	void eat() {
		super.eat();
		System.out.println("This dog eats meat");
	}
}


class Parrot extends Dog{
	
//	Parrot(){
//		System.out.println("The constructor from Parrot");   // No argument constructor
//	}
	
	Parrot(String s){
		super(s);
	}
	
	void eat() {
		System.out.println("Parrot eats");
	}
	
	void perform() {
		eat();
		super.eat();
	}
}
