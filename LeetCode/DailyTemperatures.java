package LeetCode;

import java.util.Arrays;
import java.util.Stack;

/*
 * Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] 
 * is the number of days you have to wait after the ith day to get a warmer temperature. 
 * If there is no future day for which this is possible, keep answer[i] == 0 instead.
 */

public class DailyTemperatures {

    public static int[] dailyTemperatures(int[] temperatures) {
        if (temperatures.length == 1)
            return new int[] { 0 };

            String s = "sidfv0";

        int[] arr = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            int count = 0, curTemp = temperatures[i];
            if (i == temperatures.length - 1) {
                arr[i] = 0;
                break;
            }
            if (curTemp > temperatures[i + 1]) {
                int j = i + 1;
                count++;
                while (curTemp > temperatures[j] && j < temperatures.length - 1) {
                    count++;
                    j++;
                }
            } else
                count++;
            arr[i] = count;
        }

        return arr;
    }

    // 2nd Sol
    public static int[] dailyTemperatures_2(int[] temperatures) {
        Stack<Integer> stk = new Stack<>();

        if (temperatures.length == 1)
            return new int[] { 0 };

        int[] ans = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {

            while (!stk.isEmpty() && temperatures[stk.peek()] < temperatures[i]) {
                int s = stk.pop();
                ans[s] = i - s;
            }
            stk.push(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] { 73, 74, 75, 71, 69, 72, 76, 73 }, arr2 = new int[] { 30, 40, 50, 60 },
                arr3 = new int[] { 30, 60, 90 }, arr4 = new int[] { 89, 62, 70, 58, 47, 47, 46, 76, 100, 70 };

        System.out.println(Arrays.toString(dailyTemperatures_2(arr1)));
        System.out.println(Arrays.toString(dailyTemperatures(arr2)));
        System.out.println(Arrays.toString(dailyTemperatures(arr3)));
        System.out.println(Arrays.toString(dailyTemperatures_2(arr4)));
    }
}
