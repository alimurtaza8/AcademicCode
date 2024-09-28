package encapsulationAndInheritance;

public class TestEncapsulationObject {
	
	private int mood = 50;
	private int hungry = 50;
	private int energy = 50;
	
	public void sleep() {
		System.out.println("Sleep----");
		hungry++;
		energy++;
	}
	public void play() {
		System.out.println("play----");
		mood++;
		energy--;
		meow();
	}
	public void eat() {
		System.out.println("Eat-----");
		hungry--;
		mood++;
		meow();
	}
	public void meow() {
		System.out.println("Meow");
	}
	public int getMood() {
		return mood;
	}
	public int getHungry() {
		return hungry;
	}
	public int getEnergy() {
		return energy;
	}

	public static void main(String[] args) {
		
		TestEncapsulationObject cat = new TestEncapsulationObject();
		cat.eat();
		cat.play();
		cat.eat();
		cat.sleep();
		System.out.println("Energy: " + cat.getEnergy());
		System.out.println("Mood: " + cat.getMood());
		System.out.println("Hungry: " + cat.getHungry());
	}
}
