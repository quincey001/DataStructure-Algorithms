package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class leetcode1002 {
    /**
     * Given a string array words, return an array of all characters that show up in all
     * strings within the words(including duplicates). You may return the answer in any order
     * input: words = ["bella","label","roller"]
     * output: ["e","l","l"]
     **/
    public List<String> commonChars(String[] words){
        List<String> result = new ArrayList<>();
        for(char c = 'a'; c <= 'z'; c++){
            int minCount = Integer.MAX_VALUE;// any integer variable cannot store any value beyond this limit
            for(String s : words){
                int wordCount = 0;
                for(char cur_c : s.toCharArray())
                    if(cur_c == c)
                        wordCount++;
                minCount = Math.min(minCount, wordCount);
            }
            for(int i = 0; i < minCount; i++) result.add("" + c);
        }
        return result;
    }
    public static void main(String[] args){
//        List<String> words = new ArrayList<String>();
//        words.add("aaaa");
        /**
         * String[] will always be fixed size, but it's faster than lists.
         * if you stored variables are always the same count, and you consider performace, using String[]\
         * if you don't expect huge mounts of Strings, better chose Lists, they are resizable
         * and part of Collections.
         */
        List<String> words = Stream.of("bella","label","roller").collect(Collectors.toList());
        System.out.println(words);
        String[] word = new String[]{"aabb","labe","abcd"};
        System.out.println(word);
        leetcode1002 l = new leetcode1002();
        System.out.println(l.commonChars(word));
    }
}
