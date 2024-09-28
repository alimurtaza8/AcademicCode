package recursion;
import java.util.ArrayList;

public class AdvanceRecursion {
    public static void main(String[] args){

        // print all permutations of a String
        // String str = "abc";
        // printPermutations(str, "");  

        
        // count totall paths in a maxe to move from (0,0) to (n,m)
        // int n = 3;
        // int m = 3;
        // System.out.println(countPaths(0, 0, n, m));

        // place tiles of size 1xm in a floor of size nxm
        // int n = 4; 
        // int m = 2;
        // System.out.println(placeTiles(n, m));

        // find number of ways to call guests in single or pair
        // int n = 4;
        // System.out.println(callGuests(n));

        // print all subsets of a set of n natural numbers
        int n = 3;
        ArrayList<Integer> subsets = new ArrayList<>();
        findSubsets(n, subsets);
    }


    // print all subsets of a set of n natural numbers

    public static void printSubset(ArrayList<Integer> subsets){
        for(int i=0; i < subsets.size(); i++){
            System.out.print(subsets.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer> subsets){
        if(n == 0){
            printSubset(subsets);
            return;
        }

        // add
        subsets.add(n);
        findSubsets(n-1, subsets);
        // not add
        subsets.remove(subsets.size()-1);
        findSubsets(n-1, subsets);
    }

    // find number of ways to call guests in single or pair

    // public static int callGuests(int n){
    //     if(n<=1){
    //         return 1;
    //     }

    //     //single
    //     int ways1 = callGuests(n-1);
    //     //pair
    //     int ways2 = (n-1) * callGuests(n-2);
    //     return ways1 + ways2;
    // }


    // place tiles of size 1xm in a floor of size nxm

    // public static int placeTiles(int n, int m){
    //     if(n==m){
    //         return 2;
    //     }
    //     if(n<m){
    //         return 1;
    //     }

    //     // verticall
    //     int verticallPlacements = placeTiles(n-m, m);
    //     // horizontal
    //     int horizontalPlacements = placeTiles(n-1, m);
    //     return verticallPlacements + horizontalPlacements;
    // }

    // count totall paths in a maxe to move from (0,0) to (n,m)

    // public static int countPaths(int i, int j, int n, int m){
    //     if(i == n || j == m){
    //         return 0;
    //     }
    //     if(i == n-1 && j == m-1){
    //         return 1;
    //     }

    //     //move downwards
    //     int downPaths = countPaths(i+1, j, n, m);
    //     // move right
    //     int rightPaths = countPaths(i, j+1, n, m);
    //     return downPaths + rightPaths;
    // }

    // print all permutations of a String

    // public static void printPermutations(String str, String permutation){
    //     if(str.length() == 0){
    //         System.out.println(permutation);
    //         return;
    //     }

    //     for(int i=0; i < str.length(); i++){
    //         char currChar = str.charAt(i);
    //         String newString = str.substring(0, i) + str.substring(i+1);
    //         printPermutations(newString, permutation + currChar);
    //     }
    // }
}
