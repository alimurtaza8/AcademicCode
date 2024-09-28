package staticandfinal;

public class StaticBlock {
//	static int sum = 0;
//	static int val1 = 5;
//	static int val2;

//	static int num;
//	static String mystr;
//	//First Static block
//	static{
//	System.out.println("Static Block 1");
//	num = 68;
//	mystr = "Block1";
//	}
//	//Second static block
//	static{
//	System.out.println("Static Block 2");
//	num = 98;
//	mystr = "Block2";
//	}
	
	static int i = 100;
	static String s = "Beginnersbook";
	//Static method
	static void display()
	{
	System.out.println("i:"+i);
	System.out.println("i:"+s);
	}
	//non-static method
	void funcn()
	{
	//Static method called in non-static method
	display();
	}
	
	public static void main(String[] args) {
//		System.out.println("In main function, val1: " + val1 + " val2: "+ val2 + " sum:" + sum);

//		System.out.println("Value of num: "+num);
//		System.out.println("Value of mystr: "+mystr);
		
		
		StaticBlock obj = new StaticBlock();
		//You need to have object to call this non-static method
		obj.funcn();
		//Static method called in another static method
		display();
	}
	
//	static {
//		sum = val1 + val2;
//		System.out.println("In static block, val1: " + val1 + " val2: "+ val2 + " sum:" + sum);
//		val2 = val1 * 3;
//		sum = val1 + val2;
//		}

}
