package LeetCode;

import java.util.Arrays;

/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements 
 * of nums except nums[i].
 * 
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * 
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 */

public class ProductofArrayExceptSelf {

    public static int[] productExceptSelf_1(int[] nums) {
        int[] ans = new int[nums.length];
        int preProd = 1, sufProd = 1;

        for (int i = 0; i < ans.length; i++) {
            ans[i] = preProd;
            preProd *= nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= sufProd;
            sufProd *= nums[i]; 
        }

        return ans;
    }

    //2nd sol 
    public static int[] productExceptSelf_2(int[] nums) {
        int multi = 1, count_0 = 0;
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                count_0++;
                continue;
            }
            multi *= nums[i];
        } 

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0 && count_0 > 1) {
                ans[i] = 0;
                continue;
            }
            if(nums[i] == 0 && count_0 == 1) {
                nums[i] = multi;
                continue;
            }
            ans[i] = multi / nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 2, 3, 4}, arr2 = new int[] {-1, 1, 0, -3, 3}, arr3 = new int[] {1, 0}, arr4 = new int[] {0, 4, 0},
              arr5 = new int[] {1, 0, 8, 0, 5, 7};

        System.out.println(Arrays.toString(productExceptSelf_1(arr1)));
        System.out.println(Arrays.toString(productExceptSelf_1(arr2)));
        System.out.println(Arrays.toString(productExceptSelf_1(arr3)));
        System.out.println(Arrays.toString(productExceptSelf_1(arr4)));
        System.out.println(Arrays.toString(productExceptSelf_1(arr5)));
    }    
}