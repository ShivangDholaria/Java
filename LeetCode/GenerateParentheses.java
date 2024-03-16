package LeetCode;

import java.util.List;

/*
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 */

import java.util.ArrayList;

public class GenerateParentheses {

    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        genParan(res, 0, 0, "", n);

        return res;
    }

    public static void genParan(List<String> res, int left, int rigth, String s, int n) {
        if(s.length() == n * 2) { 
            res.add(s); 
            return;
        }

        if(left < n) genParan(res, left + 1, rigth, s + "(", n);
        if(rigth < left) genParan(res, left, rigth + 1, s + ")", n); 
    }
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
        System.out.println(generateParenthesis(1));
    }
}
