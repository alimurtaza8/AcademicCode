package encapsulationAndInheritance;

class BankAccount{
	private String IBAN;
	private String accTitle = "unknown";
	private double accBalance = 500.0;

	double withdraw(double amount){
		accBalance = accBalance - amount ;
		return accBalance;
	}
	void deposit(double amount){
		this.accBalance = this.accBalance + amount;
	}

	public BankAccount(String acn, String act){
		this.IBAN = acn;
		this.accTitle = act;
	}
	
	private BankAccount(){
		System.out.println("constructor have Encapsulation");
	}
	
	public BankAccount(String acn, String act, double acb){
		
		this(acn, act);
		this.accBalance = acb;
		
	}

	public void setIBAN(String n){
		this.IBAN = n;
	}
	public String  getIBAN(){
		return this.IBAN;
	}

	public void setAccBalance(double newBalance){
		if(newBalance >=0)
		this.accBalance = newBalance;
		else System.out.println("Balance cannot be negative");
	}
	public double  getAccBalance(){
		return this.accBalance;
	}

	public void setAccTitle(String n){
		this.accTitle = n;
	}
	public String  getAccTitle(){
		return this.accTitle;
	}

}




public class EncapsulationAndInheritance {
	public static void main(String args[]) {
	
//		BankAccount a1 = new BankAccount("PK60HBL12345", "Sohaib", 5500);
//		System.out.println(a1.getAccBalance());
//		a1.setAccBalance(-5000000.0);
//		a1.setIBAN("hello how are you");
//		a1.deposit(6000.0);
//		System.out.println(a1.getAccBalance());
//		System.out.println(a1.getIBAN());
		
		//BankAccount a = new BankAccount();
		
		BankAccount a2 = new BankAccount("PK60HBL12345", "Ali", 1000);
		System.out.println(a2.getAccBalance());
		a2.setAccBalance(2000);
		a2.getIBAN();
		a2.getAccTitle();
		a2.deposit(6000);
		System.out.println(a2.getAccBalance());
		System.out.println(a2.getIBAN());
		System.out.println(a2.getAccTitle());
		System.out.println(a2.withdraw(600));
	}
}
