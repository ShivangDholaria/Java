package LeetCode;

/*
 * You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new
 * flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
 */

public class CanPlaceFlower {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n == 0) return true;

        int count = 0;

        for(int i=0; i<flowerbed.length; i++){
            if(flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length -1 || flowerbed[i+1] == 0)){
                count++;

                if(count == n){
                    return true;
                }
                i++;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 0, 0, 0, 1}, arr2 = new int[] {1, 0, 0, 0, 0, 1};
    
        System.out.println(canPlaceFlowers(arr1, 1));
        System.out.println(canPlaceFlowers(arr1, 2));
        System.out.println(canPlaceFlowers(arr2, 2));
    }
}