package polymorphism;

//class Person1
//{
//private String name;
//public Person1(String name) { this.name = name; }
//public boolean isAsleep(int hr) { return 22 < hr || 7 > hr; }
//public String toString() { return name; }
//public void status( int hr )
//{
//if ( this.isAsleep( hr ) )
//System.out.println( "Now offline: " + this );
//else
//System.out.println( "Now online: " + this );
//}
//}
//class Student1 extends Person1
//{
//public Student1(String name) {
//super(name);
//}
//public boolean isAsleep( int hr ) // override
//{ return 2 < hr && 8 > hr; }
//}

//class Person2 {
//public void method1() {
//System.out.print("Person 1 ");
//}
//public void method2() {
//System.out.print("Person 2 ");
//}
//}
//class Student2 extends Person2 {
//public void method1() {
//System.out.print("Student 1 ");
//super.method1();
//method2();
//}
//public void method2() {
//System.out.print("Student 2 ");
//}
//}
//class Undergrad extends Student2 {
//public void method2() {
//System.out.print("Undergrad 2 ");
//}
//}


//class Person2 {
//private String name;
//public String getName() {return name;}
//}
//class Student2 extends Person2 {
//private int id;
//public int getID() {return id;}
//}
//
//class Faculty extends Person2{
//	private String id;
//	
//	public String getID() {
//		return id;
//	}
//}

//class Person2{
//	String Name;
//	
//	String getName() {
//		return Name;
//	}
//}
//class Student2 extends Person2{
//	int id;
//	
//	int getId() {
//		return id;
//	}
//}

class A{
	String name;
	String id;
	
	public String getName() {
		return name;
	}
	public String getid() {
		return id;
	}
}
class B extends A{
	String field;
	
	public String getfield() {
		return field;
	}
}


public class Poly {

	public static void main(String[] args) {
		
		A b1 = new B();
		B b2 = (B)b1;
		
//		System.out.println(b1.getfield()); //error

		
//		B b = new B();
//		System.out.println(b.getName());
//		System.out.println(b.getid());
//		System.out.println(b.getfield());
//
//		A b1 = new B();
//		System.out.println(b.getName());
//		System.out.println(b.getid());
//		System.out.println((B)b1.getfield()); erro
		
//		Person2 s = new Student2();
//		s.getName();
//		s.getId();
		
//		Student2 s = new Student2();
//		Person2 p = new Person2();
//		Person2 q = new Person2();
//		Faculty f = new Faculty();
//		Object o = new Faculty();
//		
//		String n = s.getName();
//		p = s;
//		int m = p.getID();
//		f = q;
//		o = s;
		
//		Person2 u = new Undergrad();
//		u.method1();
		
//		Person1 p;
//		p = new Student1("Sally");
//		p.status(1);
		
		
		
	}

}
