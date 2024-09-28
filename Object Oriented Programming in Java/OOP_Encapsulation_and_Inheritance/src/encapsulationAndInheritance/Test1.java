package encapsulationAndInheritance;

 class A{
	private int var1;
	private int var2;
	protected int var3;
	
	A(){
		
	}
	
	protected A(int a, int b , int c){
		this.var1 = b;
		this.var2 = a;
		this.var3 = c;
		
	}
	
	public void setVar(int var1,int var2, int var3) {
		this.var1 = var1;
		this.var2 = var2;
		this.var3 = var3;
	}
	
	public int getVar1() {
		return var1;
	}
	public int getVar2() {
		return var2;
	}
	public int getVar3() {
		return var3;
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		
		A a = new A(20,30,50);
		
		//a.setVar(12, 20, 30);
		System.out.println(a.getVar1());
		System.out.println(a.getVar2());
		System.out.println(a.getVar3());
		System.out.println(a.var3);

	
	}

}
