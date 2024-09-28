package algorithm;

import java.util.*;

public class Algorithm {
	
	
	
	
	public static void main(String[] args) {
		
		
		
		// Hashing 
		
		String[] lst = new String[91];
	        
	    for (int i = 0; i < lst.length; i++) {
	    	lst[i] = "-";
	    }

	    Scanner sc = new Scanner(System.in);
	    String seatNum;

	    System.out.print("Enter seat num: ");
	    while (!(seatNum = sc.nextLine()).isEmpty()) {
	    	int i = Integer.parseInt(seatNum.substring(seatNum.length() - 3));
	        lst[i] = seatNum;
	        System.out.print("Enter seat num: ");
	    }
	        
	    for(String seat: lst) {
	    	System.out.println(seat);
	    }
	    
	    // For Search

	    
	    boolean found = false;
		
	    System.out.print("Enter element to found: ");
	    String search = sc.nextLine();
	    
	    for(int j = 0; j < lst.length; j++) {
	    	if(search==lst[j]) {
	    		System.out.println("Element " + search + " Found at index: " + j);
	    		found = true;
	    		break;
	    	}
	    }
	    if(!found) {
	    	System.out.println("Not found " + search + " at any index");
	    }

	    
	    
		// For Sorting list
		
//		int[] unsortedList = {10,4,6,2,1,8};
//		int size = unsortedList.length;
//		int[] sortedList = new int[size];
//				
//		for(int i = 0; i < size-1; i++) {
//		for(int j = 0; j < size -i-1; j++) {
//			if(unsortedList[j] > unsortedList[j+1]) {
//				int temp = unsortedList[j];
//				unsortedList[j] = unsortedList[j+1];
//				unsortedList[j+1] = temp;
//				}
//			}
//		}
//		for (int k = 0; k < size; k++) {
//			sortedList[k] = unsortedList[k];
//		}
//		System.out.println("Sorted Array: ");
//		for(int l : sortedList) {
//			System.out.println(l);
//		}
//		
		
		
		// linear Search 
		
//		Scanner sc = new Scanner(System.in);
//		
//		int[] arrList = {10,4,6,2,1,8};
//		int size = arrList.length;
//		
//		System.out.print("Enter element to found: ");
//		int userInput = sc.nextInt();
//		boolean con = false;
//		
//		for(int i = 0; i < size; i++) {
//			if(userInput == arrList[i]) {
//				System.out.println("Element " + userInput + " found at index: " + i);
//				con = true;
//				break;
//			}			
//		}
//		if(!con) {
//			System.out.println("Element: " + userInput + " Not found");
//		}

	}

}
