package LeetCode;


/*
 * Given an array of integers nums, calculate the pivot index of this array.
 * The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to 
 * the sum of all the numbers strictly to the index's right.
 * If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left.
 * This also applies to the right edge of the array.
 * Return the leftmost pivot index. If no such index exists, return -1.
 */
public class FindPivotIndex {


    public static int pivotIndex(int[] nums) {
        int leftSum = 0, rigthSum = 0;

        for (int i : nums) rigthSum += i;

        for(int i = 0; i < nums.length; i++) {
            rigthSum -= nums[i];
            if(leftSum == rigthSum) return i;
            leftSum += nums[i];
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 7, 3, 6, 5, 6}, arr2 = new int[] {1, 2, 3}, arr3 = new int[] {2, 1, -1}, arr4 = new int[] {-1,-1,0,1,1,0};
        
        System.out.println(pivotIndex(arr1));
        System.out.println(pivotIndex(arr2));
        System.out.println(pivotIndex(arr3));
        System.out.println(pivotIndex(arr4));
    }
}
