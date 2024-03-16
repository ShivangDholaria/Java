package LeetCode;

/*
 * There is an integer array nums sorted in ascending order (with distinct values).
 * Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) 
 * such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). 
 * For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
 * 
 * Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, 
 * or -1 if it is not in nums.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 */

public class SearchinRotatedSortedArray {

    public static int search(int[] nums, int target) {

        if (nums.length == 1 && nums[0] == target)
            return 0;

        int l = 0, r = nums.length - 1, m;

        while (l <= r) {
            m = (l + r) / 2;

            if (nums[m] == target)
                return m;

            if (nums[l] <= nums[m]) {
                if (target > nums[m] || target < nums[l])
                    l = m + 1;
                else
                    r = m - 1;
            } else {
                if (target < nums[m] || target > nums[r])
                    r = m - 1;
                else
                    l = m + 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0));
        System.out.println(search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 3));
        System.out.println(search(new int[] { 1 }, 0));
        System.out.println(search(new int[] { 1 }, 1));
        System.out.println(search(new int[] { 1, 3 }, 3));
    }
}
