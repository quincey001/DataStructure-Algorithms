package MIcrosoft;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LongestSubString {

    public static int lengthOfLongestSubstring(String s) {
        //pvpeyygbur
        HashSet<Character> helper = new HashSet<Character>();
        int left = 0;
        int right = 0;
        int max = 0;

        while(right < s.length()){
            if(!helper.contains(s.charAt(right))){
                helper.add(s.charAt(right));
                right++;
                max = Math.max(max, helper.size());
            }else{
                helper.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
    public static void main(String[] args){
        String s = "pvpeyygbur";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
