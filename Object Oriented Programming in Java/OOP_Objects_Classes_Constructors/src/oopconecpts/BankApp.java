package oopconecpts;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	    BankAccount ac1 = new BankAccount("", "Ali Murtaza", 500.0);
	    
	    String validatedIban = null;
	    while (validatedIban == null) {
	    	System.out.print("Enter Your IBAN Number: ");
	        String userIban = sc.nextLine();

	        validatedIban = ac1.ibanChecker(userIban);

	        if (validatedIban == null) {
	        	System.out.println("Please enter a valid IBAN.");
	            }
	        }
	        System.out.println("Valid IBAN: " + validatedIban);
	        
	        
	        
	     String validPin = null;   
	     while(validPin == null) {
	    	 System.out.print("Enter a valid pin: ");
	    	 String userPin = sc.nextLine();
	    	 
	    	 validPin = ac1.pinChecker(userPin);
	    	 
	    	 if (validPin == null) {
	    		 System.out.println("InvalidPin: ");
	    	 }
	     }
	     System.out.println("Valid: "+validPin);
	    
	        
		System.out.print("Deposite amount: ");
		double userDeposite = sc.nextDouble();
		ac1.deposite(userDeposite);
		//ac1.withdraw(500);
		//System.out.println("The IBAN is " + ac1.IBAN);
		System.out.println("The Account Title is " + ac1.accTitle);
		System.out.println("The Balance is " + ac1.accBalance);
	}

}


//PKHBIL001234567890123456
