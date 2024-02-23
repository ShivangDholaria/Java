package LeetCode;

import java.util.HashSet;
import java.util.Set;

/*
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 * Note:
 *      A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 *      Only the filled cells need to be validated according to the mentioned rules.
 */

public class ValidSudoku {

    //1st sol - Using HashSet
    public static boolean isValidSudoku_1(char[][] board) {
        //Creating set of character for the board
        Set<Character> row = null;                  
        Set<Character> col = null;
        
        //Populating the sets
        for (int i = 0; i < 9; i++) {
            row = new HashSet<>();
            col = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                char r = board[i][j], c = board[j][i];
                if(r != '.') {
                    if(row.contains(r))
                        return false;
                    else
                        row.add(r);
                }
                if(c != '.') {
                    if(col.contains(c))
                        return false;
                    else    
                        col.add(c);
                }
            }
        }

        //Checking for duplicate digit in  
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if(!checkblock(i, j, board))
                    return false;
            }
        }

        return true;
    }

    public static boolean checkblock(int i, int j, char[][] board) {
        Set<Character> block = new HashSet<>();

        int row = i + 3, col = j + 3;

        for (int k = i; k < row; k++) {
            for (int k2 = j; k2 < col; k2++) {
                if(board[k][k2] == '.') continue;
                if(block.contains(board[k][k2])) return false;
                block.add(board[k][k2]);
            }
        }
        return true;
    } 

    //2nd Sol - Using Arrays
    public static boolean isValidSudoku_2(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] square = new boolean[9][9];

        // iterate once
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                int val = board[i][j] - '1';
                if (row[i][val]) {
                    return false;
                } else {
                    row[i][val] = true;
                }
                if (col[j][val]) {
                    return false;
                } else {
                    col[j][val] = true;
                }
                if (square[(int)(i/3)*3+(int)(j/3)][val]) {
                    return false;
                } else {
                    square[(int)(i/3)*3+(int)(j/3)][val] = true;
                }
            }
        }
        return true;
    }
    

    public static void main(String[] args) {
        char[][] board1 = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        
        System.out.println(isValidSudoku_2(board1));
    }
}
