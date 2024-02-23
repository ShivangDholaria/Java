package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 */

public class ContainsDuplicate {

    //1st Sol - Sort and search
    public static boolean containsDuplicate_1(int[] nums) {
        
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1; i++)
        {
            if(nums[i] == nums[i + 1])
                return true;
        }

        return false;
    }

    //2nd Sol - Set
    public static boolean containsDuplicate_2(int[] nums) {
        Set<Integer> int_Set = new HashSet<Integer>();

        for(int i = 0; i < nums.length; i++) {
            if(int_Set.contains(nums[i])) return true;
            int_Set.add(nums[i]);
        }

        return false;
    }
    
    public static void main(String[] args) {
        int[] arr1 = new int[] {1,2,3,1};

        System.out.println(containsDuplicate_1(arr1));
        System.out.println(containsDuplicate_2(arr1));
    }
}
