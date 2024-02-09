package LeetCode;

/*
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * 
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the 
 * characters without disturbing the relative positions of the remaining characters. 
 * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 */

public class IsSubsequence {

    //1st sol - brute force method 
    public static boolean isSubsequence_1(String s, String t) {
        if(s.length() == 0)
            return true;

        int count = 0;
        for (int i = 0, j = 0; i < t.length() && j < s.length(); i++) {            
            if(s.charAt(j) == t.charAt(i))
            {
                count++;
                j++;
            }
        }

        return (count == s.length());
    }

    //2nd sol - recursion
    public static boolean isSubsequence_2(String s, String t) {
        return isSub(s, t, s.length(), t.length());
    }

    public static boolean isSub(String s, String t, int s_len, int t_len) {
        if(s_len == 0) return true;
        if(t_len == 0) return false;

        if(s.charAt(s_len - 1) == t.charAt(t_len - 1)) return isSub(s, t, s_len - 1, t_len - 1);

        return isSub(s, t, s_len, t_len - 1);
    }

    public static void main(String[] args) {
        String s1 = "abc", t1 = "ahbgdc", s2 = "axc", t2 = "ahbgdc", s3 = "", t3 = "sdvabe", s4 = "b", t4 = "abc";

        System.out.println(isSubsequence_1(s1, t1));
        System.out.println(isSubsequence_1(s2, t2));
        System.out.println(isSubsequence_1(s3, t3));
        System.out.println(isSubsequence_1(s4, t4));

        // System.out.println(isSubsequence_2(s1, t1));
        // System.out.println(isSubsequence_2(s2, t2));
        // System.out.println(isSubsequence_2(s3, t3));
        // System.out.println(isSubsequence_2(s4, t4));
    }
}
