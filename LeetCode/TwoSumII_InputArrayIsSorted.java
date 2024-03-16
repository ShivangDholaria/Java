package LeetCode;

import java.util.Arrays;

public class TwoSumII_InputArrayIsSorted {

    public static int[] twoSum(int[] numbers, int target) {
        int left, rigth, remain;

        for (int i = 0; i < numbers.length - 1; i++) {
            remain = target - numbers[i];
            left = i + 1;
            rigth = numbers.length - 1;
            while(left <= rigth)
            {
                int mid = left + (rigth - left) / 2;
                if(numbers[mid] == remain)
                    return new int[]{ i + 1, mid + 1};
                if(numbers[mid] < remain)
                    left = mid + 1;
                else
                    rigth = mid - 1;
            }
        }

        return new int[] {};
    }


    public static void main(String[] args) {
        int[] arr1 = new int[] {2, 7, 11, 15}, arr2 = new int[] {2, 3, 4}, arr3 = new int[] {-1, 0}, arr4 = new int[] {5, 25, 75};
        int target1 = 9, target2 = 6, target3 = -1, target4 = 100;

        System.out.println(Arrays.toString(twoSum(arr1, target1)));
        System.out.println(Arrays.toString(twoSum(arr2, target2)));
        System.out.println(Arrays.toString(twoSum(arr3, target3)));
        System.out.println(Arrays.toString(twoSum(arr4, target4)));
    }
}
