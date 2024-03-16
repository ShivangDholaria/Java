package LeetCode;

/*
 * Given an array of integers nums which is sorted in ascending order, and an integer target, 
 * write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 */

public class BinarySearch {

    public static int search(int[] nums, int target) {
        
        int left = 0, rigth = nums.length - 1;
        
        while(left <= rigth) {
            int mid = (rigth + left) / 2;
            if(target == nums[mid]) {
                return mid;
            }
            if(nums[mid] < target) left = mid + 1;
            else if(nums[mid] > target) rigth = mid - 1; 
        }
        return -1;
    }

   public static void main(String[] args) {
    System.out.println(search(new int[] {-1,0,3,5,9,12}, 9));
    System.out.println(search(new int[] {5}, 5));

   }
}