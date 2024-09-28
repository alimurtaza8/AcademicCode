package abstractioninterfaces;

abstract class Animal1{
	protected  String name;
	protected  int id;
	
//	Animal1(String name , int id){
//		this.name = name;
//		this.id = id;
// 	}
	Animal1(){
		System.out.println("from Abstract Animal1 Cons");
	}
	
	abstract void setName(String name);
	abstract String getName();
	abstract void walk();
	abstract void sleep();
	abstract void eats();
}

class Cat1 extends Animal1{
	
	Cat1(){
		System.out.println("Constructor from Cat Class");
	}
	
	Cat1(String name , int id){
//		super(name,id);   //For when Private member in Base Class and when argoment const available
		this.name = name;
		this.id = id;
	}
	
	void walk() {
		System.out.println("Cats walk");
	}
	void sleep() {
		System.out.println("Cats sleep");
	}
	void eats() {
		System.out.println("Cats eats");
	}
	
	void perform() {
		walk();
		sleep();
		eats();
	}
	
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
}

class Parrot1 extends Cat1{
	
	Parrot1(){
		System.out.println("Parrot Constructor");
	}
	
	Parrot1(String name, int id){
		super(name,id);
		super.name = name;
		super.id = id;
	}
	
	void fly() {
		System.out.println("Parrot fly");
	}
}

public class TestAbstruction {

	public static void main(String[] args) {
		
//		Animal1 a = new Animal1("Aa",22); Error
		
//		Cat1 c = new Cat1("caty",1);
//		c.setName("New name");
//		System.out.println(c.getName());
//		c.perform();
		
//		Parrot1 p1 = new Parrot1();
		
		Parrot1 p = new Parrot1("ParrotName",23);
		p.setName("newParrort");
		System.out.println(p.getName());
		p.perform();
		p.fly();
		
	}

}
