package oopclasses;

abstract class Bank{
	public String name;
	public int ID;
	
//	abstract public void currentAccount();
//	abstract public void savingAccount();
	abstract public String toString();
}

class CurrentAccount extends Bank{
	private String accountHolderName;
	private int accID;
	private int pinCode;
	private float balance;
	public final int SIZE = 100;
	public static int[] accounts;
	
	CurrentAccount(String accounHolderName, int accID, int pinCode, float balance){
		this.accountHolderName = accounHolderName;
		this.accID = accID;
		this.pinCode = pinCode;
		this.balance = balance;
		accounts = new int [SIZE];
	}
	
	public void currentAccount(int accID) {
		for(int i=0; i<accounts.length; i++) {
			accounts[i] = -1;
		}
		if(accID == this.accID) {
			System.out.println("Welcome to Current Account");
			int i=0;
			while(accounts[i] != -1) {
				i++;
			}
			accounts[i] = accID;
			this.balance += 500.0;
		}	
	}
	
	public String getAccountName() {
		return this.accountHolderName;
	}
	
	public int getID() {
		return this.accID;
	}
	
	public int getPinCode() {
		return this.pinCode;
	}
	
	public float balance() {
		return this.balance;
	}
	
	public String toString() {
		return "Account name is " + getAccountName() + " ID is " + getID()
		+ " " + balance();
	}
	
	public static void getUsers() {
		int i = 0;
		while(accounts[i] != -1) {
			System.out.println(accounts[i]);
			i++;
		}
	}

}



public class BankAccount {

	public static void main(String[] args) {
		
		CurrentAccount person1 = new CurrentAccount("P1",101,1010,1000);
		System.out.println(person1.toString());
		person1.currentAccount(101);
		CurrentAccount.getUsers();
		System.out.println(person1.toString());
		
		CurrentAccount person2 = new CurrentAccount("P1",102,110,1000);
		System.out.println(person2.toString());
		person2.currentAccount(102);
		CurrentAccount.getUsers();
		System.out.println(person2.toString());

	}

}
