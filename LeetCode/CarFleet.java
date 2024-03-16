package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * There are n cars going to the same destination along a one-lane road. The destination is target miles away.
 * 
 * You are given two integer array position and speed, both of length n, where position[i] is the position of the ith car 
 * and speed[i] is the speed of the ith car (in miles per hour).
 * 
 * A car can never pass another car ahead of it, but it can catch up to it and drive bumper to bumper at the same speed. 
 * The faster car will slow down to match the slower car's speed. The distance between these two cars is ignored (i.e., 
 * they are assumed to have the same position).
 * 
 * A car fleet is some non-empty set of cars driving at the same position and same speed. Note that a single car is also a car fleet.
 * 
 * If a car catches up to a car fleet right at the destination point, it will still be considered as one car fleet.
 * 
 * Return the number of car fleets that will arrive at the destination.
 */

public class CarFleet {

    public static int carFleet(int target, int[] position, int[] speed) {

        if(position.length == 1) return 1;

        class Pair {
            int Pos, Speed;

            Pair(int pos, int speed) {
                Pos = pos;
                Speed = speed;
            }

            int getPos() {
                return Pos;
            }

            int getSpeed() {
                return Speed;
            }
        }

        Stack<Double> stk = new Stack<>();

        List<Pair> lst = new ArrayList<>();
        for (int i = 0; i < position.length; i++)
            lst.add(new Pair(position[i], speed[i]));

        lst.sort((p1, p2) -> Integer.compare(p2.getPos(), p1.getPos()));

        for (Pair p : lst) {

            double curTime = (double)(target - p.getPos()) / p.getSpeed();

            if (!stk.isEmpty() && curTime <= stk.peek()) continue;
            else stk.push(curTime);
        }

        return stk.size();
    }

    public static void main(String[] args) {
        System.out.println(carFleet(12, new int[] { 10, 8, 0, 5, 3 }, new int[] { 2, 4, 1, 1, 3 }));
        System.out.println(carFleet(10, new int[] { 3 }, new int[] { 3 }));
        System.out.println(carFleet(100, new int[] { 0, 2, 4 }, new int[] { 4, 2, 1 }));
        System.out.println(carFleet(10, new int[] { 6, 8 }, new int[] { 3, 2 }));

    }
}
