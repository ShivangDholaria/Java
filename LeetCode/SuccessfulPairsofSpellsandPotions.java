package LeetCode;

/*
 * You are given two positive integer arrays spells and potions, of length n and m respectively, 
 * where spells[i] represents the strength of the ith spell and potions[j] represents the strength of the jth potion.
 * 
 * You are also given an integer success. A spell and potion pair is considered successful if the product of their 
 * strengths is at least success.
 * 
 * Return an integer array pairs of length n where pairs[i] is the number of potions that will form a successful pair
 *  with the ith spell.
 */

import java.util.Arrays;

public class SuccessfulPairsofSpellsandPotions {
    
    public static int[] successfulPairs(int[] spells, int[] potions, long success) {

        if(spells.length == 1 && potions.length == 1)
        {
            if(spells[0] * potions[0] < success) return new int[] {0};
            else return new int[] {1};
        }

        Arrays.sort(potions);

        int[] pairs = new int[spells.length];
    
        for(int i = 0; i < spells.length; i++) {
            long prod = (long)spells[i] * potions[potions.length - 1];
            
            if(prod < success)
                continue;
        
            int left = 0, rigth = potions.length - 1;
            while(left <= rigth) {
                int mid = (left + rigth) / 2;
                prod = (long)spells[i] * potions[mid];
                if(prod < success) left = mid + 1;
                else rigth = mid - 1;
            }
            pairs[i] = potions.length - left;
        }
        return pairs;
    }
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(successfulPairs(new int[] {5,1,3}, new int[] {1,2,3,4,5}, 7)));
        System.out.println(Arrays.toString(successfulPairs(new int[] {3,1,2}, new int[] {8,5,8}, 16)));
    }
}
