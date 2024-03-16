package LeetCode;

/*
 * Given an integer array nums, return true if there exists a triple of indices (i, j, k) 
 * such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.
 */

public class IncreasingTripletSubsequence {

    public static boolean increasingTriplet(int[] nums) {
        
        if(nums.length < 3) return false;
        
        int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE, ind_a = 0, ind_b = 0;

        for(int num = 0; num < nums.length; num++) {
            if(nums[num] <= a && ind_a <= num) {
                a = nums[num];
                ind_a = num;
            }
            else if(nums[num] <= b && ind_b <= num) {
                b = nums[num];
                ind_b = num;
            }
            else if(ind_a < ind_b && ind_b < num && (a < b && b < nums[num])) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 2, 3, 4, 5}, arr2 = new int[] {5, 4, 3, 2, 1}, arr3 = new int[] {2, 1, 5, 0, 4, 6}, arr4 = new int[] {20, 100, 10, 12, 5, 13};
        
        System.out.println(increasingTriplet(arr1));
        System.out.println(increasingTriplet(arr2));
        System.out.println(increasingTriplet(arr3));
        System.out.println(increasingTriplet(arr4));

    }
}
