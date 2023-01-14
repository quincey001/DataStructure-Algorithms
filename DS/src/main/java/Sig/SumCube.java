package Sig;

public class SumCube {
    public static int sumThreeToThree(int[][] array){
        int sum = 0;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                int row = 3*(i/3) + j/3;
                int col = 3*(i%3) + j%3;
                sum += array[row][col];
            }
        }
        return sum/9;
    }
    public static void main(String[] args){
        int[][] arr = {{1,2,3,4,5,6,7,8,9},
                       {1,2,3,4,5,6,7,8,9},
                       {1,2,3,4,5,6,7,8,9},
                        {1,2,3,4,5,6,7,8,9},
                        {1,2,3,4,5,6,7,8,9},
                        {1,2,3,4,5,6,7,8,9},
                        {1,2,3,4,5,6,7,8,9},
                        {1,2,3,4,5,6,7,8,9},
                        {1,2,3,4,5,6,7,8,9}
                      };
        System.out.println(sumThreeToThree(arr));
    }
}
