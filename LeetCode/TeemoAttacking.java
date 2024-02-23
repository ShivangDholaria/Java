package LeetCode;

/*
 * Our hero Teemo is attacking an enemy Ashe with poison attacks! When Teemo attacks Ashe, Ashe gets poisoned for a exactly duration seconds. 
 * More formally, an attack at second t will mean Ashe is poisoned during the inclusive time interval [t, t + duration - 1]. 
 * If Teemo attacks again before the poison effect ends, the timer for it is reset, and the poison effect will end duration seconds after the new attack.
 * 
 * You are given a non-decreasing integer array timeSeries, where timeSeries[i] denotes that Teemo attacks Ashe at second timeSeries[i], and an integer duration.
 * Return the total number of seconds that Ashe is poisoned.
 */

public class TeemoAttacking {
    
    public static int findPoisonedDuration_1(int[] timeSeries, int duration) {
        int total = 0;

        for (int i = 0; i < timeSeries.length; i++) {
            if(i < timeSeries.length - 1) {
                if(timeSeries[i] + duration - 1 < timeSeries[i + 1]) total += duration;
                else total += timeSeries[i + 1] - timeSeries[i];
            } 
            else total += duration;
        }
        return total;
    }

    public static int findPoisonedDuration_2(int[] timeSeries, int duration) {
        int poisoned = 0, until = -1;

        for (int turn : timeSeries) {

            if (until >= turn) poisoned -= (until - turn + 1);

            poisoned += duration;
            until = turn + duration - 1;
        }
        return poisoned;
    }
    
    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 4}, arr2 = new int[] {1, 2}, arr3 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(findPoisonedDuration_2(arr1, 2));
        System.out.println(findPoisonedDuration_2(arr2, 2));
        System.out.println(findPoisonedDuration_1(arr3, 1));
    }
}
