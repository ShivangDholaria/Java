/*
 *  You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. 
 *  If a string is longer than the other, append the additional letters onto the end of the merged string.
 *  Return the merged string. 
 */

class MergeStringsAlternately {
    
    // 1st sol
    public static String mergeStringsAlternately_1(String s1, String s2) {
        int i = 0, j = 0;                                   // Counters of String lengths
        StringBuilder new_word = new StringBuilder();

        while (i < s1.length() && j < s2.length()) {        
            new_word.append(s1.charAt(i++)).append(s2.charAt(j++));     // Adding characters until counter reachs any of the strings length
        }

        if(s1.length() < s2.length())                                   // Adding rest of the string if one's length is greater than other
            new_word.append(s2.subSequence(j, s2.length()));
        else
            new_word.append(s1.subSequence(i, s1.length()));
    
        return new_word.toString();
    }
    
    // 2nd Sol - kind of optimized version of 1st sol
    public static String mergeStringsAlternately_2(String s1, String s2) {
        StringBuilder new_word = new StringBuilder();
        int i = 0;
        while (i < s1.length() || i < s2.length()) {                    // Creating new String in single loop
            
            if(i < s1.length())
               new_word.append(s1.charAt(i));
            if(i < s2.length())
                new_word.append(s2.charAt(i));
            i++;
        }
    
        return new_word.toString();
    }
    
    public static void main(String[] args) {
        String s1 = "ab", s2 = "pqr";

        System.out.println(mergeStringsAlternately_1(s1, s2));
        System.out.println(mergeStringsAlternately_2(s1, s2));
    }
}