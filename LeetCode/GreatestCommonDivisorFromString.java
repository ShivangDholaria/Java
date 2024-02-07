package LeetCode;

/*
 *  For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
 *  Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 */


public class GreatestCommonDivisorFromString {

    public static String gcdOfString_1(String str1, String str2) {

        if(!(str1 + str2).equals(str2 + str1))
            return "";
        
        int gcd = gcd(str1.length(), str2.length());

        return str1.substring(0, gcd);
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    //2nd Sol - Optimized version of 1st
    public static String gcdOfString_2(String str1, String str2) {

        if(str1.equals(str2))
            return str1;
        if(str1.length() < str2.length())
            return gcdOfString_2(str2, str1);
        if(!str1.startsWith(str2))
            return "";
        else
            return gcdOfString_2(str1.substring(str2.length()), str2);
    
    }

    public static void main(String[] args) {
        String s1 = "ABCABC", s2 = "ABC", s3 = "ABABAB", s4 = "ABAB", s5 = "LEET", s6 = "CODE";

        // System.out.println(gcdOfString_1(s1, s2));
        // System.out.println(gcdOfString_1(s3, s4));
        // System.out.println(gcdOfString_1(s5, s6));

        System.out.println(gcdOfString_2(s1, s2));
        System.out.println(gcdOfString_2(s3, s4));
        System.out.println(gcdOfString_2(s5, s6));
    }   
}