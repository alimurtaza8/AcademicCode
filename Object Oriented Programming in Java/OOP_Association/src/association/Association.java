package association;

class Student{
	String studentName;
	String id;
	Address studentAddress;
	College stCollegeAddress;
	Ocupation stOcupation;
	
	Student(String studentName, String id, Address studentAddress,College stCollegeAddress,
	Ocupation stOcupation){
		this.studentName = studentName;
		this.id = id;
		this.studentAddress = studentAddress;
		this.stCollegeAddress = stCollegeAddress;
		this.stOcupation = stOcupation;
	}
}

class Address{
	String city;
	String state;
	String country;
	int postalCode;
	
	Address(String city, String state, String country, int postalCode){
		this.city = city;
		this.state = state;
		this.country = country;
		this.postalCode = postalCode;
	}
}

class College{
	String collegeName;
	Address collegeAdress;
	
	College(String collegeName, Address collegeAddress){
		this.collegeName = collegeName;
		this.collegeAdress = collegeAddress;
	}
}

class Ocupation{
	String field;
	String programmingLanguage;
	String ide;
	
	Ocupation(String field, String programmingLanguage, String ide){
		this.field = field;
		this.programmingLanguage = programmingLanguage;
		this.ide = ide;
	}
}

public class Association {

	public static void main(String[] args) {
		
		Address ad1 = new Address("Karachi","Sindh","Pakistan",1234);
		Address collegeAddress = new Address("Mirpur","Sindh","Pak",999);
		College col1 = new College("S.A.L College",collegeAddress);
		Ocupation oc1 = new Ocupation("SE","Python","VSCode");
		Student s1 = new Student("unknown","B22110106008",ad1,col1,oc1);
		
		System.out.println("Student name is: " + s1.studentName  + " Student Address is: " + s1.studentAddress.city
		 + " country is: " + s1.studentAddress.country + " PostalCode is: " + s1.studentAddress.postalCode);
		
		System.out.println("And His College Name is :" + s1.stCollegeAddress.collegeName +
		", college city is: " + s1.stCollegeAddress.collegeAdress.city + " and college postalCode is: " +
		s1.stCollegeAddress.collegeAdress.postalCode);
		
		System.out.println("His Ocupation in field: " + s1.stOcupation.field + " and He is a: " + 
		s1.stOcupation.programmingLanguage + " programmer " + " And he also use " + s1.stOcupation.ide);
		
		
	}

}
