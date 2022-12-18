package HackerRank;
import java.io.*;
import java.math.*;
public class HackerrankDay10 {
    /**
     * Example
     * n = 125
     * The binary representation 125 is 1111101. In base 10,
     * there are 5 and 1 consecutive ones in two groups.
     * Print the maximum 5.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String binaryNumber = Integer.toBinaryString(n);
        char[] binarylist = binaryNumber.toCharArray();

        // 1011
        int max = 0;
        int counter = 0;
        for(int i = 0; i < binarylist.length; i++){
            if(binarylist[i] == '1'){
                counter++;
            }else{
                counter = 0;
            }
            max = Math.max(max, counter);
        }

        System.out.print(max);
        bufferedReader.close();
    }
}
