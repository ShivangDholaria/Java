/*
 * Program to generated a bit string of length n
 * using bactracking
 */

import java.util.Arrays;

public class nBitStringGenerator {

    int[] A;

    public nBitStringGenerator(int n) {
        A = new int[n];
    }

    public void binString(int n) {
        if (n <= 0) {
            System.out.println(Arrays.toString(A));
        }
        else {
            A[n - 1] = 0;
            binString(n - 1);
            A[n - 1] = 1;
            binString(n - 1);
        }
    }

    public static void main(String[] args) {
        
        int n = 4;
        
        nBitStringGenerator obj = new nBitStringGenerator(n);
        obj.binString(n);
    
        
    
    }
}
