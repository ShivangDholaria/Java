package LeetCode;

/*
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * Return the maximum amount of water a container can store.
 * Notice that you may not slant the container.
 */
public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maxWaterCap = 0, currWaterCap = 0;

        for (int i = 0, j = height.length - 1; i < j; ) {
            currWaterCap = (j - i) * Math.min(height[i] , height[j]);
            maxWaterCap = Math.max(currWaterCap, maxWaterCap);
            if(height[i] < height[j]) i++;
            else j--;
        }

        return maxWaterCap;
    }

   public static void main(String[] args) {
    int[] arr1 = new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7};
   
    System.out.println(maxArea(arr1));
    } 
}
