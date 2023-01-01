package HackerRank;

public class RemoveSubstring {
    static void remove(String str, String word){
        String msg[] = str.split(" ");
        String new_str = "";
        for(String words: msg){
            if(!words.equals(word)){
                new_str += words + " ";
            }
        }
        System.out.println(new_str);
    }
    public static void main(String[] args){
        String str = "This is a BANANA";
        String word = "BANANA";
        remove(str, word);
    }
}
