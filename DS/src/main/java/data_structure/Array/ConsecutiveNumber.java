package data_structure.Array;

import java.util.Scanner;

public class ConsecutiveNumber {
    /**
     * convert a base 10 number into binary number
     * [1,0,1,1,1,1,0,0,0,0,0,0,1,1,1]
     * print the maximum consecutive number one
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // convert int number into binary string
        String binaryNumber = Integer.toBinaryString(n);
        // make the binary string into a char array
        char[] binaryArray = binaryNumber.toCharArray();
        // using a counter to take the number of consecutive number
        int count = 0;
        int max = 0; // to take the maximum count
        for(int i = 0; i < binaryArray.length; i++){
            if(binaryArray[i] == '1'){
                count++;
            }else{
                count = 0;
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
