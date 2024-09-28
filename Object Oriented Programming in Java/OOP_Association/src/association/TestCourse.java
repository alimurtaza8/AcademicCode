package association;

class Course{
	private String courseName;
	private String[] students = new String[100];
	private int noOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	public void addStudent(String student) {
		students[noOfStudents] = student;
		noOfStudents++;
	}
	public String [] getStudents() {
		return students;
	}
	public int getNoOfStudents() {
		return noOfStudents;
	}
	public String getCourseName() {
		return courseName;
	}
	
	public void dropStudent(String student) {
		
	}
	
//	public String toString() {
//		System.out.println("The no of students is " + getNoOfStudents() + " "
//		+ "and course name is " + getCourseName());
//		return courseName;
//	}
}
public class TestCourse {

	public static void main(String[] args) {

		Course course1 = new Course("Data Structures");
		Course course2 = new Course("Database Systems");
		
		course1.addStudent("Peter Jones");
		course1.addStudent("Kim Smith");
		course1.addStudent("Anne Kennedy");
		course1.addStudent("Ali");
		
		course2.addStudent("Peter Jones");
		course2.addStudent("Steve Smith");
		course2.dropStudent("Peter Jones");
		
		System.out.println("Number of students in course1: " + course1.getNoOfStudents());
		String[] students = course1.getStudents();
		for (int i = 0; i < course1.getNoOfStudents(); i++)
		System.out.print(students[i] + ", ");
		
		System.out.println();
		System.out.print("Number of students in course2: " + course2.getNoOfStudents());
		
	}

}
