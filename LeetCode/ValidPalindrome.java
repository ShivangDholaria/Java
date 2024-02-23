package LeetCode;

/*
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, 
 * it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 * Given a string s, return true if it is a palindrome, or false otherwise.
 */

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        
        String clean_s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for(int i = 0, j = clean_s.length() - 1; i < j; i++, j--)
            if(clean_s.charAt(i) != clean_s.charAt(j))
                return false;

        return true;
    }

    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama", s2 = "race a car", s3 = " ", s4 = "0P";

        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome(s3));
        System.out.println(isPalindrome(s4));
    }
}
