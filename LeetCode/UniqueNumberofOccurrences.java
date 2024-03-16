package LeetCode;

/*
 * Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueNumberofOccurrences {

    public static boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> h1 = new HashMap<>();

        for (int i : arr)
                h1.put(i, h1.getOrDefault(i, 0) + 1);
        //HashMap<Integer, Integer> h2 = new HashMap<>(h1);

        HashSet<Integer> s = new HashSet<>();

        for (Map.Entry<Integer,Integer> e : h1.entrySet())
            if (!s.add(e.getValue())) return false;

        return true;
    }

    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[] { 1, 2, 2, 1, 1, 3 }));
        System.out.println(uniqueOccurrences(new int[] { 1, 2 }));
        System.out.println(uniqueOccurrences(new int[] { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 }));

    }
}
