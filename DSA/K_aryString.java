package DSA;

/**
 * Program to all possible strings of length n from 0 - k-1 numbers
 */
import java.util.*;

class K_aryString {
    int[] A;

    public K_aryString(int n) {
        A = new int[n];
    }

    public void base_K_string(int n , int k) {
        if(n <= 0) {
            System.out.println(Arrays.toString(A));
        }
        else {
            for (int i = 0; i < k; i++) {
                A[n - 1] = i;
                base_K_string(n - 1, k);
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        K_aryString obj = new K_aryString(n);
        obj.base_K_string(n, 2);
    }
}