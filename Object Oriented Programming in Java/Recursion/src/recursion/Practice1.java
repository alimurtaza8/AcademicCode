package recursion;

public class Practice1 {
    public static void main(String args[]){

        // int[] array = {2,4,6,8};
        // int n = array.length;
        // System.out.println(calculateSumOfArraysElements(n-1, array));

        // System.out.println(xMethod(5));
           
        // xMethod(5);
        nPrintln("Hi", 5);
    }

    public static void nPrintln(String message, int times) {
        if (times >= 1) {
        System.out.println(message);
        nPrintln(message, times - 1);
        } // The base case is times == 0
        }


    // public static void xMethod(int n) {
    //     if (n > 0) {
    //     xMethod(n - 1);
    //     System.out.print(n + " ");
    //     }
    //     }

    // public static void xMethod(int n) {
    //     if (n > 0) {
    //     System.out.print(n + " ");
    //     xMethod(n - 1);
    //     }
    // }
   
        // public static int xMethod(int n) {
        // if (n == 1)
        //     return 1;
        // else
        //     return n + xMethod(n - 1);
        // }

    // // calculate sum of array elements

    // public static int calculateSumOfArraysElements(int n, int[] arr){
    //     if(n < 0){
    //         return 0;
    //     }
    //     return arr[n] + calculateSumOfArraysElements(n-1, arr);
    // }    
}


