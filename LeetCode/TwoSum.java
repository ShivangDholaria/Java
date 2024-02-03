package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    //1st sol
    public static int[] twoSum(int[] nums, int target) {
        int arr[];
        ArrayList<Integer> ind = new ArrayList<Integer>();
        for (int i = 0, k = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if(nums[i] + nums[j] == target)
                {
                    ind.add(i);
                    ind.add(j);
                }
            }
        }
        return arr.;
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

        System.out.println("Indices of the given list whose sum = " + sum + " is " + Arrays.toString(twoSum(nums, sum)));
    }
}
