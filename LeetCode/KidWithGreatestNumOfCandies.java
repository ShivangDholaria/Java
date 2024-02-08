package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, 
 * denoting the number of extra candies that you have.
 * Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids,
 * or false otherwise.
 * Note that multiple kids can have the greatest number of candies.
 */

public class KidWithGreatestNumOfCandies {
    
    public static List<Boolean> kidsWithCandies_1(int[] candies, int extraCandies) {
        List<Boolean> greater = new ArrayList<Boolean>();
        boolean flag = false;

        for (int i = 0; i < candies.length; i++) {
            for (int j = 0; j < candies.length; j++) {
                if(i == j)
                    continue;
                else {
                    if(candies[i] + extraCandies >= candies[j]) 
                        flag = true;
                    else {
                        flag = false;
                        break;
                    }
                }
            }
            greater.add(flag ? true : false);
        }

        return greater;
    }
    
    //2nd Sol
    public static List<Boolean> kidsWithCandies_2(int[] candies, int extraCandies) {
        int max = 0;
        for (int i : candies)
            max = Math.max(max, i);

        List<Boolean> res = new ArrayList<Boolean>();

        for (int i : candies) {
            res.add(i + extraCandies >= max);
        }

        return res;
    }
    
    
    public static void main(String[] args) {
        int[] candies_1 = new int[] {2, 3, 5, 1, 3}, candies_2 = new int[] {4, 2, 1, 1, 2}, candies_3 = new int[] {12, 1, 12};
        int extraCandies_1 = 3, extraCandies_2 = 1, extraCandies_3 = 10;
    
        System.out.println("[" + kidsWithCandies_1(candies_1, extraCandies_1).stream().map(Object::toString).collect(Collectors.joining(", ")) + "]");
        System.out.println("[" + kidsWithCandies_1(candies_2, extraCandies_2).stream().map(Object::toString).collect(Collectors.joining(", ")) + "]");
        System.out.println("[" + kidsWithCandies_1(candies_3, extraCandies_3).stream().map(Object::toString).collect(Collectors.joining(", ")) + "]");

        System.out.println("[" + kidsWithCandies_2(candies_1, extraCandies_1).stream().map(Object::toString).collect(Collectors.joining(", ")) + "]");
        System.out.println("[" + kidsWithCandies_2(candies_2, extraCandies_2).stream().map(Object::toString).collect(Collectors.joining(", ")) + "]");
        System.out.println("[" + kidsWithCandies_2(candies_3, extraCandies_3).stream().map(Object::toString).collect(Collectors.joining(", ")) + "]");
    }
}
