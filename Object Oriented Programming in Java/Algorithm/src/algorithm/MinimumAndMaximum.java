package algorithm;


public class MinimumAndMaximum {

	public static void main(String[] args) {
		
		int[] array = {4,1,5,2,3};
		int minElement = array[0];
		int maxElement = array[0];
		
		for(int i=0; i<array.length-1;i++) {
			if(array[i] < minElement) {
				minElement = array[i];
			}
		}
		
		for(int j=0; j<array.length-1;j++) {
			if(array[j] > maxElement) {
				maxElement = array[j];
			}
		}
		System.out.println("Minimum element is: " + minElement);
		System.out.println("Maximum element is: " + maxElement);
	
		
	}
		
}
