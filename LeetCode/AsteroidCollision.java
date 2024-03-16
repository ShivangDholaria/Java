package LeetCode;

/*
 * We are given an array asteroids of integers representing asteroids in a row.
 * For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, 
 * negative meaning left). Each asteroid moves at the same speed.
 * Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. 
 * If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.
 */

import java.util.Stack;
import java.util.Arrays;

public class AsteroidCollision {

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk = new Stack<>();
        
        stk.push(asteroids[0]);
        
        for(int i = 1; i < asteroids.length; i++) {
            if((stk.peek() > 0 && asteroids[i] > 0) || (stk.peek() < 0 && asteroids[i] < 0))
                stk.push(asteroids[i]);
            else {
                while(!stk.isEmpty()) {
                    if(Math.abs(stk.peek()) < Math.abs(asteroids[i])) 
                        stk.pop();
                    else if(Math.abs(stk.peek()) == Math.abs(asteroids[i])) {
                        stk.pop();
                        break;
                    }
                    else break;;
                }
            }
        }

        int[] ast = new int[stk.size()];

        for(int i = ast.length - 1; i >= 0; i--) ast[i] = stk.pop();

        return ast;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] { 5, 10, -5 }, arr2 = new int[] { 8, -8 }, arr3 = new int[] { 10, 2, -5 };

        System.out.println(Arrays.toString(asteroidCollision(arr1)));
        System.out.println(Arrays.toString(asteroidCollision(arr2)));
        System.out.println(Arrays.toString(asteroidCollision(arr3)));
    }
}
