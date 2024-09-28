package abstractioninterfaces;

abstract class Animal22{

public abstract void walk(); 
protected abstract void sound();
protected abstract void sleep();
	void newM() {
		System.out.println("hi");
	}
	Animal22(){
		System.out.println("hi");
	}
}
abstract class Dog22 extends Animal22{
	
	Dog22(){
		System.out.println("hi2");
	}

public void walk() {
	System.out.println("Dog walks");	
}

public void sound() {
	System.out.println("Dog sound");
}
}

class Cat22 extends Dog22{
	public void catSpecialMethod() {
		System.out.println("Cat is friendly");
	}
	public void sleep() {
		System.out.println("Sleep");
	}
}


//class Cat extends Animal{
//
//public void walk() {
//	System.out.println("Cat walks");	
//}
//
//public void sound() {
//	System.out.println("Cat sound");
//}
//}

public class TestNewAbs {

	public static void main(String[] args) {
		
//		Animal22 d = new Cat22();
		Cat22 c1 = new Cat22();
//		d.catSpecialMethod();
//		c1.walk();
//		c1.sound();
//		c1.newM();
		
	}

}
