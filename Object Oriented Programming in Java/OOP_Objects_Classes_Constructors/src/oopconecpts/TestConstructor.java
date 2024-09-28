package oopconecpts;

class Constructor{
	private int value1;
	int value2;
	int value3;
	
	Constructor(){
		value1 = 10;
		value2 = 20;
		System.out.println("First Constructor is invoke");
	}
	
	Constructor(int a){
		value1 = a;
		System.out.println("2nd Constructor is invoke");
	}
	Constructor(int a, int b){
		value1 = a;
		value2 = b;
		System.out.println("3rd Constructor is invoke");
	}
	
	Constructor(int a, int b,int c){
		this(a,b);
		this.value3 = c;
		System.out.println("4rd Constructor is invoke");
	}
	
	public int getValue1() {
		return value1;
	}
	
	public void display(){
		System.out.println("Value1 === "+value1);
		System.out.println("Value2 === "+value2);
		System.out.println("Value2 === "+value3);
		}
}

class ChildConstructor extends Constructor{
	int value3;
	int value4;
	
	ChildConstructor(){
		value3 = 1;
		value4 = 2;
		System.out.println("Inside the Constructor of Child");
	}
	ChildConstructor(int value3,int value4){
		super(1,2);
//		super(value1,value2);
		this.value3 = value3;
		this.value4 = value4;
		System.out.println("Inside the 2nd Constructor of Child");

	}
	
	
	public void display(){
		System.out.println("Value1 === "+getValue1());
		System.out.println("Value2 === "+value2);
		System.out.println("Value3 === "+value3);
		System.out.println("Value4 === "+value4);
	}
}

//class JavaExample{
//	String web;
//	
//	JavaExample(String w){
//		web = w;
//		System.out.println("real constructor");
//	}
//	JavaExample(JavaExample je){
//		web = je.web;
//		System.out.println("Copy constructor");
//	}
//	void display() {
//		System.out.println("website: " + web);
//	}
//}

public class TestConstructor {

	public static void main(String[] args) {
		
		Constructor ch = new Constructor(90,80);
		Constructor ch1 = new Constructor(10,20,33);
		ch1.display();
//		
//		ch1.display();
		
		
//		System.out.println(ch1.value1);
//		System.out.println(ch1.value2);
		
//		ChildConstructor ch1 = new ChildConstructor(30,40);
//		ch1.display();
//		ChildConstructor ch2 = new ChildConstructor(1,2);
//		ch2.display();

		
//		TestConstructor t1 = new TestConstructor("BeginnersBook");
//		t1.display();
//		TestConstructor t2 = new TestConstructor(t1);
//		t2.display();
//		
//		TestConstructor t3 = new TestConstructor(t2);
//		t2.display();
		
//		JavaExample obj1 = new JavaExample("BeginnersBook");
//		obj1.display();
//		
//		JavaExample obj2 = new JavaExample(obj1);
//		obj2.display();
		
		
//		ChildConstructor d1 = new ChildConstructor();
//		d1.display();
//		
//		ChildConstructor d2 = new ChildConstructor(30,40);
//		d2.display();
		
		
		
//		Constructor con1 = new Constructor();
//		Constructor con2 = new Constructor(30);
//		Constructor con3 = new Constructor(30,40);
//		
//		con1.display();
//		con2.display();
//		con3.display();

	}
	
//String web;
//	
//	private TestConstructor(String w){
//		web = w;
//		System.out.println("real constructor");
//	}
//	private TestConstructor(TestConstructor je){
//		web = je.web;
//		System.out.println("Copy constructor");
//	}
//	private void display() {
//		System.out.println("website: " + web);
//	}

}
