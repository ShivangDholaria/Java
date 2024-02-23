package LeetCode;

/*
 * Given a string s, reverse only all the vowels in the string and return it.
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 */
public class ReverseVowelsofaString {
    
    // 1st sol
    public static String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        String s2 = s.toLowerCase();
        for(int i = 0, j = s.length() - 1; i < j;) {
            if((s2.charAt(i) == 'a' || s2.charAt(i) == 'e' || s2.charAt(i) == 'i' || s2.charAt(i) == 'o' || s2.charAt(i) == 'u') &&
               (s2.charAt(j) == 'a' || s2.charAt(j) == 'e' || s2.charAt(j) == 'i' || s2.charAt(j) == 'o' || s2.charAt(j) == 'u')) {
                char c = s.charAt(i);
                sb.setCharAt(i, s.charAt(j));
                sb.setCharAt(j, c);
                i++;
                j--;

                continue;
               }
               if(s2.charAt(i) != 'a' && s2.charAt(i) != 'e' && s2.charAt(i) != 'i' && s2.charAt(i) != 'o' && s2.charAt(i) != 'u') 
                    i++;
               if(s2.charAt(j) != 'a' && s2.charAt(j) != 'e' && s2.charAt(j) != 'i' && s2.charAt(j) != 'o' && s2.charAt(j) != 'u') 
                    j--;

        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        String s1 = "hello", s2 = "leetcode", s3 = "leEtcodE";
        System.out.println(reverseVowels(s1));
        System.out.println(reverseVowels(s2));
        System.out.println(reverseVowels(s3));
    }
}
