package HackerRank;
import java.io.*;
public class ConditionalStatements {
    /**
     * Given an integer, , perform the following conditional actions:
     *
     * If  is odd, print Weird
     * If  is even and in the inclusive range of  to , print Not Weird
     * If  is even and in the inclusive range of  to , print Weird
     * If  is even and greater than , print Not Weird
     * Complete the stub code provided in your editor to print whether or not  is weird.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        if(N % 2 != 0){
            System.out.println("Weird");
        }else{
            if(N >= 2 && N <= 5){
                System.out.println("Not Weird");
            }else if(N >= 6 && N <= 20){
                System.out.println("Weird");
            }else if(N > 20){
                System.out.println("Not Weird");
            }
        }


        bufferedReader.close();
    }
}
