package abstractioninterfaces;

interface Animal{
	 int ID = 1234;
	 
	void changeID(int id);
	void sound();
	void move();
	
//	Animal(){
//		System.out.println("Hi");
//	}
}

interface Human extends Animal{
	String name = "Unknow";
	
	void talk();
	void changeName(String name);
	
//	public void changeID() { 
//		System.out.println("hi");
//	}
}
class Dog implements Animal,Human{
	String dogType;
	
	Dog(String dogType){
		this.dogType = dogType;
	}
	
	Dog(){
		System.out.println("from Dog class");
	}
	
	public void sound() {
		System.out.println("Dog sound");
	}
	
	public void move() {
		System.out.println("Dog moves");
	}
	public void talk() {
		System.out.println("Dog talk");
	}
	public void changeID(int ID) {
		
	}
	public void changeName(String name) {
		
	}
	public void perform() {
		sound();
		move();
		talk();
	}
}


public class Interface {

	public static void main(String[] args) {
		
//		Animal a = new Animal(); error
//		Human a1 = new Human(); error
		
		Dog d = new Dog("wild");
		System.out.println(Dog.name);
		System.out.println(d.dogType);
		d.changeName("NewDog");
		System.out.println(d.name);
		d.changeID(12);
		System.out.println(d.ID);

		
//		d.sound();
//		d.move();
//		d.talk();
//		System.out.println(Dog.ID);
//		d.perform();

	}

}
