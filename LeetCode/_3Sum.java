package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, 
 * and nums[i] + nums[j] + nums[k] == 0.
 * Notice that the solution set must not contain duplicate triplets.
 */

public class _3Sum {

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> unique_triplet = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for(int j = i + 1, k = nums.length - 1; j < k;) {
                int sum = nums[i];
                if(nums[i] + nums[j] + nums[k] == 0)
                    unique_triplet.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                else if(nums[i] + nums[j] + nums[k] < 0)
                    j++;
                else k--;
            }
        }

        ans.addAll(unique_triplet);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {-1, 0, 1, 2, -1, -4};
        for (List<Integer> i : threeSum(arr1)) {
            System.out.print("[");
            for (int j : i) {
                System.out.printf("%d, ", j);
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
