package LeetCode;

/*
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order. 
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
 * typically using all the original letters exactly once. 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String a : strs) {
            char[] chrs = a.toCharArray();
            Arrays.sort(chrs);
            String wrd = new String(chrs);

            if(!map.containsKey(wrd)) map.put(wrd, new ArrayList<>());

            map.get(wrd).add(a);
        }

        System.out.println(map.values());

        return new ArrayList<>(map.values());
    }
    
    public static void main(String[] args) {
        String[] arr = new String[] {"eat","tea","tan","ate","nat","bat"};

        System.out.println(groupAnagrams(arr));
    }
}
