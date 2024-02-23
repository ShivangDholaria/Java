package LeetCode;

import java.util.Arrays;
import java.util.HashSet;

/*
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 * You must write an algorithm that runs in O(n) time.
 */

public class LongestConsecutiveSequence {

    //1st sol - Using arrays
    public static int longestConsecutive_1(int[] nums) {
        
        if(nums.length == 0)
        return 0;
        if(nums.length == 1)
        return 1;
        
        Arrays.sort(nums);
        
        int count = 0, currCount = 0;
        
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] - nums[i - 1] == 0)
                continue;
            else if(nums[i] - nums[i - 1] == 1)
                currCount++;
            else
                currCount = 0;

            count = Math.max(currCount, count);
        }

        return count + 1;
    }

    //2nd sol - using HashSet
    public static int longestConsecutive_2(int[] nums) {
        HashSet<Integer> map = new HashSet<>();

        for (int i : nums) map.add(i);

        int max = 0;
        for (int i : nums) {
            int x = i-1, currMax = 0;
            
            if(!map.contains(x)) {
                while(map.contains(++x)) currMax++;
            }
            max = Math.max(currMax, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {100, 4, 200, 1, 3, 2}, arr2 = new int[] {0,3,7,2,5,8,4,6,0,1};

        System.out.println(longestConsecutive_1(arr1));
        System.out.println(longestConsecutive_1(arr2));
    }
}
