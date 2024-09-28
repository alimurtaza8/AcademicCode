package bitoperator;

public class TestBitOperator {

	public static void main(String[] args) {
		int n = 5;
		int pos = 3;
		int bitMask = 1<<pos;
		//System.out.println(bitMask);
		if((bitMask & n) == 0) {
			System.out.println("bit was zero");
		}
		else {
			System.out.println("bit was one");
		}
	}

}
