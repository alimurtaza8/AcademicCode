package algorithm;

public class Sortings {

	public static void main(String[] args) {
	
		// merged sort
		int[] arr = {6,3,9,5,2,8};
		int n = arr.length;
		divide(arr, 0, n-1);

		for(int i=0; i<arr.length; i++){
			System.err.print(arr[i] + " ");
		}

		// Quick sort ---> pivot and partition
		int[] arr = {6,3,9,5,2,8};
		int n = arr.length;
		quickSort(arr, 0, n-1);

		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}


	//Quick sort ---> pivot and partition

	public static int partition(int[] arr, int low, int high){
		int pivot = arr[high];
		int i = low-1;

		for(int j=low; j<high; j++){
			if(arr[j] < pivot){
				i++;
			}
			//swap
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		//swap with pivot 
		i++;
		int temp = arr[i];
		arr[i] =  pivot;
		pivot = temp;

		return i;
	}

	public static void quickSort(int[] arr, int low, int high){
		if(low < high){
			int pivot = partition(arr,low,high);

			quickSort(arr, low, pivot-1);
			quickSort(arr, pivot+1, high);
		}
	}


	
	//merged sort ---> divide and conqure approach

	public static void conqure(int[] arr, int si, int mid, int ei){
		int[] merged = new int[ei-si+1];
		int idx1 = si;
		int idx2 = mid+1;
		int x = 0;
		while(idx1 <= mid && idx2 <= ei){
			if(arr[idx1] < arr[idx2]){
				merged[x++] = arr[idx1++];
			}
			else{
				merged[x++] = arr[idx2++];
			}
		}

		while (idx1 <= mid) {
			merged[x++] = arr[idx1++];
		}
		while(idx2 <= ei){
			merged[x++] = arr[idx2++];
		}

		for(int i=0, j=si; i<merged.length; i++,j++){
			arr[j] = merged[i];
		}

	}
	public static void divide(int[] arr,int si,int ei){
		if(si>=ei){
			return;
		}

		int mid = si + (ei - si)/2;
		divide(arr, si, mid);
		divide(arr, mid+1, ei);
		conqure(arr,si,mid,ei);
	}



		// bubble sort
		
		int[] array = {7,8,3,1,2};
		
		for(int i=0; i < array.length-1; i++) {
			for(int j = 0; j < array.length-1-i; j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
	}	
		// Selection sort
		
		int[] array = {7,8,3,1,2};
		int[] array = {3,2,4,6,5};

		for(int i=0; i<array.length-1; i++) {
			int smallest = i;
			for(int j = i+1; j<array.length; j++) {
				if(array[smallest] > array[j]) {
					smallest = j;
				}
			}
			int tem = array[smallest];
			array[smallest] = array[i];
			array[i] = tem;
		}
		for(int n:array){
			System.out.print(n + " ");
		}
		
		
		// Insertion Sort
		
		int[] array = {7,8,3,1,2};
		
		for (int i=0; i<array.length; i++) {
			int current = array[i];
			int j = i -1;
			while(j >=0 && current < array[j]) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = current;
		
		}
		
		printArray(array);

	}
	
	public static void printArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}


}