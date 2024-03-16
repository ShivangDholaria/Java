package LeetCode;

/*
 * Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. 
 * The guards have gone and will come back in h hours.
 * Koko can decide her bananas-per-hour eating speed of k. 
 * Each hour, she chooses some pile of bananas and eats k bananas from that pile. 
 * If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
 * Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
 * Return the minimum integer k such that she can eat all the bananas within h hours.
 */

public class KokoEatingBananas {

    public static int minEatingSpeed(int[] piles, int h) {

        int r = 0;
        for (int p : piles)
            r = Math.max(r, p);

        int left = 1, total_hours;

        while (left < r) {
            int mid = (left + r) / 2;
            total_hours = 0;

            for (int pile : piles)
                total_hours += Math.ceilDiv(pile, mid);

            if (total_hours <= h) {
                r = mid;
            } else
                left = mid + 1;
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(minEatingSpeed(new int[] { 3, 6, 7, 11 }, 8));
        System.out.println(minEatingSpeed(new int[] { 30, 11, 23, 4, 20 }, 5));
        System.out.println(minEatingSpeed(new int[] { 30, 11, 23, 4, 20 }, 6));
        System.out.println(minEatingSpeed(new int[] { 805306368, 805306368, 805306368 }, 1000000000));
    }
}
