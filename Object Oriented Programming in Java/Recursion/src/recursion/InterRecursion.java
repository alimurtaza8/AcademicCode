package recursion;
// import java.util.HashSet;

public class InterRecursion {
    public static void main(String[] args){

        //Tower of Hanoi
        // int n = 3;
        // towerOfHanoi(n, "S", "H", "D");

        // print a string in reverse
        // String str = "abcd";
        // reverseString(str, str.length()-1);

        //Find the first and last occurance of an element
        // String str = "abaacdaefaah";
        // findOccurence(str, 0, 'a');

        //check if array is sorted(Strickly increasing)
        // int[] arr = {1,3,3,5};
        // System.out.println(isSorted(arr, 0));

        // move all 'x' to the end of the string
        // String str = "axbcxxd";
        // moverAllX(str, 0, 0, "");

         // remove duplicates in a string
        // String str = "abbccda";
        // removeDuplicates(str, 0, "");

        // print all subsequences of a String ------> important
        // String str = "abc";
        // subsequences(str, 0, "");

        // print all Unique subsequences of a String ------> important
        // HashSet<String> set = new HashSet<>();
        // String str = "aaa";
        // uniqueSubsequences(str, 0, "", set);

        // print keypad combinations
        String str = "2";
        printCombinations(str, 0, "");
    }


    // print keypad combinations

    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printCombinations(String str, int index, String combination){
        if(index == str.length()){
            System.out.println(combination);
            return;
        }

        char currChar = str.charAt(index);
        String mapping = keypad[currChar-'0'];
        for(int i=0; i < mapping.length(); i++){
            printCombinations(str, index+1, combination+mapping.charAt(i));
        }
    }


    // print all Unique subsequences of a String ------> important

    // public static void uniqueSubsequences(String str, int index, String newString,HashSet<String> set){
    //    if(index == str.length()){
    //     if(set.contains(newString)){
    //         return;
    //     }
    //     else{
    //         System.out.println(newString);
    //         set.add(newString);
    //         return;
    //     }
    //    }

    //     char currChar = str.charAt(index);
    //     // to be
    //     uniqueSubsequences(str, index+1, newString+currChar,set);
    //     // not to be
    //     uniqueSubsequences(str, index+1, newString,set);
    // }

    // // print all subsequences of a String ------> important

    // public static void subsequences(String str, int index, String newString){
    //     if(index == str.length()){
    //         System.out.println(newString);
    //         return;
    //     }

    //     char currChar = str.charAt(index);
    //     // to be
    //     subsequences(str, index+1, newString+currChar);
    //     // not to be
    //     subsequences(str, index+1, newString);
    // }


    // remove duplicates in a string

    // public static boolean[] map = new boolean[26];

    // public static void removeDuplicates(String str, int index, String newString){
    //     if(index == str.length()){
    //         System.out.print(newString);
    //         return;
    //     }

    //     char currChar = str.charAt(index);
    //     if(map[currChar-'a']){
    //         removeDuplicates(str, index+1, newString);
    //     }
    //     else{
    //         newString+=currChar;
    //         map[currChar-'a'] = true;
    //         removeDuplicates(str, index+1, newString);
    //     }
    // }

    // move all 'x' to the end of the string

    // public static void moverAllX(String str, int index,int count,String newString){
    //     if(index == str.length()){
    //         for(int i = 0; i < count; i++){
    //             newString+='x';
    //         }
    //         System.out.print(newString);
    //         return;
    //     }
    //     char currChar = str.charAt(index);
    //     if(currChar == 'x'){
    //         count++;
    //         moverAllX(str, index+1,count,newString);
    //     }
    //     else{
    //         newString+=currChar;
    //         moverAllX(str, index+1, count, newString);
    //     }
    // }

    //check if array is sorted(Strickly increasing)

    // public static boolean isSorted(int[] arr, int index){
    //     if(index == arr.length-1){
    //         return true;
    //     }
    //     if(arr[index] < arr[index+1]){
    //         return isSorted(arr, index+1);
    //     }
    //     else{
    //         return false;
    //     }
    // }


    //Find the first and last occurance of an element

    // public static int first = -1;
    // public static int last = -1;

    // public static void findOccurence(String str, int index,char element){
    //     if(index == str.length()){
    //         System.out.println(first);
    //         System.out.println(last);
    //         return;
    //     }
    //     char currChar = str.charAt(index);
    //     if(currChar == element){
    //         if(first == -1){
    //             first = index;
    //         }
    //         else{
    //             last = index;
    //         }
    //     }
    //     findOccurence(str, index + 1, element);

    // }

    // print a string in reverse

    // public static void reverseString(String str, int index){
    //     if(index == 0){
    //         System.out.print(str.charAt(index) + "");
    //         return;
    //     }
    //   System.out.print(str.charAt(index) + "");
    //   reverseString(str, index-1);
    // }

    //Tower of Hanoi

    // public static void towerOfHanoi(int n, String src,String helper,String dest){
    //     if(n==1){
    //         System.out.println("tranfer disk " + n + " from " + src + " to " + dest);
    //         return;
    //     }
    //     towerOfHanoi(n-1, src, dest, helper);
    //     System.out.println("tranfer disk " + n + " from " + src + " to " + dest);
    //     towerOfHanoi(n-1, helper, src, dest);
    // }
    
}
