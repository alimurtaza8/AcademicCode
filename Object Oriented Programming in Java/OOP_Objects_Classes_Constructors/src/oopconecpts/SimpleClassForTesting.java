package oopconecpts;

//class ConstructorTest{
//	int value1;
//	int value2;
//	
//	ConstructorTest(){
//		value1 = 10;
//		value2 = 20;
//		System.out.println("First Constructor is invoke");
//	}
//	ConstructorTest(int a){
//		value1 = a;
//		System.out.println("2nd Constructor is invoke");
//	}
//	ConstructorTest(int a, int b){
//		value1 = a;
//		value2 = b;
//		System.out.println("3rd Constructor is invoke");
//	}
//	public void display(){
//		System.out.println("Value1 === "+value1);
//		System.out.println("Value2 === "+value2);
//		}
//	
//}

//class JavaExample{
//String web;
//
//JavaExample(String w){
//	web = w;
//	System.out.println("real constructor");
//}
//JavaExample(JavaExample je){
//	web = je.web;
//	System.out.println("Copy constructor");
//}
//void display() {
//	System.out.println("website: " + web);
//}
//}


class SimpleTests{
	int myvar1 = 10;
	int myvar2 = 20;
	
	SimpleTests(){
		
	}
	
	SimpleTests(int myvar1,int myvar2){
		this.myvar1 = 56;
		this.myvar2 = 75;
	}
	
	public void changeValues() {
		myvar1++;
		myvar2 = 80;
		myvar2++;
	}
	
	public void checkMethod() {
		System.out.println("var1 value is : " + myvar1);
		System.out.println("var2 value is : " + myvar2);

	}
}

public class SimpleClassForTesting {

	public static void main(String[] args) {
		
		SimpleTests ts1 = new SimpleTests(50,70);
		
		SimpleTests ts2 = new SimpleTests(10,20);
		
		ts1 = ts2;
		ts2 = ts1;
		
		boolean cond;
		
		if(ts1==ts2) {
			cond = true;
			System.out.println(cond);		
		}
		else {
			cond = false;
			System.out.println(cond);
		}
		
		
//		ts3.changeValues();
//		ts3.checkMethod();
		
//		ts3.myvar2 = 80;
//		System.out.println("New value is " + ts3.myvar1);
//		System.out.println("New value is " + ts3.myvar2);
//		
		
//		SimpleTests ts = new SimpleTests();
//		ts.changeValues();
//		ts.checkMethod();
		
//		System.out.println("New value is " + ts.myvar1);
//		System.out.println("New value is " + ts.myvar2);

//		int myvar1 = 11;
//		int myvar2 = 22;
		
//		SimpleTests ts1 = new SimpleTests();
//		ts1.myvar1 = 12;
//		ts1.myvar2 = 13;
//		ts1.checkMethod();
		
//		myvar1 = 20;
		
//		ts1.myvar1 = 22;
//		ts1.checkMethod();
//		
		
		
//		SimpleTests ts2 = new SimpleTests(25,50);
		
//		ts2.myvar1 = myvar1;
//		ts2.checkMethod();
		
//		ts2 = ts1;
//		ts2.checkMethod();
		
		
//		ts2.checkMethod();
//		ts1.checkMethod();
//		
//		System.out.println("now change");
//		
//		ts1 = ts2;
//		
//		ts1.checkMethod();
//		ts2.checkMethod();
		
		
//		JavaExample obj1 = new JavaExample("BeginnersBook");
//		obj1.display();
//		
//		JavaExample obj2 = new JavaExample(obj1);
//		obj2.display();
		
		
//		ConstructorTest con1 = new ConstructorTest();
//		ConstructorTest con2 = new ConstructorTest(30);
//		ConstructorTest con3 = new ConstructorTest(30,40);
//		
//		con1.display();
//		con2.display();
//		con3.display();

		
	}

}
