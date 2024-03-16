package LeetCode;

/*
 * You are given an m x n integer matrix matrix with the following two properties:
 *      Each row is sorted in non-decreasing order.
 *      The first integer of each row is greater than the last integer of the previous row.
 * 
 * Given an integer target, return true if target is in matrix or false otherwise.
 * 
 * You must write a solution in O(log(m * n)) time complexity.
 */

public class Searcha2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {

        final int ROWS = matrix.length, COLS = matrix[0].length;

        int top_r = 0, bottom_r = ROWS - 1, row;

        while(top_r <= bottom_r ) {
            row = (top_r + bottom_r) / 2;
            if(target > matrix[row][COLS - 1]) top_r = row + 1;
            else if(target < matrix[row][0]) bottom_r = row - 1;
            else break;
        }

        if(top_r > bottom_r) return false;

        row = (top_r + bottom_r) / 2;
        int left = 0, rigth = COLS - 1;

        while(left <= rigth) {
            int mid = (left + rigth) / 2;
            if(target == matrix[row][mid]) return true;
            if(target > matrix[row][mid]) left = mid + 1;
            else  if(target < matrix[row][mid]) rigth = mid - 1;
            else break;
        }
        
        return false;
    }

    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][] {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 }
        }, 3));

        System.out.println(searchMatrix(new int[][] {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 }
        }, 13));

        System.out.println(searchMatrix(new int[][] {
                { 1, 1 }
        }, 2));

        System.out.println(searchMatrix(new int[][] { { 1 }, { 3 } }, 4));
        System.out.println(searchMatrix(new int[][] {{1}, {3}, {5}}, 5));

    }
}
