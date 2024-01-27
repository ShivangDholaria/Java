package DSA;

import java.util.Stack;

public class parenthesesCheck {
    public static void main(String[] args) {
        Stack<Character> stk = new Stack<Character>();

        int i = 0;
        System.out.println("Enter an expression");
        String inp = new java.util.Scanner(System.in).nextLine();

        while (i < inp.length()) {
            char c = inp.charAt(i);
            
            if(c == ')') {
                while(!stk.isEmpty()) {
                    if(stk.pop() != '(')
                        continue;
                    else
                        break;
                }
            }
            else if(c == ']') {
                while(!stk.isEmpty()) {
                    if(!stk.isEmpty() && stk.peek() == '['){
                        stk.pop();
                    }
                    else {
                        break;
                    }
                }
            }
            else if(c == '}') {
                while(!stk.isEmpty()) {
                    if(!stk.isEmpty() && stk.peek() == '{'){
                        stk.pop();
                    }
                    else {
                        break;
                    }
                }
            }
            else {
                stk.push(c);
            }
            i++;
        }
        if(stk.isEmpty())
            System.out.println("Expression is valid");
        else
            System.out.println("Expression is not valid");
    }
}
