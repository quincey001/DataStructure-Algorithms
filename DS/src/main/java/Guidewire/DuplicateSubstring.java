package Guidewire;

import java.util.Arrays;

public class DuplicateSubstring {
    public String[] findDuplicates(String s){
        char[] charArr = s.toCharArray();
        String[] results = {""};
        char[] characters = new char[26];

        return results;
    }
}
class Median {
    public static double findMedian(int[] array) {
        Arrays.sort(array);
        int length = array.length;
        if (length % 2 == 0) {
            int middle1 = array[length / 2 - 1];
            int middle2 = array[length / 2];
            return (double) (middle1 + middle2) / 2;
        } else {
            return array[length / 2];
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("The median of the array is: " + findMedian(array) );
    }
}