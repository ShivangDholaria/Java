package LeetCode;

/*
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 */

import java.util.Arrays;

public class LongestCommonPreefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);

        String first = strs[0], last = strs[strs.length - 1];

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i))  return sb.toString();
            
            sb.append(first.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String[] arr1 = new String[] {"flower", "flow", "flight"}, arr2 = new String[] {"dog", "racecar", "car"};

        System.out.println(new LongestCommonPreefix().longestCommonPrefix(arr1));
        System.out.println(new LongestCommonPreefix().longestCommonPrefix(arr2));
    } 
}
