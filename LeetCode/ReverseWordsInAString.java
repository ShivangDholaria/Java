package LeetCode;

/*
 * 
 */

public class ReverseWordsInAString {

    public static String reverseWords(String s) {
        String[] arr = s.trim().split(" ");
        StringBuilder temp = new StringBuilder();

        for (int i = arr.length - 1; i > 0; i--) 
            temp.append(arr[i].length() > 0 ? arr[i] + " " : "");

        return temp + arr[0];
    }
    public static void main(String[] args) {
        String s1 = "the sky is blue", s2 = "  hello world  ", s3 = "a good   example";

        System.out.println(reverseWords(s1));
        System.out.println(reverseWords(s2));
        System.out.println(reverseWords(s3));
    }
}
