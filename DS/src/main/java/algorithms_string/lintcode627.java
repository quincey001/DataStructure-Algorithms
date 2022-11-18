package algorithms_string;

public class lintcode627 {
    /**
     * longest palindrome(a sequence that reads the same backwards as forwards)
     * Gives a string containing upper and lower case letters.
     * Find the length of the longest palindrome composed of these letters.
     *
     * The data is case-sensitive, that is, "Aa" is not considered a palindrome.
     */
    static int longestPalindrome(String s ){
        // write your code here
        int[] count = new int[128];
        int length = s.length();
        for (int i = 0; i < length; ++i) {
            char c = s.charAt(i);
            count[c]++;
        }

        int ans = 0;
        for (int v: count) {
            ans += v / 2 * 2;
            if (v % 2 == 1 && ans % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
        System.out.println(1/2);
    }
}
