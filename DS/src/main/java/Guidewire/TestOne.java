package Guidewire;

import java.util.HashSet;
import java.util.Set;

public class TestOne {
    /**
     * given an integer n (1<= n <= 100) returns an array containing n unique integers
     * that sum up to 0. the function can return any such array. for example =,
     * given n = 4, the function could return [1,0,-3,2] or [-2,1,-4,5] .
     * The answer [1,-1,1,3] would be incorrect, because value 1 occurs twice.
     */
    public int[] solution(int n) {
        Set<Integer> set = new HashSet<>();
        int[] result = new int[n];
        for (int i = 1; i <= n / 2; i++) {
            set.add(i);
            set.add(-i);
        }
        if (n % 2 != 0) {
            set.add(0);
        }
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        return result;
    }
    /**
     * The function first creates a HashSet called set and an empty array called result
     * of length n. Then it iterates from 1 to n/2 and adds i and -i to the set.
     * If n is an odd number, it also adds 0 to the set. It then uses an enhanced for
     * loop to add all the unique element from the set to the result array and returns
     * the array.
     * This function has a time complexity of O(n) as it iterates through the set once
     * and the result array once. It has a space complexity of O(n) as it creates an array
     * of length n to store the result.
     */
}
