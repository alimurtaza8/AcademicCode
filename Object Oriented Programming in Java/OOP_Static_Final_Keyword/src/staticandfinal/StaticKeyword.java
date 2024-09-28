package staticandfinal;



//class BankAccount{
//	String accTitle;
//	private static int counter;
//	double balance;
//	
//	BankAccount(String act){
//		this.accTitle = act;
//		counter++;
//	}
//	
//	void deposite(double amount) {
//		this.balance = this.balance + amount;
//		System.out.println(this.balance);
//		System.out.println(counter);
//	}
//	
//	static void showCount() {
//		System.out.println(counter);
//	}
//	
//	public void setInt(int count) {
//		this.counter = count;
//	}
//	int getInt() {
//		return this.counter;
//	}
//	
//}


	// Final Keyword


//final class Animal{
//	 void info() {
//		System.out.println("This is animal");
//	}
//}
//
//class Dog extends Animal{
//	void info() {
//		System.out.println("This is Dog");
//	}
//}
//
//class NewAnimal extends Animal{
//	void info() {
//		System.out.println("This is new Animal");
//	}
//}

//class NewClass{
//	void process(final int x) {
//		x = 22;
//		int sum = x + 14;
//		System.out.println(sum);
//	}
//}

	//Static keyword other example
	

//class Circle{
//	double radius;
//	static int noOfObjects;
//	
//	Circle(){
//		radius = 1;
//		noOfObjects++;
//	}
//	Circle(double newRadius){
//		radius = newRadius;
//		noOfObjects++;
//	}
//	static int getNoOfObjects(){
//		return noOfObjects;
//	}
//	double getArea() {
//		return radius * radius * Math.PI;
//	}
//}


class Main
{
// static variables a and b
static int a = 10;
static int b;
static void printStatic()
{
a = a /2;
b = a;
System.out.println("printStatic::Value of a : "+a + " Value of b :"+b);
}
}
public class StaticKeyword {
	public static void main(String[] args) {
		
		Main m = new Main();
		Main.printStatic();
		Main.b = Main.a*5;
		Main.a++;
		System.out.println("main::Value of a : "+Main.a + " Value of b : "+Main.b);
	
		
//		System.out.println("When no object is created " + Circle.getNoOfObjects());
//		
//		Circle c1 = new Circle();
//		System.out.println(c1.radius + " No of objects " + Circle.getNoOfObjects());
//		
//		Circle c2 = new Circle(5);
//		c1.radius = 9;
//		System.out.println(c1.radius + "and " + " area is " + c1.getArea() + " No of objects " + Circle.getNoOfObjects());
//		System.out.println(c2.radius + "and " + " area is " + c2.getArea() + " No of objects " + Circle.getNoOfObjects());
//		
//		Circle c3 = new Circle();
//		System.out.println(Circle.getNoOfObjects());
//		
//		Circle c4 = new Circle();
//		System.out.println(Circle.getNoOfObjects());
//		System.out.println(Circle.noOfObjects);
		
		//System.out.println(Circle.radius); // error
		
		

//		NewClass n = new NewClass();
//		n.process(10);
		
		
//		Animal a1 = new Animal();
//		Dog d1 = new Dog();
//		NewAnimal nm = new NewAnimal();
//		a1.info();
		
		
	
		
//		BankAccount.showCount();
//		//System.out.println(BankAccount.counter);
//		BankAccount ac1 = new BankAccount("Person1");
//		System.out.println(ac1.accTitle);
//		//System.out.println(ac1.counter);
//		//System.out.println(BankAccount.counter);
//		
//		BankAccount ac2 = new BankAccount("Person2");
//		System.out.println(ac2.accTitle);
//		//System.out.println(ac2.counter);
//		//System.out.println(BankAccount.counter);
//		ac1.deposite(1000);
//		BankAccount.showCount();
//		
//		ac1.setInt(0);
//		System.out.println(ac1.getInt());;
	}

}
