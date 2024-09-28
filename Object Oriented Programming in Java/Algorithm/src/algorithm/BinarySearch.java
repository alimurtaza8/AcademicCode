package algorithm;

public class BinarySearch {
    public static void main(String args[]){

        int[] array = {1,2,3,4,5,6,7,8,9};
        int find = 5;
        int result = binarySearch(array, find);
        System.out.println(result);
    }
    public static int binarySearch(int[] array,int find){
        int low = 0;
        int high = array.length-1;
        int mid;

        while(low <= high){
            mid = low + (high-low)/2;
            if(array[mid]==find){
                return mid;
            }
            else if(array[mid] < find){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
}
