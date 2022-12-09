package HackerRank;

import java.util.Scanner;

public class StaticMethod {
    /**
     * You are given a class Solution with a main method.
     * Complete the given code so that it outputs the area of a parallelogram with breadth B
     * and height H. You should read the variables from the standard input.
     *
     * If B <= 0 or H <= 0, the output should be "java.lang.Exception: Breadth and height must be positive"
     * without quotes.
     *
     * Input Format
     * There are two lines of input. The first line contains :
     * the breadth of the parallelogram.
     * The next line contains : the height of the parallelogram.
     *
     * Constraints
     *
     * Output Format
     *
     * If both values are greater than zero,
     * then the main method must output the area of the parallelogram.
     * Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
     *
     */
    static Scanner scanner = new Scanner(System.in);
    static int B = scanner.nextInt();
    static int H = scanner.nextInt();
    static  boolean flag;
    static {
        if(B > 0 && H > 0){
            System.out.println(B * H);
        }else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    public static void main(String[] args){

    }

}
