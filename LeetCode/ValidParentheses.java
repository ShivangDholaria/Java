package LeetCode;

import java.util.Stack;

/*
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 *      Open brackets must be closed by the same type of brackets.
 *      Open brackets must be closed in the correct order.
 *      Every close bracket has a corresponding open bracket of the same type.
 */

public class ValidParentheses {

    public static boolean isValid(String s) {

        if (s.length() <= 1 || s.length() % 2 != 0 || s.charAt(0) == '}' || s.charAt(0) == ')' || s.charAt(0) == ']')
            return false;

        Stack<String> stk = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '}' && !stk.isEmpty()) {
                if (stk.peek().charAt(0) == '{')
                    stk.pop();
                else break;
                    continue;    
            }
            if (c == ')' && !stk.isEmpty()) {
                if (stk.peek().charAt(0) == '(')
                    stk.pop();
                else break;
                continue;
            }
            if (c == ']' && !stk.isEmpty()) {
                if (stk.peek().charAt(0) == '[')
                    stk.pop();
                else break;
                    
                continue;    
                }
            stk.push(String.valueOf(c));
        }

        return stk.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "()", s2 = "()[]{}", s3 = "(]", s4 = "([}}])";

        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));
        System.out.println(isValid(s4));
    }
}
