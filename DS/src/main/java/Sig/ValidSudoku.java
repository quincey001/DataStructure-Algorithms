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

                if(board[j][i] != '.' && !columns.add(board[j][i])){
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
    public static boolean isValidSudoku(char[][] board) {
        boolean[][] row=new boolean[9][10];
        boolean[][] col=new boolean[9][10];
        boolean[][] fangge=new boolean[9][10];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char c=board[i][j];
                if(c!='.'){
                    int num=Integer.valueOf(String.valueOf(c));//字符转数字
                    if(row[i][num]||col[j][num]||fangge[i/3*3+j/3][num]){
                        return false;
                    }
                    row[i][num]=true;
                    col[j][num]=true;
                    fangge[i/3*3+j/3][num]=true;//当前是第几个小方格
                }
            }
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
//        System.out.println(isValidSudoku(array));
    }
}
