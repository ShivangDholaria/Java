package LeetCode;

import java.util.Random;

/*
 * We are playing the Guess Game. The game is as follows:
 * 
 * I pick a number from 1 to n. You have to guess which number I picked.
 * 
 * Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
 * 
 * You call a pre-defined API int guess(int num), which returns three possible results:
 *      -1: Your guess is higher than the number I picked (i.e. num > pick).
 *       1: Your guess is lower than the number I picked (i.e. num < pick).
 *       0: your guess is equal to the number I picked (i.e. num == pick).
 * 
 * Return the number that I picked.
 */


public class GuessNumberHigherorLower {
    
    static int NUM;

    public static int guess(int num) {
        if(num > NUM) return -1;
        else if(num < NUM) return 1;
        else return 0; 
    }

    public static int guessNumber(int n) {
        int left = 1, rigth = n;

        while(left <= rigth) {
            int mid = (left + rigth) / 2;

            if(guess(mid) == 0)
                return mid;
            if(guess(mid) == 1) left = mid + 1;
            else if(guess(mid) == -1) rigth = mid - 1;
        } 
        return -1;
    }
    
    
    public static void main(String[] args) {
        NUM = new Random().nextInt(Integer.MAX_VALUE);
        
        System.out.println(guessNumber(NUM));
    }
}
