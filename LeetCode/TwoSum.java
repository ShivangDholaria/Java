package LeetCode;

/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    //1st sol
    public static int[] twoSum_1(int[] nums, int target) {
        int arr[] = new int[2];

        //Linearly checking if the target value exists in the given array
        for (int i = 0, k = 0; i < nums.length - 1 && k <= 2; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target)
                {
                    arr[k++] = i;
                    arr[k++] = j;
                    break;
                }
            }
        }
        return arr;
    }

    //2nd sol - Kind of optimized version of 1st sol
    public static int[] twoSum_2(int[] nums, int target) {
        //Linearly checking if the target value exists in the given array
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target)
                {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }

    //3rd sol - using HashMap
    public static int[] twoSum_3(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();                     // Creating HashMap 

        for (int i = 0; i < nums.length; i++) {                             // Adding all the numbers in the map
            numMap.put(nums[i], i);            
        }

        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];                                    // Getting the complement of the target value

            if(numMap.containsKey(comp) && numMap.get(comp) != i)           // Checking in map if the complements exists or not
                return new int[] {i, numMap.get(comp)};
        }

        return new int[] {};
    }

    //4th sol
    public static int[] twoSum_4(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];                                    // Getting the complement of the target value

            if(numMap.containsKey(comp))
                return new int[] {numMap.get(comp), i};                     // Checking in map if the complements exists or not
            
            numMap.put(nums[i], i);                                         // Adding the number in the hashMap
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter List of numbers");
        int num = s.nextInt();
        int nums[] = new int[num];
        
        System.out.println("Enter numbers");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }

        System.out.println("Enter target sum");
        int sum = s.nextInt();

        System.out.println("Indices of the given list whose sum = " + sum + " is " + Arrays.toString(twoSum_1(nums, sum)));
        System.out.println("Indices of the given list whose sum = " + sum + " is " + Arrays.toString(twoSum_2(nums, sum)));
        System.out.println("Indices of the given list whose sum = " + sum + " is " + Arrays.toString(twoSum_3(nums, sum)));
        System.out.println("Indices of the given list whose sum = " + sum + " is " + Arrays.toString(twoSum_4(nums, sum)));
        s.close();
    }
}
