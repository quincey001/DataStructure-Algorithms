package HackerRank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Loopone {
    /**
     * 3 x 1 = 3
     * 3 x 2 = 6
     * 3 x 3 = 9
     * 3 x 4 = 12
     * 3 x 5 = 15
     * 3 x 6 = 18
     * 3 x 7 = 21
     * 3 x 8 = 24
     * 3 x 9 = 27
     * 3 x 10 = 30
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i = 1; i <= 10; i++){
            int sum = n*i;
            System.out.printf("%d x %d = %d%n", n, i, sum);
        }
        bufferedReader.close();
    }
}
