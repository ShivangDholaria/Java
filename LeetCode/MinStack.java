package LeetCode;

import java.util.Stack;

/*
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * Implement the MinStack class:
 *      MinStack() initializes the stack object.
 *      void push(int val) pushes the element val onto the stack.
 *      void pop() removes the element on the top of the stack.
 *      int top() gets the top element of the stack.
 *      int getMin() retrieves the minimum element in the stack.
 *      You must implement a solution with O(1) time complexity for each function.
 */

public class MinStack {

    Stack<Integer> stk;
    int minVal = Integer.MAX_VALUE;

    public MinStack() {
        stk = new Stack<>();
    }
    
    public void push(int val) {
        if(val <= minVal) {
            stk.push(minVal);
            minVal = val;
        }
        stk.push(val);
    }
    
    public void pop() {
        if(stk.pop() == minVal) minVal = stk.pop();
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return minVal;
    }

    public static void main(String[] args) {
        
    }
}
