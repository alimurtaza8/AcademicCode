package innerclasses;

class OuterClass{
	private int value = 1;
	
	class InnerClass{
		void seeOuter(){
			System.out.println(value);
		}
	}
}

class CPU {
	private static double price = 1000;
	
// nested class
	class Processor{
// members of nested class
		double cores;
		String manufacturer;
	private	static double price;
		
		double getCache(){
			return 4.3;
		}
		
		public void setPrice(double price) {
			Processor.price = price;
		}
	}
// nested protected class
	protected class RAM{
// members of protected nested class
		double memory;
		String manufacturer;
	private	static double price;
		
	double getClockSpeed(){
		return 5.5;
		}
	public void setPrice(double price) {
		RAM.price = price;
	}
	
	}
	public void setPrice(double price) {
		CPU.price = price;
	}
	
	 double getTotalCpuPrice() {
		return CPU.price + Processor.price + RAM.price;
	}
}


public class TestInnerClasses {

	public static void main(String[] args) {
		
		// create object of Outer class CPU
		CPU cpu = new CPU();
		// create an object of inner class Processor using outer class
		CPU.Processor processor = cpu.new Processor();
		CPU.RAM ram1 = cpu.new RAM();
		// create an object of inner class RAM using outer class CPU
		CPU.RAM ram = cpu.new RAM();
		System.out.println("Processor Cache = " + processor.getCache());
		System.out.println("Ram Clock speed = " + ram.getClockSpeed());
		
//		CPU.price = 2000;
//		CPU.Processor.price = 100;
//		CPU.RAM.price = 50;
		cpu.setPrice(2000);
		ram.setPrice(1000);
		processor.setPrice(1500);
		
		System.out.println("Total price of CPU is: " + cpu.getTotalCpuPrice());
		
		
		
		OuterClass outr = new OuterClass();
		OuterClass.InnerClass inn = outr.new InnerClass();
		inn.seeOuter();
		
		
	}

}
