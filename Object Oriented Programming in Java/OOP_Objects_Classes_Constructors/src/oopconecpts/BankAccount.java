package oopconecpts;

class BankAccount {
	
	String IBAN;
	String accTitle;
	double accBalance;
	
	// Constructor
	BankAccount(String acn, String act, double acb){
		IBAN = acn;
		accTitle = act;
		accBalance = acb;
	}
	
	
	//Method
	 String ibanChecker(String userIban) {
	        String expectedCode = "PKHBIL00";

	        if (userIban.length() == 24 && userIban.startsWith(expectedCode)) {
	            System.out.println("Valid IBAN");
	            return userIban; 
	        } else {
	            System.out.println("Invalid IBAN");
	            return null; 
	        }
	    }

	 
	 //Method
	 
	 String pinChecker(String user) {
		 String pin = "1234";
		 if (user.equals(pin)) {
			 System.out.println("Valid Pin");
			 return user;
		 }
		 else {
			 System.out.println("Invalid Pin");
		 }	return null;
	 }
	 
	
	 
	 // Method
	
	 double withdraw(double amount) {
		 if(accBalance > 1000) 
			 accBalance = accBalance - amount;
		 else 
			 System.out.println("Insuficient Balance");
	
		 return accBalance;
	 }
	
	 // Method

	 void deposite(double amount) {
		 if (amount <= 100000)
			 if(amount >= 5000)
				 accBalance = accBalance + amount;
			 else {
				 System.out.println("Your Limite out of range");
			 }
		 else
			 System.out.println("Bank out of range");
	 }
}


