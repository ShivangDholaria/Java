package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

/*
 * You are given an integer array nums and an integer k.
 * In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
 * Return the maximum number of operations you can perform on the array.
 */

public class MaxNumberofKSumPairs {

    // 1st Sol - 2 pointer
    public static int maxOperations_1(int[] nums, int k) {
        int count = 0, n = nums.length;
        
        Arrays.sort(nums);
        int i = 0, j = n - 1;
        
        while (i < j) {
            if (nums[i] + nums[j] == k) {
                i++;
                j--;
                count++;
            } else if (nums[i] + nums[j] < k) {
                i++;
            } else {
                j--;
            }
        }
        return count;
    }

    // 2nd Sol - HashMap
    public static int maxOperations_2(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(k - nums[i])) {
                count++;
                map.put(k - nums[i], map.get(k - nums[i]) - 1);
                if (map.get(k - nums[i]) == 0)
                    map.remove(k - nums[i]);
            } else {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 2, 3, 4 }, arr2 = new int[] { 3, 1, 3, 4, 3 };
        int k1 = 5, k2 = 6;

        System.out.println(maxOperations_2(arr1, k1));
        System.out.println(maxOperations_2(arr2, k2));
    }
}
