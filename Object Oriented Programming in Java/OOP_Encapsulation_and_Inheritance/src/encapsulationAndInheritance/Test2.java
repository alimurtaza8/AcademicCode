package encapsulationAndInheritance;

public class Test2 {

	private int var1;
	private int var2;
	protected int var3;
	
	 Test2(){
		System.out.println("Private constructor");
	}
	
	private Test2(int var1, int var2, int var3){
		this.var1 = var1;
		this.var2 = var2;
		this.var3 = var3;
	}
	
	private void setVar(int var1,int var2, int var3) {
		this.var1 = var1;
		this.var2 = var2;
		this.var3 = var3;
	}
	
	private int getVar1() {
		return var1;
	}
	private int getVar2() {
		return var2;
	}
	private int getVar3() {
		return var3;
	}
	public static void main(String[] args) {

//		Test2 t = new Test2();
//		Test2 t1 = new Test2(20,30,40);
//		
//		t1.setVar(100, 220, 330);
//		System.out.println(t1.getVar1());
//		System.out.println(t1.getVar2());
//		System.out.println(t1.getVar3());

		
		A a1 = new A();
		a1.setVar(100, 220, 330);
		System.out.println(a1.getVar1());
		a1.var3 = 12;
		System.out.println(a1.var3);
	}

}
