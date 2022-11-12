package algorithms;

public class lintcode13 {
    /**
     * For a given source string and a target string,
     * you should find the first position (0-based) in the source string
     * where the target string occurs. Returns -1 if not present.
     * source = "abcdabcdefg"
     * target = "bcd"
     * output: 1
     */
    public int strStr(String source, String target) {
        // Write your code here
        int slen = source.length(), tlen = target.length();
        char[] s = source.toCharArray(), t = target.toCharArray();
        for(int i = 0; i <= slen - tlen; i++ ){
            int m = i, n = 0;
            while(n < tlen && s[m] == t[n]){
                m++;
                n++;
            }
            if(n == tlen){
                return i;
            }
        }
        return -1;
    }
}
