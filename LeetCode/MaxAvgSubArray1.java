package LeetCode;

/**
 * You are given an integer array nums consisting of n elements, and an integer k.
 * Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. 
 * Any answer with a calculation error less than 10-5 will be accepted.
 */
public class MaxAvgSubArray1 {

    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        return (double)maxSum / k;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 12, -5, -6, 50, 3}, arr2 = new int[] {5}, arr3 = new int[] {0, 1, 1, 3, 3}, arr4 = new int[] {8860,-853,6534,4477,-4589,8646,-6155,-5577,-1656,-5779,-2619,-8604,-1358,-8009,4983,7063,3104,-1560,4080,2763,5616,-2375,2848,1394,-7173,-5225,-8244,-809,8025,-4072,-4391,-9579,1407,6700,2421,-6685,5481,-1732,-8892,-6645,3077,3287,-4149,8701,-4393,-9070,-1777,2237,-3253,-506,-4931,-7366,-8132,5406,-6300,-275,-1908,67,3569,1433,-7262,-437,8303,4498,-379,3054,-6285,4203,6908,4433,3077,2288,9733,-8067,3007,9725,9669,1362,-2561,-4225,5442,-9006,-429,160,-9234,-4444,3586,-5711,-9506,-79,-4418,-4348,-5891};
        int[] arr5 = new int[] {4, 0, 4, 3, 3}, arr6 = new int[] {0, 4, 0, 3, 2};


        System.out.println(findMaxAverage(arr1, 4));
        System.out.println(findMaxAverage(arr2, 1));
        System.out.println(findMaxAverage(arr3, 4));
        System.out.println(findMaxAverage(arr4, 93));
        System.out.println(findMaxAverage(arr5, 5));
        System.out.println(findMaxAverage(arr6, 1));
    }
    
}