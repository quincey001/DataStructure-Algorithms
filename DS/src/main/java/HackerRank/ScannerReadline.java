package HackerRank;

import java.util.Scanner;

public class ScannerReadline {
    /**
     * The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.
     *
     * Hint: Java's Scanner.hasNext() method is helpful for this problem.
     *
     * Sample Input
     *
     * Hello world
     * I am a file
     * Read me until end-of-file.
     * Sample Output
     *
     * 1 Hello world
     * 2 I am a file
     * 3 Read me until end-of-file.
     */
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while(scanner.hasNext()){
            String s = scanner.nextLine();
            i++;
            System.out.printf("%d %s%n", i, s);
        }
    }
}
