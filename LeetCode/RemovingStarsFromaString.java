package LeetCode;

import java.util.Arrays;
import java.util.Stack;

/*
 * You are given a string s, which contains stars *.
 * In one operation, you can:
 * 
 * Choose a star in s.
 *      Remove the closest non-star character to its left, as well as remove the star itself.
 *      Return the string after all stars have been removed.
 * 
 * Note:
 *      The input will be generated such that the operation is always possible.
 *      It can be shown that the resulting string will always be unique.
 */

public class RemovingStarsFromaString {
    
    //1st sol - using stack
    public static String removeStars_1(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stk = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '*')
                stk.push(s.charAt(i));
            else stk.pop();
        }

        while(!stk.isEmpty()) sb.append(stk.pop());
        return sb.reverse().toString();
    }
    
    //2nd Sol - using char array
    public static String removeStars_2(String s) {
        char[] arr = s.toCharArray();
        int j = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '*') j--;
            else arr[j++] = s.charAt(i);
        }

        return String.valueOf(Arrays.copyOfRange(arr, 0, j));

    }
    
    // 3rd Sol - 
    
    public static void main(String[] args) {
        String s1 = "leet**cod*e", s2 = "erase*****";

        System.out.println(removeStars_2(s1));
        System.out.println(removeStars_2(s2));
    }
}
