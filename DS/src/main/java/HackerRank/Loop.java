package HackerRank;
import java.util.*;
import java.io.*;

public class Loop {
    /**
     * return (a + 2^0 * b), (a + 2^0 * b + 2^1 * b), (a + 2^0 * b + 2^1 * b +.....+ 2^n * b)
     */
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            String result = "";
            for(int j = 0; j < n; j ++){
                result += oneTimeSum(a, b, j) + " ";
            }

            System.out.println(result);
        }

        in.close();
    }
    public static int oneTimeSum(int a, int b, int n){
        int num = 0;
        for(int i = n; i >= 0; i--){
            num += Math.pow(2, i) * b;
        }
        return a + num;
    }
}
