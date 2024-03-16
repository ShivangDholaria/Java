package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

/*
 * Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
 *      answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
 *      answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
 * 
 * Note that the integers in the lists may be returned in any order.
 */

public class FindtheDifferenceofTwoArrays {

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> num1 = new HashSet<>();
        HashSet<Integer> num2 = new HashSet<>();

        List<List<Integer>> res = new ArrayList<>();

        for(int i : nums1) num1.add(i);
        for(int i : nums2) num2.add(i);

        res.add(getDiff(num1, num2));
        res.add(getDiff(num2, num1));

        return res;
    }

    public static List<Integer> getDiff(HashSet<Integer> h1, HashSet<Integer> h2) {
        List<Integer> l = new ArrayList<>();

        for (Integer i : h1) {
            if (!h2.contains(i))
                l.add(i);
        }

        return l;
    }

    public static void main(String[] args) {
        int[] num11 = new int[] { 1, 2, 3 }, num12 = new int[] { 1, 2, 3, 3 }, num13 = new int[] {-68,-80,-19,-94,82,21,-43};
        int[] num21 = new int[] { 2, 4, 6 }, num22 = new int[] { 1, 1, 2, 2 }, num23 = new int[] {-63};

        findDifference(num11, num21).forEach(System.out::println);
        findDifference(num12, num22).forEach(System.out::println);
        findDifference(num13, num23).forEach(System.out::println);
    }
}
