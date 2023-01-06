package HackerRank;

import java.util.Scanner;

public class Stdin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();// if you use nextline() method immediately following the nextint() method,
        // recall that nextint method to read integer tokens;
        // the last newline new line character for that line of integer input is still queued in the
        // input buffer and the next nextline() will be reading the remainder of the integer line which is empty.

        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
