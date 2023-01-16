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
    public static void main(String[] args){
        System.out.println(reverseWords( "the sky is  blue"));
    }
}
