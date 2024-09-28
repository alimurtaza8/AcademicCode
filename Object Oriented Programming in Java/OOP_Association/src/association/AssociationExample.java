package association;

//class CarClass{
//	String carName;
//	int id;
//	
//	CarClass(String carName, int id){
//		this.carName = carName;
//		this.id = id;
//	}
//}
//
//class Driver extends CarClass{
//	String driverName;
//	
//	Driver(String driverName, String carName, int id){
//		super(carName,id);
//		this.driverName = driverName;
//	}
//}


class Employees{
	String name;
	int id;
	String depart;
	
	Employees(String eName, int eId, String eDepart){
		this.name = eName;
		this.id = eId;
		this.depart = eDepart;
		System.out.println("Employee name is "+name+" Id is "+id+" Department is "+depart);
	}
}

class Department{
	String name; 
	String employee;
	
	Department(String n, String em){
		this.name = n;
		this.employee = em;
	}
}

class Organization{
	String officeName;
	String departments;
	
	Organization(String offn, String departs){
		this.officeName = offn;
		this.departments = departs;
	}
}

public class AssociationExample {

	public static void main(String[] args) {
		

		Employees s1 = new Employees("Mia", 1, "Sales");
		Employees s2 = new Employees("Priya", 2, "Marketing");
		Employees s3 = new Employees("John", 1, "IT");
		Employees s4 = new Employees("Rahul", 2, "Designing");
		
		
//		Driver obj = new Driver("Andy", "Ford", 9988);
//		System.out.println(obj.driverName+" is a driver of car Id: "+obj.id + " Car name is " 
//		+ obj.carName);
		
	}

}
