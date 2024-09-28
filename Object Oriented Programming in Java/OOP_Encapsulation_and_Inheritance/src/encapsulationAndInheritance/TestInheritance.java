package encapsulationAndInheritance;

class Person{
	 private String name;

	Person(){
		name = "unknow";
		System.out.println("From Person class");
	}
	
	Person(String name){
		this.name = name;
		System.out.println("Person constructor");

	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void walk() {
		System.out.println("Person walks");
	}
	
	public void eat() {
		System.out.println("Person eats");
	}
	
	public void sleep() {
		System.out.println("Person sleep");
	}
	
	public String toString() {
		return " The name of Person is " + name;
	}
}

class Student extends Person{
	private int id;
	
	Student(){
		id = 0;
		System.out.println("From Student");
	}
	
	Student(String name,int id){
		super(name);
		this.id = id;
		System.out.println("Contructor for Student");
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void walk() {
		//super.walk();
		System.out.println("Student walks");
	}
	
	public void eat() {
		System.out.println("Student eats");
	}
	
	public void sleep() {
		System.out.println("Students sleep");
	}
	
	public String toString() {
		return "The name of Student is " + getName() + " and  id is " + id;
	}
	
}

class Employee extends Student{
	 private String jobTitle;
	
//	Employee(){
//		System.out.println("from Employee");
//	}
	
	Employee(String name, int id, String jobTitle){
		super(name,id);
		this.jobTitle = jobTitle;
	}
	
	void perform() {
		super.eat();
		super.walk();
		super.sleep();
	}
	
	public String toString() {
		return "The name of Student is " + getName() + " and  id is " + getId() + 
				" and job title is " + jobTitle;
	}
}
public class TestInheritance {

	public static void main(String[] args) {
		
		
		Person p = new Person();
		Person p1 = new Person();
		Student s = new Student();
		
		if(p==p1){
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}
		
//		Employee em1 = new Employee("AA",12,"Programmer");
			
//		em1.setId(22);
//		em1.setName("unknow");
//		System.out.println(em1.toString());
//		em1.eat();
//		em1.sleep();
//		em1.walk();
//		em1.perform();
		
//		Student s2 = new Student();
//		
//		Student s1 = new Student("AB",112);
//		System.out.println(s1.getName());
//		s1.walk();
//		s1.sleep();
//		s1.sleep();
//		System.out.println(s1.toString());

	}

}
