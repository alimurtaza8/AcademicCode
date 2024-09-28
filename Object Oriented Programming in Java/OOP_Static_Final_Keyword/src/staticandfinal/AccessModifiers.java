package staticandfinal;

class Examples{
	private int num1;
	 int num2;
	
	int getNum1() {
		return num1;
	}
	void setNum1(int newNum1) {
		num1 = newNum1;
	}
	 
	void add() {
		int sum = num1 + num2;
		System.out.println(sum);
	}
	
}

public class AccessModifiers {
	public static void main(String[] args) {
		
		Examples e = new Examples();
		
		e.setNum1(10);
		e.num2 = 10;
		e.add();
		
	}

}
