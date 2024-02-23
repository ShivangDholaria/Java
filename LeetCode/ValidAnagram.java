package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * 
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
 * typically using all the original letters exactly once.
 */

public class ValidAnagram {
    
    //1st sol - HashMap
    public static boolean isAnagram_1(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Integer> charMap_s = new HashMap<Character, Integer>();
        Map<Character, Integer> charMap_t = new HashMap<Character, Integer>();

        for(int i = 0; i < s.length(); i++) {
            charMap_s.put(s.charAt(i), charMap_s.getOrDefault(s.charAt(i), 0) + 1);
            charMap_t.put(t.charAt(i), charMap_t.getOrDefault(t.charAt(i), 0) + 1);
        }

        if(charMap_s.equals(charMap_t))
            return true;
    
        return false;
    }

    //2nd sol - Char Array
    public static boolean isAnagram_2(String s, String t) {
        if(s.length() != t.length()) return false;

        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();

        Arrays.sort(s_arr);
        Arrays.sort(t_arr);

        return Arrays.equals(s_arr, t_arr);
    }

    //3rd sol - Char Array
    public static boolean isAnagram_3(String s, String t) {
        if(s.length() != t.length()) return false;
    
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();
        
        Arrays.sort(s_arr);
        Arrays.sort(t_arr);

        String a = String.valueOf(s_arr);
        String b = String.valueOf(t_arr);

        return a.equals(b);
    }

    //4th sol - Using arrays
    public static boolean isAnagram_4(String s, String t) {
        int arr[] = new int[26];

        for(char c : s.toCharArray())
            arr[c - 'a']++;

        for(char c : t.toCharArray())
            arr[c - 'a']--;

        for(int i : arr)
            if(i != 0) return false;
        
        return true;
    }


    public static void main(String[] args) {
        String s1 = "anagram", s2 = "cat";
        String t1 = "nagaram", t2 = "rat";

        // System.out.println(isAnagram_1(s1, t1));
        // System.out.println(isAnagram_1(s2, t2));

        // System.out.println(isAnagram_2(s1, t1));
        // System.out.println(isAnagram_2(s2, t2));
        
        // System.out.println(isAnagram_3(s1, t1));
        // System.out.println(isAnagram_3(s2, t2));

        System.out.println(isAnagram_4(s1, t1));
        System.out.println(isAnagram_4(s2, t2));

    }
}
