package LeetCode;

/*
 * You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.
 * Evaluate the expression. Return an integer that represents the value of the expression.
 * Note that: 
 *      The valid operators are '+', '-', '*', and '/'.
 *      Each operand may be an integer or another expression.
 *      The division between two integers always truncates toward zero.
 *      There will not be any division by zero.
 *      The input represents a valid arithmetic expression in a reverse polish notation.
 *      The answer and all the intermediate calculations can be represented in a 32-bit integer.
 */

import java.util.Stack;

public class EvaluateReversePolishNotation {
    
    public static int evalRPN(String[] tokens) {
        
        int res = 0, a1, a2;
        Stack<Integer> stk = new Stack<>();

        if(tokens.length == 1)
            return Integer.parseInt(tokens[0]);

        for(String s : tokens)
        {
            switch(s){
                    case "+" :
                        a1 = stk.pop();
                        a2 = stk.pop();
                        stk.push(a1 + a2);
                        break;
                    case "-" :
                        a2 = stk.pop();
                        a1 = stk.pop();
                        stk.push(a2 - a1);
                        break;
                    case "*" :
                        a1 = stk.pop();
                        a2 = stk.pop();
                        stk.push(a1 * a2);
                        break;
                    case "/" :
                        a2 = stk.pop();
                        a1 = stk.pop();
                        stk.push(a2 / a1);
                        break;
                    default : stk.push(Integer.parseInt(s));
            }
        }

        return res;
    }
    
    public static void main(String[] args) {
        String[] arr1 = new String[] {"2", "1", "+", "3", "*"}, arr2 = new String[] {"4", "13", "5", "/", "+"}, arr3 = new String[] {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"},
                 arr4 = new String[] {"4","3","-"};
    
        System.out.println(evalRPN(arr1));
        System.out.println(evalRPN(arr2));
        System.out.println(evalRPN(arr3));
        System.out.println(evalRPN(arr4));
    }
}
