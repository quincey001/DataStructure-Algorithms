package Sig;

import java.util.HashSet;

public class ValidSudoku {
    public static boolean isValid(char[][] board){
        for(int i = 0; i < 9; i++){
            HashSet<Character> rows = new HashSet<>();
            HashSet<Character> columns = new HashSet<>();
            HashSet<Character> cube = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.' && !rows.add(board[i][j])){
                    return false;
                }
                // row    0 0 0 | 3 3 3 | 6 6 6
                int rowIndex = 3*(i/3) + j/3;
                // column 0 3 6 | 0 3 6 | 0 3 6
                int columnIndex = 3*(i%3) + j%3;

                if(board[rowIndex][columnIndex] != '.' && !cube.add(board[rowIndex][columnIndex])){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        char[][] array = {{'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};
        System.out.println(isValid(array));
    }
}
