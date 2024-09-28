package polymorphism;

//class DemoAnimal {
//    void sound() {
//        System.out.println("Generic Animal sound");
//    }
//}
//
//class DemoDog extends DemoAnimal {
//     void sound() {
//        System.out.println("Woof!");
//    }
//}
//class Human{
//public static void walk()
//{
//System.out.println("Human walks");
//}
//}
//class Boy extends Human{
//public static void walk(){
//System.out.println("Boy walks");
//}
//}

class Human{
	//Overridden Method
	public static void walk()
	{
	System.out.println("Human walks");
	}
	}
	class Demo extends Human{
	//Overriding Method
	public static void walk(){
	System.out.println("Boy walks");
	}
	}

public class DynamicAndStatic {

	public static void main(String[] args) {
		
//		DemoAnimal a = new DemoDog();
//		a.sound();
		
//		Human obj = new Boy();
//		/* Reference is of HUman type and object is
//		* of Human type.
//		*/
//		Human obj2 = new Human();
//		obj.walk();
//		obj2.walk();
		
		Human obj = new Demo();
		/* Reference is of HUman type and object is
		* of Human type.
		*/
		Human obj2 = new Human();
		obj.walk();
		obj2.walk();

	}

}
