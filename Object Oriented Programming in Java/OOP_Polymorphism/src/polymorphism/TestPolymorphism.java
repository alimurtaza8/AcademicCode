package polymorphism;

class Person{
	String name;
	
	Person(){
		System.out.println("from Person");
	}
}

class Student extends Person{
	private String id;
	
	Student(String id){
		this.id = id;
	}
	
	String getID() {
		return id;
	}
}

public class TestPolymorphism {

	public static void main(String[] args) {
		
		Student s1 = new Student("1231");
		System.out.println(s1.getID());


	}

}
