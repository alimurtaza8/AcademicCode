package algorithm;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		int[] arr2 = {4,2,5,9,7,4,8};
		int[] arr1 = {5,6,2,7,4};
		System.out.println(maxProductDifference(arr1)); // [2,4,5,6,7] pick = [2,4],[7,6]
		System.out.println(maxProductDifference(arr2));// // [2,4,4,5,7,8,9] = [2,4] ,[9 ,8]
	}
	public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int max1 = nums[nums.length-1];
        System.out.println(max1);
        int max2 = nums[nums.length-2];
        System.out.println(max2);
        int min1 = nums[0];
        System.out.println(min1);
        int min2 = nums[1];
        System.out.println(min2);
        return(max1 *  max2) - (min1 * min2);
	}

}
