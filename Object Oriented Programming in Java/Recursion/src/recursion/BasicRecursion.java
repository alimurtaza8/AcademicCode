package recursion;

public class BasicRecursion {

	public static void main(String[] args) {
		
		// print numbers from 5 to 1
//		printNumbers(5);
		
		
		// print numbers from 1 to 5
//		printNumbers(1);
		
		
		// sum of first n natural numbers
//		printSumOfNaturalNumbers(1,5,0);
		
		
		//find factorial
		
//		System.out.println(calculateFactorial(5));
		
		// print fibonacci sequence
//		int a = 0;
//		int b = 1;
//		int c = a + b;
//		System.out.println(c);
//		printFib(a,b,5);
		
		
		// print x^2 (stack height = n)
		
//		System.out.println(calPower(2,5));
		
		//print x^2 (stack height = logn)

		long first = System.nanoTime();
		long nd = System.nanoTime();

		System.out.println(calPower(2,5));

		double cal = (nd-first)/10000000;
		System.out.println(cal);
	}
	
	 //print x^2 (stack height = logn)
	
	public static int calPower(int x,int n) {
		if(n==0) {
			return 1;
		}
		if(x==0) {
			return 0;
		}
		if(n%2==0) {
			int calpower = calPower(x,n/2) * calPower(x,n/2);
			return calpower;
		}
		else {
			int calpower = calPower(x,n/2) * calPower(x,n/2) * x; 
			return calpower;
		}
	}
	
	
	
	
	// print x^2 (stack height = n)
	
//	public static int calPower(int x,int n) {
//		if(n==0) {
//			return 1;
//		}
//		if(x==0) {
//			return 0;
//		}
//		int calPower = calPower(x,n-1);
//		int power = x * calPower;
//		return power;
//	}
	
	
	
	// print fibonacci sequence
	
//	public static void printFib(int a , int b , int n) {
//		if(n==0) {
//			return;
//		}
//		int c = a + b;
//		System.out.println(c);
//		printFib(b,c,n-1);
//	}
	
	
	
	//find factorial
	
//	public static int calculateFactorial(int n) {
//		if(n==1 || n==0) {
//			return 1;
//		}
//		int calFact1 = calculateFactorial(n-1);
//		int fact = n * calFact1;
//		return fact;
//	}
	
	
	// sum of first n natural numbers
	
//	public static void printSumOfNaturalNumbers(int i,int n,int sum) {
//		if(i==n) {
//			sum+=i;
//			System.out.println(sum);
//			return;
//		}
//		sum+=i;
//		printSumOfNaturalNumbers(i+1,n, sum);
//	}
	
	
	
	// print numbers from 1 to 5
	
//		public static void printNumbers(int n) {
//			if(n==6) {
//				return;
//			}
//			System.out.println(n);
//			printNumbers(n+1);
//		}
	
	
	
	
	
	// print numbers from 5 to 1
	
//	public static void printNumbers(int n) {
//		if(n==0) {
//			return;
//		}
//		System.out.println(n);
//		printNumbers(n-1);
//
//	}
	
	

}
