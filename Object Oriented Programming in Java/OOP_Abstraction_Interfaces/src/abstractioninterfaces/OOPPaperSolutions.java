package abstractioninterfaces;

interface Livestock{
	
}
abstract class Bird implements Livestock{
	
}
class Chicken extends Bird{
	
}

public class OOPPaperSolutions {

	public static void main(String[] args) {
		
		Livestock l = new Chicken();
		Bird b = new Chicken();
		Chicken C = new Chicken();
//		Bird b1 = new Bird(); // Error
//		Livestock l1 = new Bird(); // error
//		Livestock l2 = new Livestock(); // error
		
		
	}

}
