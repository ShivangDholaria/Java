package LeetCode;

import java.util.Arrays;

/*
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 */


public class MovingZeroes {
    
    //1st Sol - works but does not cover all the test cases
    public static void moveZeroes_1(int[] nums) {
        for (int i = 0, j = 0; j < nums.length; j++) {
            if(nums[i] < nums[j]) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }            
        }

        System.out.println(Arrays.toString(nums));
    }

    // 2nd sol - collecting 0 through the traversal and shifting them as non zero elements are encountered
    public static void moveZeroes_2(int[] nums) {
        int zeros = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) zeros++;
            else if(zeros > 0) {
                int temp = nums[i];
                nums[i] = 0;
                nums[i - zeros] = temp;
            }    
        }

        System.out.println(Arrays.toString(nums));
    }

    //3rd sol - shifting all the elements to the start and filling the rest with 0s
    public static void moveZeroes_3(int[] nums) {
        int nonZero = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[nonZero] = nums[i];
                nonZero++;
            }
        }

        while(nonZero < nums.length)    nums[nonZero++] = 0;

        System.out.println(Arrays.toString(nums));
    }

    //4th sol - using 2 pointers to shift 0s to rigth
    public static void moveZeroes_4(int[] nums) {
        int i = 0, j = 0, n = nums.length;

        while(i < n && j < n) {
            if(nums[i] != 0) i++;
            if(nums[j] == 0) j++;

            if((i < n && j < n) && (i < j)) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            j++;
        }

        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] nums1 = new int [] {0, 1, 0, 3, 12}, nums2 = new int[] {0}, nums3 = new int[] {1, 0, 1};
        
        moveZeroes_4(nums1);
        moveZeroes_4(nums2);
        moveZeroes_4(nums3);
    }
}
