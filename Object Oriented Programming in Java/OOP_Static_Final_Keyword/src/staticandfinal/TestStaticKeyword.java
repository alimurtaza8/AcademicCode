package staticandfinal;

class StaticExample{
	static private String name;
	static private int noOfObjects;
	
	StaticExample(String name){
		this.name = name;
		noOfObjects++;
	}
	
	public int getNoOfObjects() {
		return noOfObjects;
	}
	
	public String toString() {
		return "The name is " + name + " and noOfObjects is " + noOfObjects;
	}
	
}

class StaticExample2 extends StaticExample{
	static int noOfObjects;
	
	StaticExample2(String name,int noOfObjects){
		super(name);
		this.noOfObjects = noOfObjects;
	}
}

public class TestStaticKeyword {

	public static void main(String[] args) {
		
		
		StaticExample2 st = new StaticExample2("Aa",9);
		System.out.println(st.getNoOfObjects());
		System.out.println(StaticExample2.noOfObjects);
		

//		StaticExample st = new StaticExample("AA");
//		System.out.println("The static variable is " + StaticExample.name);
//		System.out.println("The static variable is " + StaticExample.noOfObjects);
//		
//		StaticExample st1 = new StaticExample("A");
//		StaticExample st2 = new StaticExample("A");
//		StaticExample st3 = new StaticExample("A");
//		StaticExample st4 = new StaticExample("A");
//
//		
//		System.out.println("The NoOfObjects is " + st4.getNoOfObjects());
//
//		
		
	
//	
//	static {
//		final int counter = 0;
//		System.out.println("This is static block");
//		counter = 10; error
//		System.out.println("This is static block and value is " + counter);

	}
	
//	static {
//		final int counter = 0;
//		System.out.println("This is static block");
//		//counter = 10; error
//		System.out.println("This is static block and value is " + counter);
//	}


}
