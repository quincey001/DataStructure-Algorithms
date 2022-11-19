package data_structure.stack;

public class ReverseWord {
    private StringBuffer Reverse1(StringBuffer s){
        Stack stack = new Stack(s.length());
        for(int i = 0; i < s.length(); i++){
            stack.push(s.charAt(i));
        }
        for(int i = 0; i < s.length(); i++){
            char a = (char) stack.pop();
            s.setCharAt(i, a);
        }
        return s;
    }
    public static void main(String[] args){
        ReverseWord rw = new ReverseWord();
        StringBuffer str = new StringBuffer("abcdefghijk");
        System.out.println(rw.Reverse1(str));
    }
}
