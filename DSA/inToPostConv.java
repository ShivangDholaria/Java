import java.util.Stack;

public class inToPostConv {

    private static int pred(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Stack<Character> stk = new Stack<Character>();

        System.out.println("Enter expression");
        String inp = new java.util.Scanner(System.in).nextLine();

        for (int i = 0; i < inp.length(); i++) {
            char c = inp.charAt(i);

            if (c == ')') {
                while (!stk.isEmpty() && stk.peek() != '(') {
                    System.out.print(stk.pop());
                }
                stk.pop();
            }
            else if (c != '+' && c != '-' && c != '*' && c != '/' && c != '(') {
                System.out.print(c);
            } else if (c == '(') {
                stk.push(c);
            } //else if (c == ')') {
            //     while (!stk.isEmpty() && stk.peek() != '(') {
            //         System.out.print(stk.pop());
            //     }
            //     stk.pop();
            //} 
            else {
                while (!stk.isEmpty() && pred(stk.peek()) >= pred(c) && stk.peek() != '(') {
                    System.out.print(stk.pop());
                }
                stk.push(c);
            }
        }
        while (!stk.isEmpty())
            System.out.println(stk.pop());    

    }
}
