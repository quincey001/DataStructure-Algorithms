package Guidewire;

import java.util.Arrays;

public class TestTwo {
    /**
     * you are given a string S, Deletion of the K-th letter of S costs C[K]. after deleting
     * a letter, the costs of deleting other letters do not change. For example, for S='ab'
     * and C=[1,3], after deleting 'a', deletion of 'b' will still cost 3. you want to delete
     * some letters from S to obtain a string without two identical letters next to each other.
     * what is the minimum total cost of deletions to achieve such a string? write a function
     * that given string S and array C of integers, both of length N, returns the minimum
     * cost of all necessary deletions. given S='abccbd' and C=[0,1,2,3,4,5],
     * the functions should return 2. you can delete the first occurrence of 'c' to achieve
     * 'abcbd'.
     * give S='aaaa' and C=[3,4,5,6] the function should return 12.
     * you need to delete all but on letter 'a' and the lowest cost of deletions is 3+4+5=12.
     *
     */
    public int solution(String S, int[] C) {
        // string s = 'abccdb' C = [0,1,2,3,4,5]
        int n = S.length();
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            if (S.charAt(i) == S.charAt(i - 1)) {
                dp[i] = dp[i - 1] + C[i];
            } else {
                dp[i] = dp[i - 1];
            }
            dp[i] = Math.min(dp[i], dp[i-1] + C[i-1]);
        }
        return dp[n-1];
    }
    /**
     * The solution uses dynamic programming to solve this problem. It creates an array dp
     * of length n, where dp[i] represents the minimum total cost of deletions needed to
     * obtain a string without two identical letters next to each other by only considering
     * the first i+1 letters of the string S.
     * The function starts by initializing the dp[0] with 0, and then it iterates through
     * the string S, for each i it checks if the current letter is the same as the previous
     * one,
     * if it is the same, it takes the minimum total cost of deletions needed to obtain
     * a string without two identical letters next to each other by only considering the
     * first i letters of the string S and adding the cost of deletion of i-th letter.
     * If not, it just takes the minimum total cost of deletions needed to obtain a string
     * without two identical letters next to each other by only considering the first i
     * letters of the string S.
     * Also, it considers the case where the current element and the previous element are
     * different, in that case it takes the minimum total cost of deletions needed to obtain
     * a string without two identical letters next to each other by only considering the
     * first i-1 letters of the string S and adding
     */
    public static int minDeletionCost(String s, int[] c){
        int total_cost = 0;
        int n = s.length();
        for(int i = 0; i < n - 1; i++){
            int min_cost = 0;
            if(s.charAt(i) == s.charAt(i+1)){
                 min_cost = Math.min(c[i], c[i+1]);
            }
            total_cost += min_cost;
        }
        return  total_cost;
    }

    public static void main(String[] args) {
        int[] c = {0,1,2,3,4,5};
        System.out.println(minDeletionCost("aaaaaa", c));
    }
}
