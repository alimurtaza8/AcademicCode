package encapsulationAndInheritance;


public class TestOverLoading {
	
	
	int add(int a, int b) {
		int c = a + b;
		System.out.println("From int");
		return c;
	}
	
	long add(long a, long b) {
		long c = a + b;
		System.out.println("From long");
		return c;
	}
	
	String add(String a, String b) {
		String c = a + b;
		System.out.println("From String");
		return c;
	}
	
	float add(float a, float b) {
		float c = a + b;
		System.out.println("From float");
		return c;
	}
	
	double add(double a, double b) {
		double c = a + b;
		System.out.println("From double");
		return c;
	}
	
	char add(char a, char b) {
		char c = 'a' + 'b';
		System.out.println("From char");
		return c;
	}
	
	
//	void runAlarm(int hour) {
//		System.out.println("I will run at " + hour);
//	}
//	
//	void runAlarm(int hour, int min) {
//		System.out.println("I will run at " + hour + " " + min);
//	}
//	
//	void runAlarm(int hour , int min , int sec) {
//		System.out.println("I will run at " + hour + " " + min + " " + sec);
//	}
	
	
	public static void main(String[] args) {

		TestOverLoading tol = new TestOverLoading();
		tol.add(10, 10.000);
		tol.add(100000000.00900008987079f, 12121.000807980f);
		
//		tol.runAlarm(10);
//		tol.runAlarm(11, 30);
//		tol.runAlarm(12, 0, 23);
		
		
		
		
		
		//System.out.println(tol.add(10000000012131l,210));
		
	}

}
