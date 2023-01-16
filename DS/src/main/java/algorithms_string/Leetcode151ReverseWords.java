package algorithms_string;

public class Leetcode151ReverseWords {
    public static String reverseWords(String s) {
        String[] stringArr = s.split(" ");
        String newStr = "";
        int index = stringArr.length - 1;
        while(index >= 0){
            System.out.println(stringArr[index]);
            if(stringArr[index] != ""){
                newStr += " " + stringArr[index];
            }
            index --;
        }
        return newStr.trim();
    }
    //12 ms
    public static String reverseWord(String s) {
        String[] stringArr = s.split(" +");//split the string by " " or multiple " "
        String newStr = "";
        int index = stringArr.length - 1;
        while(index >= 0){
            newStr += " " + stringArr[index];
            index --;
        }
        return newStr.trim();
    }
    // 7 ms
    public static String reverseWords2(String s) {
        String[] words = s.split(" +");
        StringBuilder sb = new StringBuilder();// string builder is faster
        int index = words.length - 1;
        while(index >= 0){
            sb.append(words[index]);
            sb.append(" ");
            index--;
        }
        return sb.toString().trim();
    }
    public static void main(String[] args){
        System.out.println(reverseWords( "the sky is  blue"));
    }
}
