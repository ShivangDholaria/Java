package LeetCode;

import java.util.HashMap;

/*
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 
 * The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
 * 
 * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
        * Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
        * Return k.
 */

public class RemoveDupFromSortedArray {

    public static int removeDupFromSortedArray_1(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    nums[k++] = nums[i];
                    i = j - 1;
                    break;
                }
                else
                    continue;
            }
        }
        nums[k] = nums[nums.length - 1];

        for (int j = 0; j < nums.length; j++) {
                System.out.println(nums[j]);
        }
        System.out.println();
        return k + 1;
    }

    //2nd Sol - optimized version
    public static int removeDupFromSortedArray_2(int[] nums) {
        int j = 1;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1])
                nums[j++] = nums[i];
        }

        for (int i = 0; i < nums.length; i++)
            System.out.println(nums[i]);

        return j;
    }

    //3rd sol - using hashmap
    public static int removeDupFromSortedArray_3(int[] nums)
    {
        int k = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(nums, 0) + 1);              //Creating Hashmap or all unique values
        }

        for (Integer key : map.keySet()) {                                      // Updating the array
            nums[k++] = key.intValue();
        }

        return map.size();
    }

    public static void main(String[] args) {
        int[] nums_1 = new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}; 
        int[] nums_2 = new int[] {1, 1, 2};
        
        System.out.println(removeDupFromSortedArray_3(nums_1));
        System.out.println(removeDupFromSortedArray_3(nums_2));
    }
}
