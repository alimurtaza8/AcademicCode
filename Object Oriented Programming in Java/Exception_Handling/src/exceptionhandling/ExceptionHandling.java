package exceptionhandling;

import java.util.*;
import java.io.*;

public class ExceptionHandling {
	

	public static void main(String[] args) {
		
		try{
			int a[]=new int[7];
			a[4]=30/0;
			System.out.println("First print statement in try block");
			}
			catch(ArithmeticException e){
			System.out.println("Warning: ArithmeticException");
			}
			catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Warning: ArrayIndexOutOfBoundsException");
			}
			catch(Exception e){
			System.out.println("Warning: Some Other exception");
			}
			System.out.println("Out of try-catch block...");
		
		
		
		
//		try {
//			int a = 30, b = 0;
//			int c = a/b; // cannot divide by zero
//			System.out.println ("Result = " + c);
//			}
//			catch(ArithmeticException e) {
//			System.out.println ("Can't divide a number by 0");
//			}
//		
//		
//		try {
//			String str = null;
//			System.out.println(str.length());
//			}
//		catch(ArithmeticException e) {
//			System.out.println(e);
//		}
//		System.out.println("Hi");
		
//		try {
//	        addInteger(1);
//	    } catch (IllegalArgumentException iae) {
//	        iae.printStackTrace();
//	    }
		
		
//		displayAge(11);
		
	
		
//		try {
//	        writeToFile();
//	    } catch (IOException ioe) {
//	        ioe.printStackTrace();
//	    }
//		
		
		
		
//		 try {
//	            someMethod(-1);
//	        } 
//		 catch (IllegalArgumentException e) {
//	            System.out.println("Caught exception: " + e.getMessage());
//	        } 
//		 finally {
//	            System.out.println("Finally block executed.");
//	        }
//	    
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter num: ");
//		int num = sc.nextInt();
//		
//		checkNum(num);
//		
//        System.out.println("Rest of the code..");  
//		Scanner sc = new Scanner(System.in);
//		int[] arrayList = {1,2,3,4,5,6};
//		
//		try {
//			System.out.print("Enter num to check ");
//			int numCheck = sc.nextInt();
//			int x = arrayList[numCheck];
//			System.out.println("Found num at index " + x);
//		}
//		
//		catch(InputMismatchException e) {
//			System.out.println("Error is " + e);
//			sc.next();
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e);
//		}
//		catch(Exception e) {
//			System.out.println("Index out of bound");
//			System.out.println(e);
//		}
//	
//		System.out.print("Enter number for calculation: ");
//		int userValue = sc.nextInt();
//		System.out.print("Enter number for calculation: ");
//		int userValue1 = sc.nextInt();
//		int sum = userValue + userValue1;
//		System.out.println("The code after the exception is: " + sum);
//		
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		int array[][] = {{10,2,4,8},{20,4,6,8}};
//		System.out.println(array.length);
//		
//		try {
//			double div = array[0][1]/array[2][0];
//			System.out.println("Division of " + array[0][1] + " and " + array[1][1] + " is " + div);
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Array error");
//			System.out.println(e);
//		}
//		
//		catch(Exception e) {
//			System.out.println("Error");
//			System.out.println(e);
//		}
		
	
		
//		try {
//			System.out.print("Enter numerator: ");
//			double x = sc.nextDouble();
//			System.out.print("Enter denomenator: ");
//			double y = sc.nextDouble();
//			double result = x/y;
//			System.out.println("Division of " + x + " and " + y + " is " + result);
//		}
//		
//		catch(ArithmeticException e) {
//			System.out.println("Error Ocurred!");
//			//System.out.println(e);
//		}
//		
//		catch(InputMismatchException e) {
//			System.out.println("Error");
//			//System.out.println(e);
//		}
//		
//		catch(Exception e) {
//			System.out.println("General Error");
//			//System.out.println(e);
//		}
//		
//		System.out.println("Out from Exception");
		
		
	
	
//	public static void checkNum(int num) {
//		if(num < 1) {
//			throw new ArithmeticException ("\nNumber is negative, cannot calculate square");
//		}
//		else {
//			System.out.println("The Square of a number: " + num + " is " +num*num);
//		}
//	}
		
//	public static void someMethod(int value) {
//        if (value < 0) {
//            //throw new IllegalArgumentException("Value cannot be negative");
//        	System.out.println(("Value cannot be negative"));
//
//        }
//

		
		 
		 
		 
	

//public static void writeToFile() throws IOException {
//    BufferedWriter bw = new BufferedWriter(new FileWriter("myfile.txt"));
//    bw.write("Test");
//    bw.close();
//}
	
//	private static List<Integer> integers = new ArrayList<Integer>();
//
//	public static void addInteger(Integer value) throws IllegalArgumentException {
//	    if (integers.contains(value)) {
//	        throw new IllegalArgumentException("Integer already added.");
//	    }
//	    integers.add(value);
//	}
	
	
	public static void displayAge(int age) {
		if(age < 18) {
			throw new ArithmeticException("Access denied - You must be at least 18 years old."); 
		}
		else {
			System.out.println("ok");
		}
	}
	}
	
}
