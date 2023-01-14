package Sig;

import java.util.HashSet;

public class IsValidSudoku {
    public static boolean isValid(char[][] board){
        HashSet<String> seen = new HashSet<>();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char current_val = board[i][j];
                if(current_val != '.'){
                    if(!seen.add(current_val + "found in row" + i) ||
                       !seen.add(current_val + "found in column" + j) ||
                       !seen.add(current_val + "found in sub box" + i/3 + "-" + j/3)){
                        return false;
                    }
                }
            }
        }
        for(String s : seen){
            System.out.println(s);
        }
        return true;
    }
    public static void main(String[] args){
        char[][] array =
                {{'5','3','.','.','7','.','.','.','.'},
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
