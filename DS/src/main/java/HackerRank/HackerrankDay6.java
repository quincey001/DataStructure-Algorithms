package HackerRank;
import java.io.*;
import java.util.*;
public class HackerrankDay6 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        // System.out.println(n);
        String s;
        for(int i = 0; i < n; i++){
            s = sn.next();

            for(int j = 0; j < s.length(); j++){
                if(j%2 == 0){
                    System.out.print(s.charAt(j));
                }
            }

            System.out.print(" ");
            for(int a = 0; a < s.length(); a++){
                if(a%2 == 1){
                    System.out.print(s.charAt(a));
                }
            }
            System.out.print("\n");
        }
    }
    public static void solution() {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        // System.out.println(n);
        String s;
        for(int i = 0; i < n; i++){
            s = sn.next();
            String even = "";
            String odd = "";
            for(int j = 0; j < s.length(); j++){
                if(j%2 == 0){
                    even += s.substring(j, j+1);
                }else if(j%2 == 1){
                    odd += s.substring(j, j+1);
                }
            }

            System.out.print(even + " "+ odd + "\n");
        }
    }
}
