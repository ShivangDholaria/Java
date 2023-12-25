import java.util.Stack;

public class stacks {
    public static void main(String[] args) {
        Stack<String> stk = new Stack<String>();

        //Checking to see if stack is empty
        System.out.println(stk.empty());

        //Pushing elements into the stack
        stk.push("Pasta");
        stk.push("Chicken Sandwich");
        stk.push("Ravioli");
        stk.push("Taco");
        stk.push("Sushi");
        stk.push("Ramen");

        //Printing the stack
        System.out.println(stk);

        //Printing the position of elements in the stack
        //Position starts from 1 and from top 
        //Returns -1 if object is not present
        System.out.println(stk.search("Taco"));
        System.out.println(stk.search("Pasta"));
        System.out.println(stk.search("Ravioli"));
        System.out.println(stk.search("ravioli"));

    }
}
